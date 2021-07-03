package com.example.stanrageapp.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.stanrageapp.R
import com.example.stanrageapp.base.BaseFragment
import com.example.stanrageapp.databinding.FragmentNotificationsBinding
import com.skydoves.powerspinner.IconSpinnerAdapter
import com.skydoves.powerspinner.IconSpinnerItem
import com.skydoves.powerspinner.SpinnerAnimation

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding>(FragmentNotificationsBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinnerView()
    }

    private fun spinnerView() {
        SpinnerAnimation.FADE

        binding.apply {
            val adapter = IconSpinnerAdapter(spinner)
            spinner.setSpinnerAdapter(adapter)
            spinner.getSpinnerRecyclerView().layoutManager = GridLayoutManager(context, 2)

        }

        binding.spinner.apply {
            setSpinnerAdapter(IconSpinnerAdapter(this))
            setItems(
                arrayListOf(
                    IconSpinnerItem(text = "30", iconRes = R.drawable.ic_baseline_adjust_24),
                    IconSpinnerItem(text = "60", iconRes = R.drawable.ic_baseline_adjust_24),
                    IconSpinnerItem(text = "90", iconRes = R.drawable.ic_baseline_adjust_24)))
            getSpinnerRecyclerView().layoutManager = GridLayoutManager(context, 1)
            selectItemByIndex(0)
            lifecycleOwner = activity
        }

    }
}