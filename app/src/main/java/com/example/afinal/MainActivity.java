package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    ImageView imv_portada;
    MaterialButton empezar;
    MediaPlayer mp_intro;

    int num_aleatorio = (int) (Math.random()*10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imv_portada = findViewById(R.id.iv_portada);
        empezar = findViewById(R.id.btn_empezar);

        int id;
        if (num_aleatorio == 0 || num_aleatorio == 10){
            id = getResources().getIdentifier("img_1","drawable",getPackageName());
            imv_portada.setImageResource(id);
        }else if (num_aleatorio == 1 || num_aleatorio == 9) {
            id = getResources().getIdentifier("img_2", "drawable", getPackageName());
            imv_portada.setImageResource(id);
        }else if (num_aleatorio == 2 || num_aleatorio == 8) {
            id = getResources().getIdentifier("img_3", "drawable", getPackageName());
            imv_portada.setImageResource(id);
        }else if (num_aleatorio == 3 || num_aleatorio == 7) {
            id = getResources().getIdentifier("img_4", "drawable", getPackageName());
            imv_portada.setImageResource(id);
        }else if (num_aleatorio == 4 || num_aleatorio == 5 || num_aleatorio == 6) {
            id = getResources().getIdentifier("img_5", "drawable", getPackageName());
            imv_portada.setImageResource(id);
        }

        mp_intro = MediaPlayer.create(this,R.raw.intro);
        mp_intro.start();
        mp_intro.setLooping(true);
    }

    public void clickEmpezar(View view) {
        mp_intro.stop();
        mp_intro.release();

        Intent intent = new Intent(this,activity_ventana_login.class);
        startActivity(intent);
        finish();

    }

    @Override
    public void onBackPressed(){

    }
}