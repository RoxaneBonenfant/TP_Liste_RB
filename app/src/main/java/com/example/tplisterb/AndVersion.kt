package com.example.tplisterb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_and_version.view.*

data class AndVersion (var name: String, var img:Int){
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindAndVersion(andVersion: AndVersion) {
            with(andVersion) {
                itemView.andVersionTxt.text = "$name"
            }
    }
    }
}
