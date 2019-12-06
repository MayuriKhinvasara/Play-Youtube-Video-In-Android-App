# Play-Youtube-Video-In-Android-App
Play Youtube  Video In Android App

Below works upto Android 10. Load a "WebView" in your Android Activity/ Fragment.

Check [this][1] for a working project.

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

It uses the [IFrame][2] Player API. 
width (number) – The width of the video player. The default value is 640.
height (number) – The height of the video player. The default value is 390.
videoId (string) – The YouTube video ID that identifies the video that the player will load.

Below is the UI xml

 

     <WebView
            android:id="@+id/webView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="40dp"
            android:visibility="visible"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/youtubeVideoFrameSubText" />


  [1]: https://github.com/mayurik18/Play-Youtube-Video-In-Android-App
  [2]: https://developers.google.com/youtube/iframe_api_reference
