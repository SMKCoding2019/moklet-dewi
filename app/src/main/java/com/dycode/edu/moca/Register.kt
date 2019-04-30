package com.dycode.edu.moca

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class Register :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        txtclose.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent);
        }
        btnregister.setOnClickListener {
            val username = username.text.toString();
            val password = password.text.toString();
            val namadpn = namadpn.text.toString();
            val namablkg = namablkg.text.toString();
            val email = email.text.toString();
            val gender = gender.checkedRadioButtonId.toString();

            if(username.isEmpty()){
                Toast.makeText(this, "Please Insert Username", Toast.LENGTH_SHORT).show()
            }
            else if(password.isEmpty()){
                Toast.makeText(this, "Please Insert Password", Toast.LENGTH_SHORT).show()
            }
            else if(namadpn.isEmpty()){
                Toast.makeText(this, "Please Insert First Name", Toast.LENGTH_SHORT).show()
            }
            else if(namablkg.isEmpty()){
                Toast.makeText(this, "Please Insert LastName", Toast.LENGTH_SHORT).show()
            }
            else if(email.isEmpty()){
                Toast.makeText(this, "Please Insert Email", Toast.LENGTH_SHORT).show()
            }
            else if(gender.isEmpty()){
                Toast.makeText(this, "Please Choose Gender", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, login::class.java)
                startActivity(intent);
            }
        }
    }
}