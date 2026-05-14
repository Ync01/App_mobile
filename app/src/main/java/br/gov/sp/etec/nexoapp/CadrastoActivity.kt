package br.gov.sp.etec.nexoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CadrastoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadrasto)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intentCadrasto = Intent(this, HomeActivity ::class.java)
        val btnLogin  = findViewById<Button>(R.id.buttonLogin)
        val editTextEmailLogin = findViewById<EditText>(R.id.editTextEmail)
        val editTextSenhaLogin = findViewById<EditText>(R.id.editTextSenha)

        btnLogin.setOnClickListener {
            if(editTextEmailLogin.text.isEmpty() || editTextSenhaLogin.text.isEmpty()){
                Toast.makeText(this, "Você precisa digitar um Email e uma Senha para entrar!!", Toast.LENGTH_SHORT).show()
            }
            else{
                startActivity(intentCadrasto)
            }

        }


    }
}