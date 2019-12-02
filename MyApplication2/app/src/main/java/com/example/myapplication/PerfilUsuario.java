package com.example.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

public class PerfilUsuario extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageButton btnVerHistorial, btnVerPerdidos, btnVerAdopcion, btnCerrarSesion;
Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

     //   btnVerHistorial = (ImageButton) findViewById(R.id.btnVerHistorial);
    //    btnVerPerdidos= (ImageButton) findViewById(R.id.btnVerPerdidos);
    //    btnVerAdopcion = (ImageButton) findViewById(R.id.btnVerAdopcion);
        btnCerrarSesion = (ImageButton) findViewById(R.id.btnCerrarSesion);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setPrompt("Historial publicaciones");

        spinner.setAdapter(new NothingSelectedSpinnerAdapter(
                adapter,
                R.layout.contact_spinner_row_nothing_selected,
                // R.layout.contact_spinner_nothing_selected_dropdown, // Optional
                this));




    }



    public void cerrarSesion(View view){
//metodo cool para cerrar sesion, y que te va a llevar al login cuando te salgas

        Intent intent = new Intent(this, Login.class);
        startActivity(intent);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //aqui iran los fragments de HistorialPerdido e HistorialAdopcion
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
