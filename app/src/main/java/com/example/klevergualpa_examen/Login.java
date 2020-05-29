package com.example.klevergualpa_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1= findViewById(R.id.etUsuario);
        et2= findViewById(R.id.etPass);
    }

    public void EnviarDatoUnico (View v){
        String v_usr = et1.getText().toString();
        String v_pass = et2.getText().toString();

        if(v_usr.equals("estudiante2020") && v_pass.equals("uisrael2020")) {

            Intent inttento = new Intent(this, Registro.class);
            inttento.putExtra("dato",et1.getText().toString());
            Toast.makeText(getApplicationContext(),"Ingreso correcto ", Toast.LENGTH_SHORT).show();
            startActivity(inttento);
        }
        else{

            Toast.makeText(getApplicationContext(),"Usuario o Clave incorrectos",Toast.LENGTH_SHORT).show();
        }

    }
}
