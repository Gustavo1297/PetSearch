package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.LinearLayout;

public class Menu extends AppCompatActivity {

    LinearLayout irPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        irPerfil = (LinearLayout) findViewById(R.id.irPerfil);

    }

    public void irPerfil(View view){
        Intent intent = new Intent(this, PerfilUsuario.class);
        startActivity(intent);
    }

    public void irMenu(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void AdoptarMacosta(View view){
        Intent intent = new Intent(this, CatalogoAdopcion.class);
        startActivity(intent);
    }
    public void ReportarMascota(View view){

    }
    public  void RegistroMascota(View view){
        Intent intent = new Intent(this, RegistraMascota.class);
        startActivity(intent);
    }

}
