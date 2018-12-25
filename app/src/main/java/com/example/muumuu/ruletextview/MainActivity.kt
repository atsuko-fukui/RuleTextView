package com.example.muumuu.ruletextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.RelativeSizeSpan
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spannableString = SpannableStringBuilder(getString(R.string.long_text)).apply {
            setSpan(RelativeSizeSpan(4f), 101, 106, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
        }
        textView.text = spannableString
    }
}
