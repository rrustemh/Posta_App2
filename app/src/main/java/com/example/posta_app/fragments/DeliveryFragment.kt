package com.example.posta_app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.posta_app.R
import com.example.posta_app.data.DeliveryItem
import com.example.posta_app.databinding.FragmentDeliveryBinding
import com.example.posta_app.viewModels.DeliveryViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DeliveryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DeliveryFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var deliveryViewModel: DeliveryViewModel
    private var _binding: FragmentDeliveryBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onResume() {
        super.onResume()
        val cities = resources.getStringArray(R.array.cities)
        var arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_layout, cities)
        binding.cityInput.setAdapter(arrayAdapter)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDeliveryBinding.inflate(inflater, container, false)
        deliveryViewModel = ViewModelProvider(this).get(DeliveryViewModel::class.java)
        binding.addDelivery.setOnClickListener {
            AddDelivery()
        }
        return binding.root
    }
    private fun AddDelivery(){
        val recieverName = binding.nameInput.text.toString()
        val address = "Rr. bahri kuci nr. 170"
        val city = binding.cityInput.text.toString()
        val phoneNumber = binding.phoneNumberInput.text.toString()
        val senderId = 10
        val deliveryStatus = "Registered"
        val delivery = DeliveryItem(0, recieverName,address, city, phoneNumber, deliveryStatus, senderId)
        deliveryViewModel.addDelivery(delivery)
        Toast.makeText(context, "Succesfully added the delivery", Toast.LENGTH_LONG).show()
        findNavController().navigate(R.id.dashboardFragment)
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DeliveryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DeliveryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}