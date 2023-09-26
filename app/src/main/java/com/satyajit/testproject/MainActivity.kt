package com.satyajit.testproject

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.satyajit.testproject.loader.LoaderChip

private lateinit var card: ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clikcVieww = findViewById<LoaderChip>(R.id.click_View)

    }


    fun setAnimation(view: View) {
        val animDrawable = AnimationDrawable()
        animDrawable.isOneShot = false  //Is set false make animation run infinitely

        val gradient = GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM,
            intArrayOf(
                Color.parseColor("#E6BC46"),
                Color.parseColor("#DB9124"),
                Color.parseColor("#E6BC46"),
            )
        )

        val gradient2 = GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM,
            intArrayOf(
                Color.parseColor("#DB9124"),
                Color.parseColor("#E6BC46"),
                Color.parseColor("#DB9124"),
            )
        )

        val gradient3 = GradientDrawable(
            GradientDrawable.Orientation.BOTTOM_TOP,
            intArrayOf(
                Color.parseColor("#E6BC46"),
                Color.parseColor("#DB9124"),
                Color.parseColor("#DB9124"),
            )
        )

        animDrawable.addFrame(gradient, 500) // Added gradientDrawable to animDrawable
        animDrawable.addFrame(gradient2, 500)
        animDrawable.addFrame(gradient3, 500)

        animDrawable.apply {  //To make it more smooth setting enter fade duration and exit fade duration
            setEnterFadeDuration(300)
            setExitFadeDuration(300)
        }

        view.setBackgroundDrawable(animDrawable) //set animDrawable to linearLayouot background
        animDrawable.start()
    }


}