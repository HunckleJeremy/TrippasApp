package com.example.saira_000.tripasapps

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_trip_details.*

class TripDetails : Fragment(R.layout.fragment_trip_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        linlayout.setOnClickListener {
            showMenu(it)
        }

        tripBar.setNavigationOnClickListener { findNavController().navigateUp() }
    }

    private fun showMenu(view: View) {

        val popupMenu = PopupMenu(view.context, view)
        popupMenu.inflate(R.menu.spinner)
        popupMenu.gravity = Gravity.CENTER

        popupMenu.show()

        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.bus -> {
                    triptype.text = it.title
                }
                R.id.edu -> {
                    triptype.text = it.title
                }
                R.id.vac -> {
                    triptype.text = it.title
                }
                R.id.ple -> {
                    triptype.text = it.title
                }
            }
            true
        }
    }
}