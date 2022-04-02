package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;
import com.example.formularios.models.PersonasModel;
import com.sdsmdg.tastytoast.TastyToast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;


public class Personas extends AppCompatActivity {

    PersonasModel person;
    PersonasModel person1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas);
        person = new PersonasModel();
        person1 = new PersonasModel("Diego","Franco",20,"");
        person.setEdad("25");
       // String mensaje = (person.getEdad()<0)? "La edad tiene un formato incorrecto" : "La edad es "+ person.getEdad();
       // Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
        SharedPreferences spGet = getSharedPreferences("Aplicacion", MODE_PRIVATE);
       String name = spGet.getString("Nombre","NA");
        TastyToast.makeText(getApplicationContext(), "Hello World !"+name, TastyToast.LENGTH_LONG, TastyToast.SUCCESS);


    }
}