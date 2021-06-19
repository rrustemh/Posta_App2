package com.example.posta_app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.posta_app.DeliveryItem
import com.example.posta_app.R
import com.example.posta_app.adapters.DeliveryAdapter
import com.example.posta_app.databinding.FragmentDashboardBinding
import com.example.posta_app.databinding.FragmentDeliveryBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DashboardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var _binding: FragmentDashboardBinding? = null
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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        binding.deliveriesRecyclerView.adapter = DeliveryAdapter(getList())
        binding.deliveriesRecyclerView.layoutManager = LinearLayoutManager(binding.root.context)
        binding.deliveriesRecyclerView.setHasFixedSize(true)
        return binding.root
    }
    fun getList():List<DeliveryItem> {
        val list = ArrayList<DeliveryItem>()
        val item1 = DeliveryItem(1, "Rrustem Hyseni","Vushtrri Rr. Bahri Kuci Nr. 170", "049758874")
        val item2 = DeliveryItem(2, "Ida Spahiu", "Prizren Rr. Mbreteresha Teute Nr. 123", "049123456")
        val item3 = DeliveryItem(5, "Xhanan Shehu", "Rahovec Rr. Shehu Nr. 124", "045654234")
        list += item1
        list += item2
        list += item3
        list += item1
        list += item2
        list += item3
        list += item1
        list += item2
        list += item3
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
}