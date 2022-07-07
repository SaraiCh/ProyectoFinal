package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_platos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_platos);
    }

    public void run_hamburguesas(View view) {
        Intent intent = new Intent(menu_platos.this, intfz_hamburguesa2.class);
        startActivity(intent);
    }

    public void run_bebidas(View view) {
    }

    public void run_pizzas(View view) {
    }

    public void run_piqueos(View view) {
    }

    public void run_helados(View view) {
    }
}