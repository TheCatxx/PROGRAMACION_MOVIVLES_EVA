package com.tecsupapp.calculadoratrica.vistas

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.tecsupapp.calculadoratrica.R
import kotlinx.android.synthetic.main.activity_calcular.*

class ResultadoActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    val listFormu = arrayOf("A: 30% T + 70% L", "B: 50% T + 50% L", "C: 40% T + 60% L")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular)
        title="Calculadora de Trica - Resultado"

        //Spinner Sistema de eva
        spinnerSiste.onItemSelectedListener = this
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listFormu)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerSiste.adapter = adapter


    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}