package com.example.guia_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button calc, form, datos;
    TextView tvPantalla;
    float n1 = 0.0f, n2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc = findViewById(R.id.btnCalculadora);
        form = findViewById(R.id.btnFormulario);
        datos = findViewById(R.id.btnDatos);
        AbrirActivity();
    }

    public void AbrirActivity(){
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity.class);
                setContentView(R.layout.activity_calculadora);
                tvPantalla = findViewById(R.id.tvPantalla);
            }
        });
        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity.class);
                setContentView(R.layout.activity_login);
            }
        });
        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity.class);
                setContentView(R.layout.activity_datos);
            }
        });
    }

    public void DigitarCero(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("0");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "0");
        }
    }

    public void DigitarUno(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("1");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "1");
        }
    }

    public void DigitarDos(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("2");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "2");
        }
    }

    public void DigitarTres(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("3");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "3");
        }
    }

    public void DigitarCuatro(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("4");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "4");
        }
    }

    public void DigitarCinco(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("5");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "5");
        }
    }

    public void DigitarSeis(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("6");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "6");
        }
    }

    public void DigitarSiete(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("7");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "7");
        }
    }

    public void DigitarOcho(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("8");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "8");
        }
    }

    public void DigitarNueve(View view) {
        float valor = Float.parseFloat(tvPantalla.getText().toString());
        if(valor == 0.0f){
            tvPantalla.setText("9");
        }else{
            tvPantalla.setText(tvPantalla.getText() + "9");
        }
    }

    public void LimpiarTodo(View view) {
        n1 = 0.0f;
        n2 = 0.0f;
        operacion = "";
        tvPantalla.setText("0");
    }

    public void LimpiarDel(View view) {
        n2 = 0.0f;
        tvPantalla.setText("0");
    }

    public void Mas(View view) {
        n1 = Float.parseFloat(String.valueOf(tvPantalla.getText()));
        operacion = "+";
        tvPantalla.setText("0");
    }

    public void Menos(View view) {
        n1 = Float.parseFloat(String.valueOf(tvPantalla.getText()));
        operacion = "-";
        tvPantalla.setText("0");
    }

    public void Multiplicar(View view) {
        n1 = Float.parseFloat(String.valueOf(tvPantalla.getText()));
        operacion = "*";
        tvPantalla.setText("0");
    }

    public void Entre(View view) {
        n1 = Float.parseFloat(String.valueOf(tvPantalla.getText()));
        operacion = "/";
        tvPantalla.setText("0");
    }

    public void Igual(View view) {
        n2 = Float.parseFloat(String.valueOf(tvPantalla.getText()));
        float x = 0.0f;

        if(operacion.equals("/")){
            if(n2 != 0.0f){
                x = n1 / n2;
            }else{
                x = 0.0f;
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }
        }else if(operacion.equals("*")){
            x = n1 * n2;
        }else if(operacion.equals("-")){
            x = n1 - n2;
        }else if(operacion.equals("+")){
            x = n1 + n2;
        }

        tvPantalla.setText(x + "");
        n1 = 0.0f;
        n2 = 0.0f;
        operacion = "";
    }
}