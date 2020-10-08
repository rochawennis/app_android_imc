package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GrauObesidade extends AppCompatActivity {

    TextView indice_imc;
    Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grau_obesidade);

        btn_voltar = findViewById(R.id.btn_voltar);
        indice_imc = findViewById(R.id.indice_imc);

        String imc = getIntent().getExtras().getString("imc");

        indice_imc.setText(imc);

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(GrauObesidade.this, MainActivity.class);

                startActivity(i);
            }
        });
    }
}