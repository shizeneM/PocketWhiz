package hfpocketwhiz.com

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hfpocketwhiz.com.databinding.ActivityMainAppLayoutBinding

class MainAppLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app_layout)
        supportActionBar?.hide()


        val viewBinding = ActivityMainAppLayoutBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.airplane.setOnClickListener {
            startActivity(Intent(this@MainAppLayout, LoginActivity::class.java))
        }
    }
}