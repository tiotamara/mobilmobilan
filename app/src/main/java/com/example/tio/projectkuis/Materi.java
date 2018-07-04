package com.example.tio.projectkuis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * Created by tio on 01/07/18.
 */

public class Materi extends AppCompatActivity{
    CardView bab1, bab2, bab3, bab4, bab5, bab6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_materi);
        bab1 = (CardView) findViewById(R.id.cardBab1);
        bab2 = (CardView) findViewById(R.id.cardBab2);
        bab3 = (CardView) findViewById(R.id.cardBab3);
        bab4 = (CardView) findViewById(R.id.cardBab4);
        bab5 = (CardView) findViewById(R.id.cardBab5);
        bab6 = (CardView) findViewById(R.id.cardBab6);

        bab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Materi.this, BabSatu.class);
                startActivity(i); //jalankan Intent
            }
        });
        bab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Materi.this, babDua.class);
                startActivity(i); //jalankan Intent
            }
        });
        bab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Materi.this, babTiga.class);
                startActivity(i); //jalankan Intent
            }
        });
        bab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Materi.this, babEmpat.class);
                startActivity(i); //jalankan Intent
            }
        });
        bab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Materi.this, babLima.class);
                startActivity(i); //jalankan Intent
            }
        });
        bab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Materi.this, babEnam.class);
                startActivity(i); //jalankan Intent
            }
        });
    }
}
