package com.mariojc29.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resultado extends AppCompatActivity {
TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Resultado = (TextView) findViewById(R.id.resultado);
        Intent i = getIntent();
        double altura = i.getDoubleExtra("altura", 0);
        double peso = i.getDoubleExtra("peso", 0);
        double IMC = (peso / Math.pow(altura, 2));
        Resultado.setText(String.valueOf(IMC));
    }
}
