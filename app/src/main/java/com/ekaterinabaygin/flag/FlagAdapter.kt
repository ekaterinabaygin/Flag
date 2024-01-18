package com.ekaterinabaygin.flag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FlagAdapter(private val countries: List<Country>) :
    RecyclerView.Adapter<FlagAdapter.FlagViewHolder>() {

    class FlagViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.flagImageView)
        val textView: TextView = view.findViewById(R.id.countryNameTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlagViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_country, parent, false
        )
        return FlagViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlagViewHolder, position: Int) {
        val country = countries[position]
        loadFlag(country.code, holder.imageView)
        holder.textView.text = country.name
    }

    private fun loadFlag(countryCode: String, imageView: ImageView) {
        val imageUrl = "https://flagcdn.com/192x144/$countryCode.png"
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }


    override fun getItemCount() = countries.size
}
