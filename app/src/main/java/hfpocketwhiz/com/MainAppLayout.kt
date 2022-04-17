package hfpocketwhiz.com

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hfpocketwhiz.com.databinding.ActivityMainAppLayoutBinding


class MainAppLayout : AppCompatActivity() {
    private lateinit var binding: ActivityMainAppLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app_layout)
        supportActionBar?.hide()

        val viewBinding = ActivityMainAppLayoutBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.airport.setOnClickListener {
            startActivity(Intent(this, Airport::class.java))
        }

        viewBinding.taxi.setOnClickListener {
            startActivity(Intent(this, Taxi::class.java))
        }
    }
}
