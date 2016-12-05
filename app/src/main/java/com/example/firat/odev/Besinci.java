package com.example.firat.odev;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.firat.odev.R;

public class Besinci extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.besinci);
        textView = (TextView) findViewById(R.id.textView6);
        ImageView img=(ImageView)findViewById(R.id.imageView);


        //ileri geri butonları
        Button geri=(Button)findViewById(R.id.geri);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt=new Intent(getApplicationContext(),Dorduncu.class);
                startActivity(intt);
            }
        });

        Button ileri=(Button)findViewById(R.id.ileri);
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intr=new Intent(getApplicationContext(),Altinci.class);
                startActivity(intr);
            }
        });
    }
}