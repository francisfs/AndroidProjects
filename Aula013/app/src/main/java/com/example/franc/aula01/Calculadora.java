package com.example.franc.aula01;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle; import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora extends Activity {
    //Sobrecarga do método onCreate.
    //Bundle savedInstanceState: Recebe o estado da Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Utilização do onCreate da classe "AppCompatActivity", para que a base
        // da Activity seja criada.
        super.onCreate(savedInstanceState);
        //Configura o layout da ingerface SML definindo todos os componentes.
        setContentView(R.layout.activity_calculadora);
        //Ligação do componente da classe com os componentes da interface
        Button btnSomarProg = (Button) findViewById(R.id.btnSomar);
        Button btnSubtrairProg = (Button) findViewById(R.id.btnSubtrair);
        Button btnMultiplicarProg = (Button) findViewById(R.id.btnMult);
        Button btnDividirProg = (Button) findViewById(R.id.btnDividir);


        //Código responsável pela captura do evento de clique no botão
        // e execução da ação realizada após o click.




        btnSomarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                    // ligação de componentes da classe com os componentes da interface.
                    EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                    EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                    EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

                    //Conversão e armazenamento dos caracteres obtidos na interface grafica
                    double num1 = Double.parseDouble(edtValor1Prog.getText() .toString());
                    double num2 = Double.parseDouble(edtValor2Prog.getText() .toString());
                    //Soma e armazena o resultado
                    double resultado = num1 + num2;
                    // Retorno para a interface grafica do resultado.
                    edtResultadoProg.setText(String.valueOf(resultado));
            }
        });
        btnSubtrairProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                // ligação de componentes da classe com os componentes da interface.
                EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

                //Conversão e armazenamento dos caracteres obtidos na interface grafica
                double num1 = Double.parseDouble(edtValor1Prog.getText() .toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText() .toString());
                //Soma e armazena o resultado
                double resultado = num1 - num2;
                // Retorno para a interface grafica do resultado.
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });
        btnDividirProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                // ligação de componentes da classe com os componentes da interface.
                EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

                //Conversão e armazenamento dos caracteres obtidos na interface grafica
                double num1 = Double.parseDouble(edtValor1Prog.getText() .toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText() .toString());
                //Soma e armazena o resultado
                double resultado = num1 / num2;
                // Retorno para a interface grafica do resultado.
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });
        btnMultiplicarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                // ligação de componentes da classe com os componentes da interface.
                EditText edtValor1Prog = (EditText) findViewById(R.id.edtValor1);
                EditText edtValor2Prog = (EditText) findViewById(R.id.edtValor2);
                EditText edtResultadoProg = (EditText) findViewById(R.id.edtResultado);

                //Conversão e armazenamento dos caracteres obtidos na interface grafica
                double num1 = Double.parseDouble(edtValor1Prog.getText() .toString());
                double num2 = Double.parseDouble(edtValor2Prog.getText() .toString());
                //Soma e armazena o resultado
                double resultado = num1 * num2;
                // Retorno para a interface grafica do resultado.
                edtResultadoProg.setText(String.valueOf(resultado));
            }
        });

    }
}
