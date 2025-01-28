package com.example.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView resultado = findViewById(R.id.resultado);
        Button btnCalcular = findViewById(R.id.btnCalcular);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    double numero1 = Double.parseDouble(num1.getText().toString());
                    double numero2 = Double.parseDouble(num2.getText().toString());


                    double suma = numero1 + numero2;


                    resultado.setText("Respuesta: " + suma);
                } catch (NumberFormatException e) {
                   
                    resultado.setText("Por favor, ingresa números válidos.");
                }
            }
        });
    }
}