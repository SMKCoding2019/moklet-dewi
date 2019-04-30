package com.dycode.edu.moca

import android.app.ProgressDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnlogin.setOnClickListener {
            val username = username.text.toString();
            val password = password.text.toString();
            if(username.isEmpty()){
                Toast.makeText(this, "Please Insert Username", Toast.LENGTH_SHORT).show()
            }
            else if(password.isEmpty()){
                Toast.makeText(this, "Please Insert Password", Toast.LENGTH_SHORT).show()
            }
            if(username == "ddewik"|| password == "dewiayualamanda" ){
                val progressDialog = ProgressDialog(this, R.style.Theme_MaterialComponents_Light_Dialog)
                progressDialog.isIndeterminate =true;
                progressDialog.setMessage("Loading...");
                progressDialog.show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent);
                finish()
            }
        }
        btnregister.setOnClickListener{
            startActivity(Intent(this, Register::class.java))
        }

    }

}
