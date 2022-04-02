package com.example.formularios;

import static android.graphics.Color.BLACK;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.formularios.models.PersonasModel;

import java.util.LinkedList;
import java.util.List;

public class MenuAplicacion extends AppCompatActivity implements View.OnClickListener {

    private Button goToPeople;
    private Button goToCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_aplicacion);
        setContentViewAttribute();
        setContentViewEvents();
        SharedPreferences sp = getSharedPreferences("Aplicacion",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Nombre", "Diego");
        editor.commit();
    }

    private void setContentViewEvents() {
        goToPeople.setOnClickListener(this);
        goToCars.setOnClickListener(this);

    }

    public void setContentViewAttribute(){
        goToPeople = findViewById(R.id.btnGoToPeople);
        goToCars = findViewById(R.id.bntGoToCars);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnGoToPeople:
                goToPeopleAction();
                break;
            case R.id.bntGoToCars:
                goToCarsAction();
        }
    }

    private void goToCarsAction() {
        Toast.makeText(this,"Diste clic en Carros", Toast.LENGTH_LONG).show();
    }

    private void goToPeopleAction() {
      //  Toast.makeText(this,"Diste clic en Personas", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MenuAplicacion.this,Personas.class);
        startActivity(intent);

    }


}