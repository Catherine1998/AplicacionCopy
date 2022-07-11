package com.example.aplicacioncopy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView valorACambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorACambiar = findViewById(R.id.txt_Valor);
    }

   public void incrementarDato (View view){
      try{
          String valor = valorACambiar.getText().toString();
          Integer Numero = Integer.parseInt(valor);
          Numero++;
          valorACambiar.setText(Numero + "");
      }catch (Exception e ){
          Toast.makeText(this,"Algo salio mal", Toast.LENGTH_LONG).show();
      }
    }

    public void MostrarMsj (View view){
        try{
            Toast.makeText(this,"Holi soy un msj secreto", Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(this, "Algo salio mal", Toast.LENGTH_SHORT).show();
        }
    }

    public void IraSegundaPagina (View view){
        Intent i = new Intent(this,SegundaActivity.class);
        startActivity(i);
    }
}