package com.razib.signinsignup

import Helper.Helper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgetPassword : AppCompatActivity() {
    lateinit var etEmailSearch: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        etEmailSearch= findViewById(R.id.etEmailSearch)
        etEmailSearch.setOnClickListener(){
            var email = etEmailSearch.text.toString()
            if(email.isEmpty()) {
                etEmailSearch.error = "Enter Your Email Address"
            }
            else if (Helper().IsValidEmail(email)== false){
                etEmailSearch.error="Valid Email Address"
            }
        }
    }
}