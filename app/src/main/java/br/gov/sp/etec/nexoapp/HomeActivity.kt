package br.gov.sp.etec.nexoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = Intent(this, VagaOc ::class.java)
        val btnVagasOc  = findViewById<Button>(R.id.VagasOc)
        btnVagasOc.setOnClickListener {
            startActivity(intent)
        }
        val intent2 = Intent(this, VagaLv ::class.java)
        val btnVagasLv  = findViewById<Button>(R.id.VagasLv)
        btnVagasLv.setOnClickListener {
            startActivity(intent)
        }
    }
}