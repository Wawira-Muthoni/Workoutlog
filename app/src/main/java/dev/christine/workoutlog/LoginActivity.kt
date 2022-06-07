package dev.christine.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tvsignup:TextView
    lateinit var ettext:TextInputEditText
    lateinit var etpwd:TextInputEditText
    lateinit var tilemail:TextInputLayout
    lateinit var tilpassword:TextInputLayout
    lateinit var btnlogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvsignup = findViewById(R.id.tvsignup)
        ettext = findViewById(R.id.ettext)
        etpwd = findViewById(R.id.etpwd)
        btnlogin = findViewById(R.id.btnlogin)
        tilemail = findViewById(R.id.tilemail)
        tilpassword = findViewById(R.id.tilpassword)

        tvsignup.setOnClickListener {
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener {
            validateLogin()
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        }
    fun validateLogin(){
        var email = ettext.text.toString()
        var password = etpwd.text.toString()
        if (email.isBlank()){
            tilemail.error = "Email is required"
        }
        if (password.isBlank()){
            tilpassword.error = "Password required"
        }


    }
}