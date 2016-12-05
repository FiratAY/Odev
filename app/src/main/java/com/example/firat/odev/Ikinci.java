package com.example.firat.odev;

/**
 * Created by FIRAT on 21.11.2016.
 */
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Ikinci extends AppCompatActivity {
    TextView text_baslik;
    Button geri, ileri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ikinci);

        //denemeliktir burası
        VeriTabani vt=new VeriTabani(Ikinci.this);
        List<String> liste=new ArrayList<String>();
        liste=vt.sorugu();
        String a=vt.sorgula(1);
        String bir=liste.get(0);

        text_baslik=(TextView)findViewById(R.id.text_baslik);
        text_baslik.setText(bir);
        geri=(Button)findViewById(R.id.geri);
        ileri=(Button)findViewById(R.id.sonra);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt=new Intent(getApplicationContext(),GirisActivity.class);
                startActivity(intt);
            }
        });
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intr=new Intent(getApplicationContext(),Ucuncu.class);
                startActivity(intr);
            }
        });
    }
}