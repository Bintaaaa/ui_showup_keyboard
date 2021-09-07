package com.example.submission_android_pemula.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission_android_pemula.R
import com.example.submission_android_pemula.data.Keyboard
import com.example.submission_android_pemula.model.KeyboardData

class KeyboardAdapter(private var list: ArrayList<Keyboard>): RecyclerView.Adapter<KeyboardAdapter.KeyboardViewHolder>() {
    inner class KeyboardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.tv_title)
        val ivImage: ImageView = itemView.findViewById(R.id.iv_keyboard)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_price)
        val tvCompany: TextView = itemView.findViewById(R.id.tv_company)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyboardViewHolder {
        val viewItemKey: View = LayoutInflater.from(parent.context).inflate(R.layout.item_keyboard,parent,false)
        return KeyboardViewHolder(viewItemKey)
    }

    override fun onBindViewHolder(holder: KeyboardViewHolder, position: Int) {
        val keyboard = list[position]

        holder.tvTitle.text = keyboard.title
        holder.tvPrice.text = keyboard.price
        holder.tvCompany.text = keyboard.company

        Glide.with(holder.itemView.context)
            .load(keyboard.image)
            .apply(RequestOptions().override(132,102))
            .into(holder.ivImage)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}