package com.example.workclass02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name: EditText = findViewById(R.id.name)
        var pass: EditText = findViewById(R.id.TextPassword)
        var cpass: EditText = findViewById(R.id.Con)
        var ok: Button = findViewById(R.id.ok)
        var clear: Button = findViewById(R.id.clear)

        clear.setOnClickListener() {
            name.setText("")
            pass.setText("")
            cpass.setText("")
            val toast = Toast.makeText(applicationContext, "ลบสำเร็จ!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = name.text.toString()
            var passw= pass.text.toString()
            var passc = cpass.text.toString()
            if(user == ""||  passw == "" ||  passc == ""){
            Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
        }
            else if(user == passw && user == passc) {
            Toast.makeText(applicationContext, "อย่ากรอกUsernameตรงกับPassword", Toast.LENGTH_LONG).show()
        }
        else if(passw != passc){
            Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
        }
        }


    }
}