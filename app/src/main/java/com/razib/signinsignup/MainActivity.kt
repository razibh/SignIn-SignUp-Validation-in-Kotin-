package com.razib.signinsignup

import Helper.Helper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var signUp : TextView
    lateinit var EtEmail: TextView
    lateinit var pass: TextView
    lateinit var btnsign: Button
    lateinit var forgtpw:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initilizee()
        Clicklistener()

        forgtpw.setOnClickListener {
            var intent = Intent(this, ForgetPassword::class.java)
            startActivity(intent)
        }

        signUp.setOnClickListener {
        var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

    }
    fun initilizee(){
        EtEmail = findViewById(R.id.EtEmail)
        pass = findViewById(R.id.pass)
        btnsign = findViewById(R.id.btnsign)
        signUp = findViewById(R.id.singup)
        forgtpw = findViewById(R.id.forgtpw)
    }
    fun Clicklistener(){
        btnsign.setOnClickListener(){
            var email = EtEmail.text.toString()
            var password = pass.text.toString()
           if(email.isEmpty()) {
               EtEmail.error = "Enter Your Email Address"
           }
            else if (password.isEmpty()){
                pass.error = "Enter Your Password"

            }
            else if(password.length<8){
                pass.error = "Minimum 8 Chracter"
           }
            else if (Helper().IsValidEmail(email)== false){
                EtEmail.error="Valid Email Address"
           }
            else{
                EtEmail.setBackgroundResource(R.drawable.customlayout)
               pass.setBackgroundResource(R.drawable.customlayout)
           }
        }
        }

}
