package dev.christine.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.christine.workoutlog.databinding.ActivityLoginBinding
import java.util.zip.Inflater

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
//
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityLoginBinding.inflate(layoutInflater)
    setContentView(R.layout.activity_login)
    castViews()


}
    fun castViews(){
         handleClicks()
    }

    fun handleClicks(){
        binding.tvsignup.setOnClickListener {
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }

        binding.btnlogin.setOnClickListener {
            validateLogin()
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        }

    fun validateLogin(){
        var email =binding.ettext.text.toString()
        var password = binding.etpwd.text.toString()
        if (email.isBlank()){
            binding.tilemail.error = "Email is required"
        }
        if (password.isBlank()){
            binding.tilpassword.error = "Password required"
        }


    }
}