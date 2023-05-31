package com.razib.signinsignup

import Helper.Helper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUp : AppCompatActivity() {
    lateinit var Etemail: TextView
    lateinit var EtpassNew: TextView
    lateinit var pass : TextView
    lateinit var btnsingup : Button
    lateinit var etFN: TextView
    lateinit var etLN:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        Initial()
        name()
        emailPassvalid()
    }
    fun Initial(){
        Etemail= findViewById(R.id.EtEmail)
        EtpassNew = findViewById(R.id.EtpassNew)
        pass=findViewById(R.id.pass)
        btnsingup = findViewById(R.id.btnsingup)
        etFN = findViewById(R.id.etFN)
        etLN = findViewById(R.id.etLN)
    }


    fun name(){
        var FirstName= etFN.text.toString()
        var LastName = etLN.text.toString()
        if ( FirstName.isEmpty()){
            etFN.error="Enter The Frist Name"
        }
        else if (LastName.isEmpty()){
            etLN.error="Enter The Last Name"
        }
        else{
            etFN.setBackgroundResource(R.drawable.customlayout)
            etLN.setBackgroundResource(R.drawable.customlayout)
        }
    }


    fun emailPassvalid(){
            btnsingup.setOnClickListener(){
                var email = Etemail.text.toString()
                var password = pass.text.toString()
                var new_password = EtpassNew.toString()
                if(email.isEmpty()) {
                    Etemail.error = "Enter Your Email Address"
                }
                else if (Helper().IsValidEmail(email)== false){
                    Etemail.error="Valid Email Address"
                }
                else if (password.isEmpty()){
                    pass.error = "Enter Your Password"

                }
                else if(password.length<8){
                    pass.error = "Minimum 8 Chracter"
                }
                else if(new_password.length<8){
                    pass.error = "Minimum 8 Chracter"
                }
               else if (!password.equals (new_password)){
                   pass.error="Dont Match a Password"

                }

                else{
                    Etemail.setBackgroundResource(R.drawable.customlayout)
                    pass.setBackgroundResource(R.drawable.customlayout)
                    EtpassNew.setBackgroundResource(R.drawable.customlayout)
                }
            }
        }
    }
