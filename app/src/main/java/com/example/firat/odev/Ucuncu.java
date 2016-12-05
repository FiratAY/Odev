package com.example.firat.odev;

/**
 * Created by FIRAT on 21.11.2016.
 */
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Ucuncu extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ucuncu);

        textView= (TextView) findViewById(R.id.textView);

        //ileri geri butonları
        Button geri=(Button)findViewById(R.id.geri);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt=new Intent(getApplicationContext(),Ikinci.class);
                startActivity(intt);
            }
        });
        Button ileri=(Button)findViewById(R.id.ileri);
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intr=new Intent(getApplicationContext(),Dorduncu.class);
                startActivity(intr);
            }
        });

        //seçiciler
        Button btn2=(Button)findViewById(R.id.button6);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("İşletim sistemi yazılımları");
            }
        });

        Button btn3=(Button)findViewById(R.id.button7);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("uygulamam yazılımla yazılımlardır");
            }
        });




    }
}