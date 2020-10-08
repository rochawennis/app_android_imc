package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoImc extends AppCompatActivity {

    TextView resultado;
    Button btn_proximo;
    double calculoimc;
    String grau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_imc);
        btn_proximo = findViewById(R.id.btn_voltar);
        resultado = findViewById(R.id.indice_imc);

        Intent i = getIntent();

        IndiceIMC p = (IndiceIMC) i.getSerializableExtra("calculo");

        resultado.setText("Seu IMC é: " + String.format("%.2f",p.getCalculoimc()));

        grau = p.grau(p.getCalculoimc());

        btn_proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ResultadoImc.this, GrauObesidade.class);
                i.putExtra("imc", grau);
                startActivity(i);
            }
        });
    }
}