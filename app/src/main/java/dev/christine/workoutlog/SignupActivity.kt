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

class SignupActivity : AppCompatActivity() {
    lateinit var tilfirstname:TextInputLayout
    lateinit var etfnm:TextInputEditText
    lateinit var tillastname:TextInputLayout
    lateinit var etlnm:TextInputEditText
    lateinit var tilemail:TextInputLayout
    lateinit var etemail:TextInputEditText
    lateinit var tilpassword:TextInputLayout
    lateinit var etpwrd:TextInputEditText
    lateinit var tilconfirmpassword:TextInputLayout
    lateinit var btnSignUp:Button
    lateinit var tvlgn:TextView
    lateinit var etpsswd:TextInputEditText
    lateinit var imgfnm:ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        tvlgn = findViewById(R.id.tvlgn)
        btnSignUp = findViewById(R.id.btnSignUp)
        etemail = findViewById(R.id.etemail)
        etfnm = findViewById(R.id.etfnm)
        tilfirstname = findViewById(R.id.tilfirstname)
        tillastname = findViewById(R.id.tillastname)
        tilpassword = findViewById(R.id.tilpassword)
        tilemail = findViewById(R.id.tilemail)
        tilconfirmpassword = findViewById(R.id.tilconfirmpassword)
        etpwrd = findViewById(R.id.etpwrd)
        etpsswd = findViewById(R.id.etpsswd)
        etlnm = findViewById(R.id.etlnm)


        tvlgn.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        btnSignUp.setOnClickListener {
            validateSignUp()
        }
    }
    fun validateSignUp(){
        var firstname = etfnm.text.toString()
        var lastname = etlnm.text.toString()
        var email = etemail.text.toString()
        var password = etpwrd.text.toString()
        var confirmpassword = etpsswd.text.toString()
        if (firstname.isBlank()){
            tilfirstname.error = "FirstName is required"
        }
        if (lastname.isBlank()){
            tillastname.error = "LastName is required"
        }
        if (email.isBlank()){
            tilemail.error = "Email is required"
        }
        if (password.isBlank()){
            tilpassword.error = "Password is required"
        }
        if (confirmpassword.isBlank()){
            tilconfirmpassword.error = "Confirm Password is required"
        }
        if (password==confirmpassword){
            tilconfirmpassword.error = "Confirm"}
        if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tilemail.error= "Email is invalid"
        }

        else{
            tilconfirmpassword.error
            print("Invalid password")
        }

    }

}
