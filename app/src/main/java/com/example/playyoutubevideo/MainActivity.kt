package com.example.playyoutubevideo

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        loadVideo(webView)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun loadVideo(webView: WebView) {

        val videoUrl = "https://www.youtube.com/embed/5jJ-e278BFY"

        val embedString = "<iframe  src=\"$videoUrl\" frameborder=\"0\" allowfullscreen></iframe>"
        webView.webChromeClient = WebChromeClient()
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.settings.loadWithOverviewMode = true

        var text = "<html><body style=\"text-align:justify;\">"
        text += embedString
        text += "</body></html>"
        webView.loadData(text, "text/html", "utf-8")
    }


}
