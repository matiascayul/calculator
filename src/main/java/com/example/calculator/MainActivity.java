package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private EditText numero1;
    private EditText numero2;
    private Button button_suma;
    private Button button_resta;
    private Button button_division;
    private Button button_multiplicacion;
    private Button btn_rehacer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        numero1= findViewById(R.id.numero1);
        numero2= findViewById(R.id.numero2);
        btn_rehacer = findViewById(R.id.btn_rehacer);

        button_suma = findViewById(R.id.button_suma);
        button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(sumar(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
        button_resta = findViewById(R.id.button_resta);
        button_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(restar(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
        button_division = findViewById(R.id.button_division);
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(dividir(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
        button_multiplicacion = findViewById(R.id.button_multi);
        button_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(multiplicar(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()))+"");
            }
        });
        btn_rehacer = findViewById(R.id.btn_rehacer);
        btn_rehacer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            resultado.setText("0");
            numero1.setText("");
            numero2.setText("");
        }
    });


    }
    public int sumar(int a, int b){

        return a+b;
    }
    public int restar(int a, int b){

        return a-b;
    }
    public int dividir(int a, int b){
        int respuesta = 0;
        if(b!=0) {
            respuesta = a / b;
        }
        return respuesta;
    }
    public int multiplicar(int a, int b){

        return a*b;
    }


}

