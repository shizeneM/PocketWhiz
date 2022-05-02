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
            startActivity(Intent(this@MainAppLayout, Translation::class.java))
        }

        viewBinding.portuguese.setOnClickListener {
            startActivity(Intent(this@MainAppLayout, Portuguese::class.java))
        }

        viewBinding.chinese.setOnClickListener {
            startActivity(Intent(this@MainAppLayout, Chinese::class.java))
        }

        viewBinding.vietnamese.setOnClickListener {
            startActivity(Intent(this@MainAppLayout, Vietnamese::class.java))
        }

        viewBinding.hindi.setOnClickListener {
            startActivity(Intent(this@MainAppLayout, Hindi::class.java))
        }

        viewBinding.french.setOnClickListener {
            startActivity(Intent(this@MainAppLayout, French::class.java))
        }
    }
}