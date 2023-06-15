package com.example.firebaseApp3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firebaseapp3.R

import com.example.firebaseapp3.databinding.ItemViewBinding
import com.example.firebaseApp3.models.Fruit

class MyRecyclerViewAdapter(val fruitList: MutableList<Fruit>) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    var onClick : ((Fruit) -> Unit)? = null

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val binding = ItemViewBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.binding.apply {
            fruitNameTV.text = fruitList[position].fruitName
            fruitDescriptionTV.text = fruitList[position].fruitDescription
        }
        holder.itemView.setOnClickListener {
            onClick?.invoke(Fruit(fruitList[position].fruitName,fruitList[position].fruitDescription))
        }
    }

    override fun getItemCount() = fruitList.size
}