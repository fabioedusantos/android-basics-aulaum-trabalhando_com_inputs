package com.fabio.professor.androidciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private TextView exibir;
    private Button acao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.texto);
        exibir = findViewById(R.id.exibir);
        acao = findViewById(R.id.acao);
    }

    public void acao(View v){
        String t = texto.getText().toString();
        exibir.setText(t);
    }
}
