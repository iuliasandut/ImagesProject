package com.lunathemes.imagesproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lunathemes.imagesproject.adapter.RvAdapter
import com.lunathemes.imagesproject.model.ImagesDb
import com.squareup.picasso.Picasso
import okhttp3.internal.platform.Platform.Companion.get


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(this, 3)

        recyclerView.adapter = RvAdapter(this, ImagesDb.getImagesDb())
        recyclerView.setHasFixedSize(true)
    }



    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.home_button_toolbar -> {
            true
        }

        R.id.home_button_toolbar -> {

            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
