package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.IniciarSesion.OnFragmentInteractionListener;

public class Login extends AppCompatActivity {

    Button btnIniciarSesion;
    TextView textRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIniciarSesion = (Button) findViewById(R.id.btnInicio);
        textRegistro = (TextView) findViewById(R.id.textRegistro);
        }
        public void RegistroUsuario(View view){
            Intent registrousuario = new Intent(this, );

        }
    public void Login(View view){

    }



    }


