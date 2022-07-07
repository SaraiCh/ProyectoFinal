package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.telecom.TelecomManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class interfaz_carrito extends AppCompatActivity {
    List<Item_carrito_objeto> elements;
    List<String> listanombres = new ArrayList<>();
    List<Double> listaprecio = new ArrayList<>();
    List<Integer> listacantidad = new ArrayList<>();
    RecyclerView rcvcarro;
    TextView txttotal;
    carritoadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_carrito);
        //elements = (List<Item_carrito_objeto>) getIntent().getSerializableExtra("Carro de compra");
        /*listanombres = (List<String>) getIntent().getSerializableExtra("nombres");
        listaprecio = (List<Double>) getIntent().getSerializableExtra("precio");
        listacantidad = (List<Integer>) getIntent().getSerializableExtra("cantidad");*/
        
        rcvcarro = findViewById(R.id.rcvBolsaCompras);
        rcvcarro.setLayoutManager(new LinearLayoutManager(interfaz_carrito.this));
        listanombres.add("KangerBurger");
        listanombres.add("Opción vegana");
        listaprecio.add(10.7);
        listaprecio.add(8.9);
        listacantidad.add(1);
        listacantidad.add(2);

        adapter = new carritoadapter(interfaz_carrito.this,txttotal,listanombres,listaprecio,listacantidad);
        rcvcarro.setAdapter(adapter);
    }

}