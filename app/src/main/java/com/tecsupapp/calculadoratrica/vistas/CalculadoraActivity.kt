package com.tecsupapp.calculadoratrica.vistas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.tecsupapp.calculadoratrica.R
import kotlinx.android.synthetic.main.activity_calculadora.*


class CalculadoraActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    val listFormula = arrayOf("A: 30% T + 70% L", "B: 50% T + 50% L", "C: 40% T + 60% L")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
        title="Calculadora de Trica"

        //Spinner Sistema de eva
        spinnerSiseva.onItemSelectedListener = this
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listFormula)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSiseva.adapter = adapter

        btnCalcular.setOnClickListener{
            startActivity(Intent(this, ResultadoActivity::class.java))
        }



    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}