package com.example.klevergualpa_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    TextView tvrecibir1,tvrecibir2,tvrecibir3,tvrecibir4,tvrecibir5;
    CheckBox cb1;
    RadioButton r1;
    Bundle datoRecibido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        tvrecibir2=findViewById(R.id.et3);
        tvrecibir1=findViewById(R.id.et2);
        tvrecibir3=findViewById(R.id.et4);
        tvrecibir4=findViewById(R.id.etNombre2);
        tvrecibir5=findViewById(R.id.etNombre6);

        datoRecibido=getIntent().getExtras();


        String recibirDato = datoRecibido.getString("dato");
        String recibirDato2 = datoRecibido.getString("dato2");
        String recibirDato3 = datoRecibido.getString("dato3");
        String recibirDato4 = datoRecibido.getString("dato4");
        String recibirDato5 = datoRecibido.getString("dato5");

        tvrecibir1.setText(recibirDato);
        tvrecibir2.setText(recibirDato2);
        tvrecibir3.setText(recibirDato3);
        tvrecibir4.setText(recibirDato4);
        tvrecibir5.setText(recibirDato5);
    }
}
