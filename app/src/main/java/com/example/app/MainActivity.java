package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_resultado;
    EditText tPeso;
    EditText tAltura;
    double peso, altura;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_resultado = findViewById(R.id.btn_resultado);
        tPeso = findViewById(R.id.tPeso);
        tAltura = findViewById(R.id.tAltura);

        tPeso.setText("");
        tAltura.setText("");
        tPeso.requestFocus();

        btn_resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, ResultadoImc.class);

                IndiceIMC calculo = new IndiceIMC(peso = Double.parseDouble(tPeso.getText().toString().replace(",",".")), altura = Double.parseDouble(tAltura.getText().toString().replace(",",".")));

                i.putExtra("calculo", calculo);

                startActivity(i);

            }
        });
    }
}
