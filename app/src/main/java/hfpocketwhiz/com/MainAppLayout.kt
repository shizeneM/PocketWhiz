package hfpocketwhiz.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainAppLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app_layout)
        supportActionBar?.hide()
    }
}