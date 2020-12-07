package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kmm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kmm);

        final EditText edtKm_Prog = (EditText)findViewById(R.id.edtKm);
        final EditText edtM_Prog = (EditText)findViewById(R.id.edtM);
        edtKm_Prog.requestFocus();
        Button btnConverter_Prog = (Button)findViewById(R.id.btnConverter);
        Button btnNovo_Prog = (Button)findViewById(R.id.btnNovo);

        btnConverter_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor = Double.parseDouble(edtKm_Prog.getText().toString());
                if (MainActivity.validador == 1) {
                    double resultado = valor * 1000;
                    //calcula o valor de km em metros
                    edtM_Prog.setText(String.valueOf(resultado));
                }
                else if (MainActivity.validador == 2){
                    //calcula o valor de metros em kg
                    double resultado = valor / 1000;
                    edtM_Prog.setText(String.valueOf(resultado));
                }
                else if (MainActivity.validador == 3) {
                    //calcula o valor de metro em centimetros
                    double resultado = valor * 100;
                    edtM_Prog.setText(String.valueOf(resultado));
                }
                else if (MainActivity.validador == 4) {
                    //calcula o valor de centimetros em metros
                    double resultado = valor / 100;
                    edtM_Prog.setText(String.valueOf(resultado));
                }

            }
        });
        btnNovo_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtM_Prog.setText(""); // deixa os espaços dos campos em branco
                edtKm_Prog.setText("");
                edtKm_Prog.requestFocus(); // coloca o cursor sobre o primeiro campo
            }
        });
        Button btnVoltar_prog = (Button)findViewById(R.id.btnVoltar);
        btnVoltar_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kmm.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}