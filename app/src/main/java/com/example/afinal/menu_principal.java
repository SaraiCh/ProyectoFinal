package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void run_menu(View view) {
        Intent i_menu = new Intent(this,menu_platos.class);
        startActivity(i_menu);
    }

    public void run_reserva(View view) {
    }

    public void run_informacion(View view) {
        Intent i_informacion = new Intent(this,menu_informacion.class);
        startActivity(i_informacion);
    }

    public void run_op_pago(View view) {
        Intent i_pagos = new Intent(this,menu_pagos.class);
        startActivity(i_pagos);
    }
}