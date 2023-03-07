package com.example.lab04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var submitButton=findViewById<Button>(R.id.btnSubmit)
        var edtNameEditText=findViewById<EditText>(R.id.edtName)
        var edtEmailEditText=findViewById<EditText>(R.id.edtEmail)
        var edtPasswordEditText=findViewById<EditText>(R.id.edtPassword)
        var edtReTypePasswordEditText=findViewById<EditText>(R.id.edtReTypePassword)


        lateinit var userName:String
        lateinit var email:String
        lateinit var password:String
        lateinit var reTypePassword:String

        submitButton.setOnClickListener{
            userName= edtNameEditText.text.toString()
            email=edtEmailEditText.text.toString()
            password=edtPasswordEditText.text.toString()
            reTypePassword=edtReTypePasswordEditText.text.toString()

            if(password==reTypePassword){

                Toast.makeText(this,"Hi You are Eligible!!!!",Toast.LENGTH_SHORT).show()
            }//end if
        }//end submitButton.setOnClickListener
    }
}