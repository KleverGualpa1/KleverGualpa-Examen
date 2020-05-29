package com.example.klevergualpa_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {
    EditText etdato1,etdato2,etdato3,etdato4,etdato5,etdato6;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2,cb3;
    Bundle datoRecibido;
    TextView tvrecibir1,tvrecibir2,tvrecibir3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        //dato para enviar
        etdato1= findViewById(R.id.et1);
        etdato5= findViewById(R.id.et5);
        etdato6=findViewById(R.id.etNombre6);

// dato recibido
        tvrecibir1=findViewById(R.id.et1);
        tvrecibir2=findViewById(R.id.et5);
        tvrecibir3=findViewById(R.id.etNombre6);
        datoRecibido=getIntent().getExtras();

        String recibirDato = datoRecibido.getString("dato");
        String recibirDato1 = datoRecibido.getString("dato2");
        String recibirDato2 = datoRecibido.getString("dato9");


        tvrecibir1.setText(recibirDato);
        tvrecibir2.setText(recibirDato1);
        tvrecibir3.setText(recibirDato2);

 //CheckBox
        cb1= (CheckBox) findViewById(R.id.check);
        cb2=(CheckBox)findViewById(R.id.cb2);
        cb3=(CheckBox)findViewById(R.id.cb3);
//Radio
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);

    }

    public void enviarDatosEncuesta(View v){

        // EditText
        Intent inttento = new Intent(this, Resumen.class);
        inttento.putExtra("dato",etdato1.getText().toString());
        inttento.putExtra("dato4",etdato5.getText().toString());
        inttento.putExtra("dato5",etdato6.getText().toString());


        Toast.makeText(getApplicationContext(),"Guardado con exito", Toast.LENGTH_SHORT).show();


        // Check
        String enviar1 = cb1.getText().toString();
        String enviar2 = cb2.getText().toString();
        String enviar3 = cb3.getText().toString();
        inttento.putExtra("dato2",enviar1+" ;"+enviar2+" ;"+enviar3);


        // Radio
        String radio1=rb1.getText().toString();
        String radio2=rb2.getText().toString();

        // Check

        if(cb1.isChecked()==true){
            inttento.putExtra("dato2",enviar1);
        }

        if(cb2.isChecked()==true){
            inttento.putExtra("dato2",enviar2);
        }

        if(cb3.isChecked()==true){
            inttento.putExtra("dato2",enviar3);
        }

        //Radio

        if(rb1.isChecked()==true){
            inttento.putExtra("dato3",radio1);
        }

        if(rb2.isChecked()==true){
            inttento.putExtra("dato3",radio2);
        }
        startActivity(inttento);
    }

}
