package com.example.franc.propaganda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Propaganda extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propaganda);

        Button btnVoltarProg  = (Button) findViewById(R.id.btnVoltarProp);
        btnVoltarProg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Propaganda.this,Menu.class);
                startActivity(it);

            }
        });


    }
}
