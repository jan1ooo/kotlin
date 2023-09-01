package com.jan1ooo.conversortemperatura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jan1ooo.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            if(!binding.editFahrenheit.text.toString().isEmpty()){
                var fahrenheit = binding.editFahrenheit.text.toString().toDouble()
                var celcius = String.format("%.1f", (fahrenheit - 32) / 1.8)
                binding.textResultado.text = "$celcius C°"
            }else{
                binding.textResultado.text = "Temperatura inválida"
            }
        }
    }
}