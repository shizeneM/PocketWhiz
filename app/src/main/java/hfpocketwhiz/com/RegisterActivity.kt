package hfpocketwhiz.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hfpocketwhiz.com.databinding.ActivityLoginBinding
import hfpocketwhiz.com.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_login)

        //val viewBinding= ActivityLoginBinding.inflate(layoutInflater)
        //setContentView(viewBinding.root)
    }
}