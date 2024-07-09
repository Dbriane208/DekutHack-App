package daniel.brian.dhack.activities

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import daniel.brian.dhack.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val web = binding.webView
        web.webViewClient = WebViewClient()
        web.settings.javaScriptEnabled = true

        web.loadUrl("https://shorturl.at/m8hwX")
    }
}