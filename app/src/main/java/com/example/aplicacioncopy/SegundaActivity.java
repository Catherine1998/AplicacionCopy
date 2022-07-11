package com.example.aplicacioncopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SegundaActivity extends AppCompatActivity {

  private  TextView TextoNumeroR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        TextoNumeroR = findViewById(R.id.numeroRandom12);
        NumeroRandom();
    }

    public void IrPaginaPrincial (View view){
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);

    }

    public void NumeroRandom(){


        try{
            Random numR = new Random();
            Integer num =  numR.nextInt(10);
            TextoNumeroR.setText(num.toString());


        }catch (Exception e){
            Toast.makeText(this,"Algo salio mal", Toast.LENGTH_LONG).show();
        }
    }
}