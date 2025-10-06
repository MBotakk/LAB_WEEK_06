package com.samuel.lab_week_06

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.samuel.lab_week_06.model.CatBreed
import com.samuel.lab_week_06.model.CatModel
import com.samuel.lab_week_06.model.Gender

class MainActivity : AppCompatActivity() {

    private val recyclerView: RecyclerView by lazy { findViewById(R.id.recycler_view) }

    private val catAdapter by lazy {
        CatAdapter(layoutInflater, GlideImageLoader())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = catAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemTouchHelper = ItemTouchHelper(catAdapter.getSwipeCallback())
        itemTouchHelper.attachToRecyclerView(recyclerView)

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
            ),
            CatModel(
                gender = Gender.Male,
                breed = CatBreed.BalineseJavanese,
                name = "Leo",
                biography = "King of the living room jungle.",
                imageUrl = "https://cdn2.thecatapi.com/images/c4h.jpg"
            ),
            CatModel(
                gender = Gender.Female,
                breed = CatBreed.BalineseJavanese,
                name = "Luna",
                biography = "Enjoys staring contests and midnight zoomies.",
                imageUrl = "https://cdn2.thecatapi.com/images/4TN-Zl2-h.jpg"
            ),
            CatModel(
                gender = Gender.Male,
                breed = CatBreed.ExoticShorthair,
                name = "Milo",
                biography = "A foodie and a professional napper.",
                imageUrl = "https://cdn2.thecatapi.com/images/j6.jpg"
            ),
            CatModel(
                gender = Gender.Female,
                breed = CatBreed.AmericanCurl,
                name = "Chloe",
                biography = "Elegant, sophisticated, and loves knocking things off tables.",
                imageUrl = "https://cdn2.thecatapi.com/images/aax.jpg"
            ),
            CatModel(
                gender = Gender.Male,
                breed = CatBreed.ExoticShorthair,
                name = "Simba",
                biography = "Believes every box is his new kingdom.",
                imageUrl = "https://cdn2.thecatapi.com/images/b29.jpg"
            ),
            CatModel(
                gender = Gender.Female,
                breed = CatBreed.BalineseJavanese,
                name = "Daisy",
                biography = "Loves chasing sunbeams and chirping at birds.",
                imageUrl = "https://cdn2.thecatapi.com/images/bnt.jpg"
            ),
            CatModel(
                gender = Gender.Male,
                breed = CatBreed.ExoticShorthair,
                name = "Ollie",
                biography = "A bit clumsy, but has a heart of gold.",
                imageUrl = "https://cdn2.thecatapi.com/images/dn9.jpg"
            )
        )
    }
}
