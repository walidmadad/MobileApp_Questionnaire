package com.exercice.formulaire;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_entrer = findViewById(R.id.btn_entrer);
        EditText nom = findViewById(R.id.txtNom);
        EditText prenom = findViewById(R.id.txtPrenom);

        btn_entrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unNom = String.valueOf(nom.getText());
                String unPrenom = String.valueOf(prenom.getText());


                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());

                String date = dateFormat.format(calendar.getTime());
                String time = timeFormat.format(calendar.getTime());

                Intent intentFormulaire = new Intent(MainActivity.this, Formulaire.class);
                intentFormulaire.putExtra("nom", unNom);
                intentFormulaire.putExtra("prenom", unPrenom);
                intentFormulaire.putExtra("date", date);
                intentFormulaire.putExtra("time", time);
                startActivity(intentFormulaire);
            }
        });
    }
}
