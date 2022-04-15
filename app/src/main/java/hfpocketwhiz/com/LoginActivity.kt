package hfpocketwhiz.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import hfpocketwhiz.com.databinding.ActivityLoginBinding

<<<<<<< HEAD
class LoginActivity() : AppCompatActivity(){
    private lateinit var binding:ActivityLoginBinding
=======
class LoginActivity() : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
>>>>>>> 0066ad1a23e91bb6dbc90f42c589f62a9f085d58

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        val viewBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.loginbutton.setOnClickListener {
            val loginintent = Intent(this@LoginActivity, MainAppLayout::class.java)
            startActivity(loginintent)
        }
    }
<<<<<<< HEAD

}

=======
}
>>>>>>> 0066ad1a23e91bb6dbc90f42c589f62a9f085d58
