package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class activity_ventana_login extends AppCompatActivity {

    EditText usuario,contraseña;
    CheckBox mostrar_contraseña;
    MaterialButton registrarse,crear_cuenta;
    Intent ventana_crear_cuenta,menuPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_login);

        usuario = findViewById(R.id.usuario);
        contraseña = findViewById(R.id.contraseña);
        mostrar_contraseña = findViewById(R.id.mostrarContrasea);
        registrarse = findViewById(R.id.btn_registrar);
        crear_cuenta = findViewById(R.id.btn_crearCuenta);
        ventana_crear_cuenta = new Intent(this, com.example.afinal.ventana_crear_cuenta.class);
        menuPrincipal = new Intent(this,com.example.afinal.menu_principal.class);

        String nom = getIntent().getStringExtra("nombre");
        String clave = getIntent().getStringExtra("clave");

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usuario.getText().toString().equals("Admin")&&contraseña.getText().toString().equals("admin")){
                    Toast.makeText(activity_ventana_login.this,"Bienvenido",Toast.LENGTH_SHORT).show();
                    startActivity(menuPrincipal);
                }
                if(usuario.getText().toString().equals(nom)&&contraseña.getText().toString().equals(clave)) {
                    Toast.makeText(activity_ventana_login.this, "Bienvenido", Toast.LENGTH_SHORT).show();
                    startActivity(menuPrincipal);
                }
                else{
                    Toast.makeText(activity_ventana_login.this,"Datos Incorrectos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void clickCheckBox(View view) {
        if(mostrar_contraseña.isChecked()){
            contraseña.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            Toast.makeText(activity_ventana_login.this,"Check Presionad", Toast.LENGTH_SHORT).show();
        }
        if(!mostrar_contraseña.isChecked()){
            contraseña.setTransformationMethod(PasswordTransformationMethod.getInstance());
            Toast.makeText(activity_ventana_login.this,"Check Desmarcado", Toast.LENGTH_SHORT).show();
        }
    }
    public void clickCrear(View view) {
        startActivity(ventana_crear_cuenta);
    }

    public void clickValidar(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"BD",null,1);
        SQLiteDatabase BD = admin.getWritableDatabase();

        String usu = usuario.getText().toString();
        String contra = contraseña.getText().toString();

        if (!usu.isEmpty() && !contra.isEmpty()){
            Cursor fila = BD.rawQuery("select * from crear_cuenta where nombre ="+usu+" and contraseña ="+contra,null);
        } else {
            Toast.makeText(this,"Debes llenar los campos",Toast.LENGTH_SHORT).show();
        }
    }
}