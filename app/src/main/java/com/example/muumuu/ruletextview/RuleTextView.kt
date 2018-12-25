package com.example.muumuu.ruletextview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.TextView

class RuleTextView(context: Context, attrs: AttributeSet? = null) : TextView(context, attrs) {

    private val paint = Paint()

    override fun onDraw(canvas: Canvas?) {
        var count = 0
        var v = 0
        do {
            v = if (count < lineCount) {
                layout.getLineBaseline(count)
            } else {
                v + layout.getLineBaseline(0)
            }
            canvas?.drawLine(
                    0.toFloat(), v.toFloat(), width.toFloat(), v.toFloat(), paint)
            count ++
        } while (v < height)
        super.onDraw(canvas)
    }
}