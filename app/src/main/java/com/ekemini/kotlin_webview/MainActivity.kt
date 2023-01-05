package com.ekemini.kotlin_webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wb_webView.apply {
            loadUrl("https://www.google.com")
            settings.javaScriptEnabled = true
        }

    }

    override fun onBackPressed() {
        if (wb_webView.canGoBack()) wb_webView.goBack() else super.onBackPressed()
    }


}