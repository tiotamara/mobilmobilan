package com.example.tio.projectkuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class HasilSkoring extends AppCompatActivity {
    TextView mtvHasilAkhir;
    Button mbtnMenu,btnCobaLagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        String skorEssay = getIntent().getStringExtra("skorAkhir2");

        if(activity.equals("PilihanGanda")){
            if (parseInt(skorPilGan) > 70){
                setContentView(R.layout.activity_hasil_skoring);
            }else{
                setContentView(R.layout.activity_hasil_skoring_failed);
                btnCobaLagi = (Button) findViewById(R.id.btnCobaLagi);
                btnCobaLagi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(HasilSkoring.this, KuisPilihanGanda.class);
                        startActivity(i);
                        finish();
                    }
                });
            }
        }else{
            if (parseInt(skorEssay) > 70){
                setContentView(R.layout.activity_hasil_skoring);
            }else{
                setContentView(R.layout.activity_hasil_skoring_failed);
                btnCobaLagi = (Button) findViewById(R.id.btnCobaLagi);
                btnCobaLagi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(HasilSkoring.this, KuisEssay.class);
                        startActivity(i);
                        finish();
                    }
                });
            }
        }

        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        mbtnMenu = (Button) findViewById(R.id.btnMenu);

        setSkor();

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilSkoring.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    //method untuk mengatur skor yang akan ditampilkan pada textview
    public void setSkor(){
        //hasil lemparan (putExtra) dari activity sebelumnya ditampung dalam variabel lokal
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        String skorEssay = getIntent().getStringExtra("skorAkhir2");

        if(activity.equals("PilihanGanda")){ //jika var activity bernilai PilihanGanda
            //dipastikan activity sebelumnya datang dari kelas KuisPilihanGanda
            //maka skornya diatur dari skorPilGan
            mtvHasilAkhir.setText("SKOR : "+skorPilGan);
        }else{
            //dipastikan activity sebelumnya datang dari kelas KuisEssay
            //maka skornya diatur dari skorEssay
            mtvHasilAkhir.setText("SKOR : "+skorEssay);
        }
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        Toast.makeText(this, "Tidak bisa kembali, silahkan tekan menu", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }
}
