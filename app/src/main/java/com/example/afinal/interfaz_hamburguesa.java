package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class interfaz_hamburguesa extends AppCompatActivity {
    List<ListElementHamburguesa> elements;
    RecyclerView rcvhamburguesas;
    RecyclerView.Adapter adapter;
    List<ListElementHamburguesa> carroCompras = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_hamburguesa);
        initVies();
        init();
    }
    public void initVies() {
        rcvhamburguesas = findViewById(R.id.rcvhamburguesaslista);
        elements = new ArrayList<>();

    }
    public void init() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rcvhamburguesas.setLayoutManager(manager);
        elements = getItems();
        adapter = new hamburguesaadaptador(elements,this);
        rcvhamburguesas.setAdapter(adapter);
    }
    public List<ListElementHamburguesa> getItems(){
        List<ListElementHamburguesa> itemLists = new ArrayList<>();
        itemLists.add(new ListElementHamburguesa("KangreBurger",34.0));
        itemLists.add(new ListElementHamburguesa("Simple",15.0));
        itemLists.add(new ListElementHamburguesa("Monster",34.0));
        itemLists.add(new ListElementHamburguesa("Opción Vegana",34.0));
        return itemLists;
    }

    public void tocarrito(View view) {
        Intent intent = new Intent(this, interfaz_carrito.class);
        startActivity(intent);
    }
}