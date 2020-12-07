package com.example.franc.propaganda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.Principal;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button btnSobEmpProg = (Button) findViewById(R.id.btnSobEmp);
        Button btnTProg = (Button) findViewById(R.id.btnTel);


        btnSobEmpProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Propaganda.class);
                startActivity(it);

            }
        });



        btnTProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu.this,Telefone.class);
                startActivity(it);
            }
        });




    }
}
