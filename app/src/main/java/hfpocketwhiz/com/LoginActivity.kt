package hfpocketwhiz.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView as AndroidWidgetTextView
import android.widget.*
import android.widget.TextView as TextView1

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()



    }
}