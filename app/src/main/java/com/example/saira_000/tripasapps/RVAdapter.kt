package com.example.saira_000.tripasapps

import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val trips:List<Trip>, val listener:RVOnItemClickListner): RecyclerView.Adapter<RVAdapter.RVViewholder>(){
    inner class RVViewholder(item:View):RecyclerView.ViewHolder(item),View.OnClickListener{
     private  val rvMenu:ImageView = item.findViewById(R.id.dots)
       init {
           rvMenu.setOnClickListener {listener}
       }

        override fun onClick(v: View?) {
            if (adapterPosition != RecyclerView.NO_POSITION)
                listener.showMenu(rvMenu,trips[adapterPosition])
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVViewholder {
        var layout= LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return RVViewholder(layout)
    }

    override fun onBindViewHolder(holder: RVViewholder, position: Int) {

    }
    interface RVOnItemClickListner{
        fun showMenu(view: View, trip:Trip)
    }

    override fun getItemCount(): Int {
        return trips.size
    }

    private fun showMenu(view: View) {

        val popupMenu = PopupMenu(view.context, view)
        popupMenu.inflate(R.menu.menu_items)
        popupMenu.gravity = Gravity.CENTER

        popupMenu.show()

        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.delete -> {
                    Toast.makeText(view.context, "Delete", Toast.LENGTH_SHORT).show()
                }
                R.id.update -> {

                    Toast.makeText(view.context, "Update", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

}