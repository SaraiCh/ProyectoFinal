package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class ventana_crear_cuenta extends AppCompatActivity {

    EditText nombre,apellido,email, contraseña;
    MaterialButton crear;
    CheckBox mostrar_contraseña;
    Intent irLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_crear_cuenta);

        nombre = findViewById(R.id.et_nombre);
        apellido = findViewById(R.id.et_apellido);
        email = findViewById(R.id.et_email);
        contraseña = findViewById(R.id.et_contraseña);
        mostrar_contraseña = findViewById(R.id.mostrarContraseña);

        crear = findViewById(R.id.btn_crearCuenta);


    }

    public void clickIrLogin(View view) {

        String nom = nombre.getText().toString();
        String ape = apellido.getText().toString();
        String eml = email.getText().toString();
        String contra = contraseña.getText().toString();

        if (!nom.equals("") && !ape.equals("") && !eml.equals("") && !contra.equals("")){
            Intent i = new Intent(this,activity_ventana_login.class);
            i.putExtra("nombre",nom);
            i.putExtra("clave",contra);
            finish();
        }else{
            Toast.makeText(this,"Porfavor complete todos los campos", Toast.LENGTH_SHORT).show();
        }


    }

    public void clickCheckBox(View view) {
        if(mostrar_contraseña.isChecked()){
            contraseña.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            Toast.makeText(ventana_crear_cuenta.this,"Check Presionado", Toast.LENGTH_SHORT).show();
        }
        if(!mostrar_contraseña.isChecked()){
            contraseña.setTransformationMethod(PasswordTransformationMethod.getInstance());
            Toast.makeText(ventana_crear_cuenta.this,"Check Desmarcado", Toast.LENGTH_SHORT).show();
        }
    }
}