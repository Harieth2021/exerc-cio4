package com.example.exerccio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ano_de_nascimento, ano_actual;
    Button calcular;
    TextView  idade_actual, anos2050;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ano_de_nascimento=findViewById(R.id.txt_anonascimento);
        ano_actual=findViewById(R.id.txt_anoactual);
        calcular=findViewById(R.id.calcular);
        idade_actual=findViewById(R.id.idade_actual);
        anos2050=findViewById(R.id.anos_2050);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int  AnoNascimento=Integer.parseInt(ano_de_nascimento.getText().toString());
              int AnoActual=Integer.parseInt(ano_actual.getText().toString());
                int idade= AnoActual- AnoNascimento;
              int idade2050=2050-AnoNascimento;

              idade_actual.setText(String.valueOf(idade2050));
              anos2050.setText(String.valueOf(idade));

            }
        });
    }
}