package com.example.klevergualpa_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText etdato1,etdato2,etdato3,etdato4,etdato5,etdato6;
    TextView tvrecibir1;
    Bundle datoRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        etdato1= findViewById(R.id.etNombre1);
        etdato2= findViewById(R.id.etNombre2);
        etdato3= findViewById(R.id.etNombre3);
        etdato4= findViewById(R.id.etNombre4);
        etdato5= findViewById(R.id.etNombre5);
//dato para enviar
        etdato6= findViewById(R.id.etNombre6);
//Recibir dato
        tvrecibir1=findViewById(R.id.etNombre6);
        datoRecibido=getIntent().getExtras();

        String recibirDato = datoRecibido.getString("dato");
        tvrecibir1.setText(recibirDato);

    }

    public void CalcularValores (View v){

        int valor1, valor2,valor3;
        double res1,res2,res3;
        valor1=Integer.parseInt(etdato2.getText().toString());
        valor2=Integer.parseInt(etdato3.getText().toString());


        res1 = ((((valor1) - (valor2))/3))*1.05;
        res2= res1*3;
       // res2= ((valor1-valor2)+res1*3);

        etdato4.setText(Double.toString(res1));
        etdato5.setText(Double.toString(res2));
    }


    public void enviarDatosRegistro (View v){

        // EditText

        Intent inttento = new Intent(this, Encuesta.class);
        inttento.putExtra("dato",etdato1.getText().toString());
        inttento.putExtra("dato2",etdato5.getText().toString());
        inttento.putExtra("dato9",etdato6.getText().toString());

        Toast.makeText(getApplicationContext(),"Se guardado con exito", Toast.LENGTH_SHORT).show();
        startActivity(inttento);
    }




}
