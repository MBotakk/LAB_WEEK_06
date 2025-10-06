package com.samuel.lab_week_06

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.samuel.lab_week_06.model.CatBreed
import com.samuel.lab_week_06.model.CatModel
import com.samuel.lab_week_06.model.Gender

class MainActivity : AppCompatActivity() {

    private val recyclerView: RecyclerView by lazy { findViewById(R.id.recycler_view) }

    // Create the adapter by passing the layout inflater and our GlideImageLoader.
    // This is much simpler now because the adapter handles its own clicks.
    private val catAdapter by lazy {
        CatAdapter(layoutInflater, GlideImageLoader())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup RecyclerView
        recyclerView.adapter = catAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set the data for the adapter
        catAdapter.setData(getCatData())
    }

    private fun getCatData(): List<CatModel> {
        return listOf(
            CatModel(
                gender = Gender.Male,
                breed = CatBreed.BalineseJavanese,
                name = "Fred",
                biography = "Silent and deadly.",
                imageUrl = "https://cdn2.thecatapi.com/images/7dj.jpg"
            ),
            CatModel(
                gender = Gender.Female,
                breed = CatBreed.ExoticShorthair,
                name = "Wilma",
                biography = "Cuddly assassin.",
                imageUrl = "https://cdn2.thecatapi.com/images/egv.jpg"
            ),
            CatModel(
                gender = Gender.Unknown,
                breed = CatBreed.AmericanCurl,
                name = "Curious George",
                biography = "Award winning investigator.",
                imageUrl = "https://cdn2.thecatapi.com/images/bar.jpg"
            )
        )
    }
}
