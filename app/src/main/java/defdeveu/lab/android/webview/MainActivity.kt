package defdeveu.lab.android.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        initWebView("file:///android_res/raw/hello.html")

        button.setOnClickListener {
            initWebView("https://zs.labs.defdev.eu/eula.html")
        }
    }

    private fun initWebView(url: String){
        web_view.loadUrl(url)
    }
}