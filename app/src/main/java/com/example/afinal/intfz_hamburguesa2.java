package com.example.afinal;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class intfz_hamburguesa2 extends AppCompatActivity {
    List<ListElementHamburguesa> listaHamburguesa = new ArrayList<>();
    List<String> listanombres = new ArrayList<>();
    List<Double> listaprecio = new ArrayList<>();
    List<Integer> listacantidad = new ArrayList<>();
    EditText cantk,cants,cantm,cantv;
    MaterialButton chekkanger,checksimple,checkmonster,checkvegan;
    double total;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intfz_hamburguesa2);
        chekkanger = findViewById(R.id.checkcarrito1);
        checksimple = findViewById(R.id.checkcarrito2);
        checkmonster = findViewById(R.id.checkcarrito3);
        checkvegan = findViewById(R.id.checkcarrito4);
        cantk = findViewById(R.id.cant1);
        cants = findViewById(R.id.cant2);
        cantm = findViewById(R.id.cant3);
        cantv = findViewById(R.id.cant4);
        listaHamburguesa.add(new ListElementHamburguesa("Kangre Burger",10.7));
        listaHamburguesa.add(new ListElementHamburguesa("Hamburguesa Simple",4.50));
        listaHamburguesa.add(new ListElementHamburguesa("Hamburguesa Monster",12.9));
        listaHamburguesa.add(new ListElementHamburguesa("Opción Vegana",8.9));


    }

    public void gotocarrito(View view) {
        Intent intent = new Intent(this, interfaz_carrito.class);
        startActivity(intent);
        intent.putExtra("nombres", (Serializable) listanombres);
        intent.putExtra("precio", (Serializable) listaprecio);
        intent.putExtra("cantidad", (Serializable) listacantidad);
    }

    public void carrito1(View view) {
        int cantidad = Integer.parseInt(cantk.getText().toString());
        listanombres.add(listaHamburguesa.get(0).getNombreHamburguesa());
        listaprecio.add(listaHamburguesa.get(0).getPrecio());
        listacantidad.add(cantidad);
        total = total+Double.parseDouble(cantk.getText().toString())*listaHamburguesa.get(0).getPrecio();
    }

    public void carrito2(View view) {
        int cantidad = Integer.parseInt(cants.getText().toString());
        listanombres.add(listaHamburguesa.get(1).getNombreHamburguesa());
        listaprecio.add(listaHamburguesa.get(1).getPrecio());
        listacantidad.add(cantidad);
        total = total+Double.parseDouble(cantk.getText().toString())*listaHamburguesa.get(1).getPrecio();
    }

    public void carrito3(View view) {
        int cantidad = Integer.parseInt(cantm.getText().toString());
        listanombres.add(listaHamburguesa.get(2).getNombreHamburguesa());
        listaprecio.add(listaHamburguesa.get(2).getPrecio());
        listacantidad.add(cantidad);
        total = total+Double.parseDouble(cantk.getText().toString())*listaHamburguesa.get(2).getPrecio();
    }

    public void carrito4(View view) {
        int cantidad = Integer.parseInt(cantv.getText().toString());
        listanombres.add(listaHamburguesa.get(3).getNombreHamburguesa());
        listaprecio.add(listaHamburguesa.get(3).getPrecio());
        listacantidad.add(cantidad);
        total = total+Double.parseDouble(cantk.getText().toString())*listaHamburguesa.get(3).getPrecio();
    }
}