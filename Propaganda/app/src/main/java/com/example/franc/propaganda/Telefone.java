package com.example.franc.propaganda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telefone extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone);

        Button btnVoltarProg  = (Button) findViewById(R.id.btnVoltarTel);
        btnVoltarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Telefone.this,Menu.class);
                startActivity(it);

            }
        });




    }
}
