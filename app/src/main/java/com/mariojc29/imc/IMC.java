package com.mariojc29.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IMC extends AppCompatActivity {

    EditText Peso, Altura;
    TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);
        Peso = (EditText) findViewById(R.id.peso);
        Altura = (EditText) findViewById(R.id.altura);
        Resultado = (TextView) findViewById(R.id.textView3);

    }

    public void igualOnClick(View v) {
        try {
            double peso = Double.parseDouble(Peso.getText().toString());
            double altura = Double.parseDouble(Altura.getText().toString());
            Intent i= new Intent(this, com.mariojc29.imc.Resultado. class);
            i.putExtra("peso",peso);
            i.putExtra("altura",altura);

        } catch (Exception e) {
            Toast.makeText(this, "Datos erroneos", Toast.LENGTH_SHORT).show();

        }
    }
}