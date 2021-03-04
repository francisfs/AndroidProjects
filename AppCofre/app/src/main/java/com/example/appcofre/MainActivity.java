package com.example.appcofre;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView txtServicoProg;
    EditText edtNomeProg;
    EditText edtUsuarioProg;
    EditText edtSenhaProg;
    credencialModel credencial = new credencialModel();
    bdModel bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtServicoProg = (TextView) findViewById(R.id.txtServico);
        edtNomeProg = (EditText) findViewById(R.id.edtServico);
        edtUsuarioProg = (EditText) findViewById(R.id.edtUsuario);
        edtSenhaProg = (EditText) findViewById(R.id.edtSenha);

    }
    public void clickBtnDeletar(View v)
    {
        credencial.setNome(edtNomeProg.getText().toString());
        credencial.setUsuario(edtUsuarioProg.getText().toString());
        credencial.setSenha(edtSenhaProg.getText().toString());
    }
    public void clickBtnAlterar(View v)
    {
        credencial.setNome(edtNomeProg.getText().toString());
        credencial.setUsuario(edtUsuarioProg.getText().toString());
        credencial.setSenha(edtSenhaProg.getText().toString());
    }
    public void clickBtnCadastrar(View v)
    {
        credencial.setNome(edtNomeProg.getText().toString());
        credencial.setUsuario(edtUsuarioProg.getText().toString());
        credencial.setSenha(edtSenhaProg.getText().toString());
        bd = new bdModel(getApplicationContext());
        bd.insert(bdModel.getTabela(), credencial);
    }
    public void clickBtnNovo(View v)
    {
        limpar();
    }
    public void limpar()
    {
        edtNomeProg.setText("");
        edtUsuarioProg.setText("");
        edtSenhaProg.setText("");
        txtServicoProg.setText("Serviço:");
        edtNomeProg.requestFocus();
    }
}