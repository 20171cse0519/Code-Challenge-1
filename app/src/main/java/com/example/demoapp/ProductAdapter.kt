package com.example.demoapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.databinding.ListItemBinding

class ProductAdapter(private val context: Context, val productList: List<Products>): RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductAdapter.MyViewHolder, position: Int) {
        val prod = productList[position]
        holder.setData(prod, position)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class MyViewHolder(val itemBinding: ListItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        var currentProduct: Products? = null
        var currentPosition: Int = 0

        init {
            itemBinding.txvTitle.setOnClickListener {
                Toast.makeText(context, currentProduct!!.name + " Clicked !", Toast.LENGTH_SHORT)
                    .show()
                val msg = currentProduct!!.data
                val intent = Intent(context,SecondActivity::class.java)
                intent.putExtra("prod_desc",msg)
                context.startActivity(intent)

            }
            itemBinding.imgShare.setOnClickListener {

                val message: String = "Product: " + currentProduct!!.name

                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent, "Please select app: "))
            }


        }

        fun setData(prod: Products?, pos: Int) {
            itemBinding.txvTitle.text = prod!!.name
            this.currentProduct = prod
            this.currentPosition = pos


        }



    }


}