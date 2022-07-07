package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class menu_informacion extends AppCompatActivity {

    Spinner listado;
    Button btnllamar_c,btnllamar_t;
    EditText nombre,apellido,email,numero_c,numero_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_informacion);

        listado =findViewById(R.id.lista);
        nombre =findViewById(R.id.nom);
        apellido =findViewById(R.id.ape);
        email =findViewById(R.id.email);
        numero_c = findViewById(R.id.cel);
        btnllamar_c = findViewById(R.id.llamar_c);
        numero_t =findViewById(R.id.casa);
        btnllamar_t = findViewById(R.id.llamar_t);

        ArrayList<String> productos = new ArrayList<>();
        productos.add("Atención al cliente");
        productos.add("Supervisor-sede-sur");
        productos.add("RRHH");
        productos.add("Soporte-informático");
        productos.add("Gerente-sede-sur");
        productos.add("Publicidad");


        ArrayAdapter<String> puente = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,productos);
        listado.setAdapter(puente);

        listado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                if ("Atención al cliente" == parent.getItemAtPosition(position).toString()) {
                    nombre.setText("Juan Carlos");
                    apellido.setText("Tito Carrizales");
                    email.setText("juan-carlos@tecup.edu.pe");
                    numero_c.setText("984421500");
                    numero_t.setText("5541297");
                }
                if ("Supervisor-sede-sur" == parent.getItemAtPosition(position).toString()) {
                    nombre.setText("Bryan Fredy");
                    apellido.setText("Garcia Mango");
                    email.setText("Bryan-Garcia@tecsup.edu.pe");
                    numero_c.setText("971446516");
                    numero_t.setText("5485497");

                }
                if ("RRHH" == parent.getItemAtPosition(position).toString()) {
                    nombre.setText("Jhonatan Ana");
                    apellido.setText("Tintales Quispe");
                    email.setText("Jhonatan-Tin@tecsup.pe");
                    numero_c.setText("915654654");
                    numero_t.setText("5613215");

                }
                if ("Soporte-informático" == parent.getItemAtPosition(position).toString()) {
                    nombre.setText("Tito Whisper");
                    apellido.setText("Carry Mendez");
                    email.setText("Tito-Carry@tecsup.edu.pe");
                    numero_c.setText("962246138");
                    numero_t.setText("5246165");

                }
                if ("Gerente-sede-sur" == parent.getItemAtPosition(position).toString()) {
                    nombre.setText("Juan Renato");
                    apellido.setText("Scofield Rodriguez");
                    email.setText("Juan-Scofield@tecsup.edu.pe");
                    numero_c.setText("946156861");
                    numero_t.setText("5413131");
                    ;

                }
                if ("Publicidad" == parent.getItemAtPosition(position).toString()) {
                    nombre.setText("Jesus Gabriel");
                    apellido.setText("Lujan Carrion");
                    email.setText("Jesus-Lujan@tecsup.edu.pe");
                    numero_c.setText("946512384");
                    numero_t.setText("5648916");

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    /*   btnllamar_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_c = new Intent(Intent.ACTION_DIAL, Uri.parse("cel:"+numero_c.getText().toString() ));
                startActivity(intent_c);
            }
        });

        btnllamar_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_t = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+numero_t.getText().toString() ));
                startActivity(intent_t);
            }
        }); */
    }


    public void llamarC(View view) {
        Intent intent_c = new Intent(Intent.ACTION_DIAL, Uri.parse("cel:"+numero_c.getText().toString() ));
        startActivity(intent_c);
    }

    public void llamarT(View view) {
        Intent intent_t = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+numero_t.getText().toString() ));
        startActivity(intent_t);
    }
}