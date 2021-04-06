package com.example.saira_000.tripasapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_create_trip.*
import kotlinx.android.synthetic.main.fragment_trip_details.*

class CreateTrip : Fragment(R.layout.fragment_create_trip),RVAdapter.RVOnItemClickListner {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        fab.setOnClickListener {
            findNavController().navigate(R.id.action_createTrip_to_tripDetails2)
        }


        var trips: List<Trip> = listOf(Trip("Lagos", "Abuja"),
                Trip("Kenya", "Abuja"),
                Trip("London", "Uyo"),
                Trip("Los Angeles", "Asaba"),
                Trip("Uk", "Awka"),
                Trip("Lagos", "Abuja"),
                Trip("Lagos", "Abuja"),
                Trip("Lagos", "Abuja"),
                Trip("Lagos", "Abuja"))
        rv1.adapter = RVAdapter(trips, this)
    }

    override fun showMenu(view: View, trip: Trip) {
        TODO("Not yet implemented")
    }
}