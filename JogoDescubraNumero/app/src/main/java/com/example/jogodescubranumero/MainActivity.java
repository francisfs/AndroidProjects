package com.example.jogodescubranumero;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView txtDicaProg;
    EditText edtValorProg;
    EditText edtValorOcultoProg;
    int valorOculto = gerarNumero();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDicaProg = findViewById(R.id.txtDica);
        edtValorProg = findViewById(R.id.edtValor);
        edtValorOcultoProg = findViewById(R.id.edtValorOculto);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }

    public int gerarNumero()
    {
        Random gerarNumeoro = new Random();
        int numero = gerarNumeoro.nextInt(10) + 1;
        return numero;

    }

    public void clickBtnEnviar(View v)
    {
        int valor = Integer.parseInt(edtValorProg.getText().toString());
        if (valor == valorOculto)
        {
            txtDicaProg.setText("PARABÉNS!!!");
            edtValorOcultoProg.setText(""+valorOculto);
        }
        else
        {
            if (valor < valorOculto)
            {
                txtDicaProg.setText("O valor oculto é maior que o informado");
                edtValorProg.setText("");
                edtValorProg.requestFocus();
            }
            else
            {
                txtDicaProg.setText("O valor oculto é menor que o informado");
                edtValorProg.setText("");
                edtValorProg.requestFocus();
            }
        }

    }
    public void clickBtnNovo(View v)
    {
        txtDicaProg.setText("Valor de 1 até 10");
        edtValorProg.setText("");
        edtValorOcultoProg.setText("?");
        valorOculto = gerarNumero();
    }
}