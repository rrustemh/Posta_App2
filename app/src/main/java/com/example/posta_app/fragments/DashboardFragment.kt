package com.example.posta_app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.posta_app.data.DeliveryItem
import com.example.posta_app.adapters.DeliveryAdapter
import com.example.posta_app.databinding.FragmentDashboardBinding
import com.example.posta_app.viewModels.DeliveryViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment(), DeliveryAdapter.OnItemClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var deliveryViewModel: DeliveryViewModel
    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!
    private var list: List<DeliveryItem> = getList()
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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        deliveryViewModel = ViewModelProvider(this).get(DeliveryViewModel::class.java)
        val adapter = DeliveryAdapter(this)
        binding.deliveriesRecyclerView.adapter = adapter
        binding.deliveriesRecyclerView.layoutManager = LinearLayoutManager(binding.root.context)
        binding.deliveriesRecyclerView.setHasFixedSize(true)
        deliveryViewModel.allDeliveries.observe(viewLifecycleOwner, Observer {
            delivery -> adapter.setDeliveries(delivery)
        })
        return binding.root
    }
    fun getList():List<DeliveryItem> {
        val list = ArrayList<DeliveryItem>()
        val item1 = DeliveryItem(1, "Rrustem Hyseni","Vushtrri Rr. Bahri Kuci Nr. 170", "Prishtine", "049758874", "Registered", 10)
        val item2 = DeliveryItem(2, "Ida Spahiu", "Prizren Rr. Mbreteresha Teute Nr. 123", "Prishtine", "49123456", "Registered", 10)
        list += item1
        list += item2
        list += item1
        list += item2
        list += item1
        list += item2
        return list
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DashboardFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DashboardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun OnItemClick(position: Int) {
        val action = DashboardFragmentDirections.actionDashboardFragmentToDeliveryDetailsFragment("1", list[position].recieverName)
        findNavController().navigate(action)
    }
}