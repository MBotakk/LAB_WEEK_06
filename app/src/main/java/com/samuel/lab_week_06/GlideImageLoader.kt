package com.samuel.lab_week_06

import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * An implementation of our ImageLoader interface that uses the Glide library.
 * It gets the context it needs directly from the ImageView.
 */
class GlideImageLoader : ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .centerCrop() // Good for making images fill the view nicely
            // .placeholder(R.drawable.your_placeholder) // Optional: show while loading
            // .error(R.drawable.your_error_image)       // Optional: show if loading fails
            .into(imageView)
    }
}
