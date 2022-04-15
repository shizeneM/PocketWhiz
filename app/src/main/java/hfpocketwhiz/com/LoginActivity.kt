package hfpocketwhiz.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.TextView as AndroidWidgetTextView
import android.widget.*
import hfpocketwhiz.com.databinding.ActivityLoginBinding
import android.widget.TextView as TextView1

class LoginActivity() : AppCompatActivity(){
    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        val viewBinding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.loginbutton.setOnClickListener {
            val loginintent = Intent(this@LoginActivity, MainAppLayout::class.java)
            startActivity(loginintent)
        }
    }

}

