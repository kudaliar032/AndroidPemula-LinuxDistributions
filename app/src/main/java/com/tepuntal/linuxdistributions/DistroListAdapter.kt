package com.tepuntal.linuxdistributions

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DistroListAdapter(val listDistro: ArrayList<Distro>): RecyclerView.Adapter<DistroListAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_distro, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDistro.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, version, logo) = listDistro[position]

        Glide.with(holder.itemView.context)
            .load(logo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgLogo)

        holder.tvName.text = name
        holder.tvVersion.text = version

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listDistro[holder.adapterPosition])
        }
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvVersion: TextView = itemView.findViewById(R.id.tv_item_version)
        var imgLogo: ImageView = itemView.findViewById(R.id.img_item_logo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Distro)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
}