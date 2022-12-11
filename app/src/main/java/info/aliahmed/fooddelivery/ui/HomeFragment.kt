package info.aliahmed.fooddelivery.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import info.aliahmed.fooddelivery.R
import info.aliahmed.fooddelivery.databinding.FragmentHomeBinding
import info.aliahmed.fooddelivery.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    companion object {
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    override fun inflateBinding(inflater: LayoutInflater): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater)
    }
}