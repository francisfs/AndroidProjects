package com.example.aula4;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSalvarProg = (Button) findViewById(R.id.btnSalvar);
        final EditText edtnomeProg = (EditText) findViewById(R.id.edtNome);
        final EditText edtTelefoneProg = (EditText) findViewById(R.id.edtTelefone);
        final EditText edtEmailProg = (EditText) findViewById(R.id.edtEmail);

        btnSalvarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //desenvolvimento do modelo do AlertDialog
                AlertDialog.Builder modelo = new AlertDialog.Builder(MainActivity.this);
                //define a mensagem para o AlertDialog
                modelo.setTitle("Cadastro");
                // defini a mensagem a mensagem para o alertDialog
                modelo.setMessage("Nome: " + edtnomeProg.getText()+"\nTelefone: "+ edtTelefoneProg.getText()+"\nE-mail: "+ edtEmailProg.getText());
                //define um botão para o alertDialog
                modelo.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //defini o que e feito ao clicar no botão
                    }
                });
                // Cria um AlertDialog com base no modelo gerado anteriormente
                AlertDialog alerta = modelo.create();
                // Mostra o AlertDialog na tela
                alerta.show();
            }
        });



    }
}