package com.lunathemes.imagesproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lunathemes.imagesproject.R
import com.lunathemes.imagesproject.model.ImagesDb
import com.squareup.picasso.Picasso

class RvAdapter(
    private val context: Context,
    private val database: Array<ImagesDb>
): RecyclerView.Adapter<RvAdapter.RvViewHolder>(){
    class RvViewHolder(private val view: View): RecyclerView.ViewHolder(view){

        var photoImageView: ImageView = itemView.findViewById(R.id.image_grid_id)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {

         val inflater = LayoutInflater.from(context)
         val photoView = inflater.inflate(R.layout.image_grid, parent, false)
         return RvViewHolder(photoView)
    }


    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
      val item = database[position]
        val imageView = holder.photoImageView
        Glide.with(context)
            .load(ImagesDb.getImagesDb())
            .into(imageView)


        holder.photoImageView.setOnClickListener(View.OnClickListener {

            //OnClick pe imagine
        })
    }

    override fun getItemCount() = database.size
    }


