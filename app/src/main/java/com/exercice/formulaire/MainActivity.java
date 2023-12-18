package com.exercice.formulaire;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
@RequiresApi(api = 26)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_entrer = (Button)findViewById(R.id.btn_entrer);
        EditText nom = (EditText) findViewById(R.id.txtNom);
        EditText prenom = (EditText) findViewById(R.id.txtPrenom);

        btn_entrer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String unNom = String.valueOf(nom.getText());
                String unPrenom = String.valueOf(prenom.getText());

                String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                authentification a1 = new authentification(unNom,unPrenom,date,time);

                Intent intent = new Intent(MainActivity.this, Formulaire.class);
                startActivity(intent);

            }
        });
    }
}