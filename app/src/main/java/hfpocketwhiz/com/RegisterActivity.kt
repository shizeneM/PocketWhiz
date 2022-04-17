package hfpocketwhiz.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hfpocketwhiz.com.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_register)

        val viewBinding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.alreadyRegistered.setOnClickListener {
            startActivity (Intent(this@RegisterActivity, LoginActivity::class.java))
        }
    }
}