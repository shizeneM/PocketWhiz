package hfpocketwhiz.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hfpocketwhiz.com.databinding.ActivityLoginBinding


class LoginActivity() : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        val viewBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.loginbutton.setOnClickListener {
            startActivity(Intent(this@LoginActivity, MainAppLayout::class.java))
        }
        viewBinding.register.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }
    }
}
