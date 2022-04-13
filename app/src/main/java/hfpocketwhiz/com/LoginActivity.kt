package hfpocketwhiz.com

import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

import hfpocketwhiz.com.R
import hfpocketwhiz.com.helpers.InputValidation
import hfpocketwhiz.com.model.User
import hfpocketwhiz.com.sql.DataBase

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private val activity = this@LoginActivity
    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var textInputLayoutEmail: EditText
    private lateinit var textInputLayoutPassword: EditText
    private lateinit var textInputEditTextEmail: EditText
    private lateinit var textInputEditTextPassword: EditText
    private lateinit var appCompatButtonLogin: Button
    private lateinit var textViewLinkRegister: LinearLayout
    private lateinit var inputValidation: InputValidation
    private lateinit var databaseHelper: DataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // hiding the action bar
        supportActionBar!!.hide()
        // initializing the views
        initViews()
        // initializing the listeners
        initListeners()
        // initializing the objects
        initObjects()
    }
    /**
     * This method is to initialize views
     */
    private fun initViews() {
        constraintLayout = findViewById(R.id.constraint) as ConstraintLayout
        textInputLayoutEmail = findViewById(R.id.loginusername) as EditText
        textInputLayoutPassword = findViewById(R.id.loginpassword) as EditText
        textInputEditTextEmail = findViewById(R.id.loginusername) as EditText
        textInputEditTextPassword = findViewById(R.id.loginpassword) as EditText
        appCompatButtonLogin = findViewById(R.id.loginbutton) as Button
        textViewLinkRegister = findViewById(R.id.LinearLayout) as LinearLayout
    }
    /**
     * This method is to initialize listeners
     */
    private fun initListeners() {
        appCompatButtonLogin!!.setOnClickListener(this)
        textViewLinkRegister!!.setOnClickListener(this)
    }
    /**
     * This method is to initialize objects to be used
     */
    private fun initObjects() {
        databaseHelper = DataBase(activity)
        inputValidation = InputValidation(activity)
    }
    /**
     * This implemented method is to listen the click on view
     *
     * @param v
     */
    override fun onClick(v: View) {
        when (v.id) {
            R.id.loginbutton -> verifyFromSQLite()
            R.id.LinearLayout -> {
                // Navigate to RegisterActivity
                val intentRegister = Intent(applicationContext, RegisterActivity::class.java)
                startActivity(intentRegister)
            }
        }
    }
    /**
     * This method is to validate the input text fields and verify login credentials from SQLite
     */
    private fun verifyFromSQLite() {
        if (!inputValidation!!.isInputEditTextFilled(textInputEditTextEmail!!, textInputLayoutEmail!!, getString(R.string.error_message_email))) {
            return
        }
        if (!inputValidation!!.isInputEditTextEmail(textInputEditTextEmail!!, textInputLayoutEmail!!, getString(R.string.error_message_email))) {
            return
        }
        if (!inputValidation!!.isInputEditTextFilled(textInputEditTextPassword!!, textInputLayoutPassword!!, getString(R.string.error_message_email))) {
            return
        }
        if (databaseHelper!!.checkUser(textInputEditTextEmail!!.text.toString().trim { it <= ' ' }, textInputEditTextPassword!!.text.toString().trim { it <= ' ' })) {
            val accountsIntent = Intent(activity, User::class.java)
            accountsIntent.putExtra("EMAIL", textInputEditTextEmail!!.text.toString().trim { it <= ' ' })
            emptyInputEditText()
            startActivity(accountsIntent)
        } else {
            // Snack Bar to show success message that record is wrong
            print("Wrong")
        }
    }
    /**
     * This method is to empty all input edit text
     */
    private fun emptyInputEditText() {
        textInputEditTextEmail!!.text = null
        textInputEditTextPassword!!.text = null
    }
}