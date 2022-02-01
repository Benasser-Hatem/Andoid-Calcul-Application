package com.example.somme

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var editText1: EditText? = null
    private var editText2: EditText? = null
    private var btn: Button? = null
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 = findViewById(R.id.edit_text_input1)
        editText2 = findViewById(R.id.edit_text_input2)
        btn = findViewById(R.id.btn_somme)
        val tv: TextView = findViewById(R.id.tv_somme)
        btn.setOnClickListener(object : OnClickListener() {
            fun onClick(v: javax.swing.text.View?) {
                val ip1: String = editText1.getText().toString()
                val ip2: String = editText2.getText().toString()
                val num_ip1: Int = ip1.toInt()
                val num_ip2: Int = ip2.toInt()
                val x = somme(num_ip1, num_ip2)
                Toast.makeText(
                    getApplicationContext(),
                    getString(R.string.toast_un).toString() + ip1 + " + " + ip2 + getString(R.string.toast_deux) + somme(
                        num_ip1,
                        num_ip2
                    ),
                    Toast.LENGTH_SHORT
                ).show()
                tv.setText(somme(num_ip1, num_ip2).toString())
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("somme", x)
                startActivity(intent)
            }
        })
    }

    fun somme(num_ip1: Int, num_ip2: Int): Int {
        return num_ip1 + num_ip2
    }

    protected fun onResume() {
        super.onResume()
    }

    protected fun onStop() {
        super.onStop()
    }
}