package com.satyajit.testproject

import android.content.Context
import android.os.Build
import android.widget.ProgressBar
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class RectangleProgressBar(context: Context) : ProgressBar(context) {

    init {
        progressDrawable = context.getDrawable(R.drawable.progress_drawable)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(measuredWidth, measuredWidth)
    }
}