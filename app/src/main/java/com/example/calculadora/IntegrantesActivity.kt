package com.example.calculadora

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.calculadora.databinding.ActivityIntegrantesBinding

class IntegrantesActivity : ComponentActivity() {
    private lateinit var binding: ActivityIntegrantesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntegrantesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltarIntegrantes.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}