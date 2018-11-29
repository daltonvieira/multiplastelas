package com.example.tecinfo.multiplastelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        TextView txtidade = findViewById(R.id.txt_idade);
        Button sair = findViewById(R.id.btn_fechar);

        Intent intentRecebido = getIntent();
        String idade =  intentRecebido.getStringExtra("idade");

        txtidade.setText(idade);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
