package dev.christine.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.christine.workoutlog.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
//    lateinit var tilfirstname:TextInputLayout
//    lateinit var etfnm:TextInputEditText
//    lateinit var tillastname:TextInputLayout
//    lateinit var etlnm:TextInputEditText
//    lateinit var tilemail:TextInputLayout
//    lateinit var etemail:TextInputEditText
//    lateinit var tilpassword:TextInputLayout
//    lateinit var etpwrd:TextInputEditText
//    lateinit var tilconfirmpassword:TextInputLayout
//    lateinit var btnSignUp:Button
//    lateinit var tvlgn:TextView
//    lateinit var etpsswd:TextInputEditText
//    lateinit var imgfnm:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()

//        tvlgn = findViewById(R.id.tvlgn)
//        btnSignUp = findViewById(R.id.btnSignUp)
//        etemail = findViewById(R.id.etemail)
//        etfnm = findViewById(R.id.etfnm)
//        tilfirstname = findViewById(R.id.tilfirstname)
//        tillastname = findViewById(R.id.tillastname)
//        tilpassword = findViewById(R.id.tilpassword)
//        tilemail = findViewById(R.id.tilemail)
//        tilconfirmpassword = findViewById(R.id.tilconfirmpassword)
//        etpwrd = findViewById(R.id.etpwrd)
//        etpsswd = findViewById(R.id.etpsswd)
//        etlnm = findViewById(R.id.etlnm)
    }

    fun castViews() {
        handleClicks()
    }

    fun handleClicks() {
        binding.tvlgn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            validateSignUp()
        }
    }

    fun validateSignUp() {
        var firstname = binding.etfnm.text.toString()
        var lastname = binding.etlnm.text.toString()
        var email = binding.etemail.text.toString()
        var password = binding.etpwrd.text.toString()
        var confirmpassword = binding.etpsswd.text.toString()
        if (firstname.isBlank()) {
            binding.tilfirstname.error = "FirstName is required"
        }
        if (lastname.isBlank()) {
            binding.tillastname.error = "LastName is required"
        }
        if (email.isBlank()) {
            binding.tilemail.error = "Email is required"
        }
        if (password.isBlank()) {
            binding.tilpassword.error = "Password is required"
        }
        if (confirmpassword.isBlank()) {
            binding.tilconfirmpassword.error = "Confirm Password is required"
        }
        if (password == confirmpassword) {
            binding.tilconfirmpassword.error = "Confirm"
        }
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.tilemail.error = "Email is invalid"
        } else {
            binding.tilconfirmpassword.error
            print("Invalid password")
        }

    }

}
