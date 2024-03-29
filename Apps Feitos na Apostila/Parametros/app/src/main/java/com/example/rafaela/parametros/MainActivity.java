package com.example.rafaela.parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final EditText nome = (EditText) findViewById(R.id.edtNome);
        Button btn = (Button) findViewById(R.id.btnNovaTela);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ok = new Intent(MainActivity.this, SegundaActivity.class);
                ok.putExtra("parametro", nome.getText().toString());
                startActivity(ok);
            }
        });

    }
}
