package com.pjurado.ejercicio0302

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.pjurado.ejercicio0302.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)

            rv.adapter = CiudadesAdapter(ciudades)
        }


    }

    private val ciudades = listOf<Ciudad>(
        Ciudad("Madrid", "https://a.cdn-hotels.com/gdcs/production133/d1207/7ad2d7f0-68ce-11e8-8a0f-0242ac11000c.jpg",
            "40.416775", "-3.703790"),
    )
}