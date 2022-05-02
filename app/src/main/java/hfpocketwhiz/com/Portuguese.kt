package hfpocketwhiz.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions

class Portuguese : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portuguese)
        supportActionBar?.hide()
        val editText: EditText = findViewById(R.id.editText)
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.portuguesebutton)
        val translationConfigs = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.ENGLISH)
            .setTargetLanguage(TranslateLanguage.PORTUGUESE)
            .build()
        val translator = Translation.getClient(translationConfigs)
        button.setOnClickListener {
            if (editText.text.isNotEmpty()) {
                translator.downloadModelIfNeeded()
                    .addOnSuccessListener {
                        Toast.makeText(this, "Download Successful", Toast.LENGTH_SHORT).show()
                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                    }
                translator.translate(editText.text.toString())
                    .addOnSuccessListener {
                        textView.setText(it)
                    }
                    .addOnFailureListener {
                        it.printStackTrace()
                    }
            }
        }
//        val viewBinding = ActivityMainAppLayoutBinding.inflate(layoutInflater)
//        setContentView(viewBinding.root)
//
//        viewBinding.airplane.setOnClickListener {
//            startActivity(Intent(this@Translation, MainAppLayout::class.java))
//        }
    }
}