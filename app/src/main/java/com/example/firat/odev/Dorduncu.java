package com.example.firat.odev;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.firat.odev.R;

public class Dorduncu extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dorduncu);
        textView=(TextView)findViewById(R.id.textView5);

        Button btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Kurum içi yazılımlar böyle yapılır");
            }
        });

        Button btn3=(Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Tedarikçiden satın alınan yazılımlardır");
            }
        });

        Button btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("açık kaynak kullanılann yazılımlardır");
            }
        });

        //ileri geri butonları
        Button geri=(Button)findViewById(R.id.geri);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt=new Intent(getApplicationContext(),Ucuncu.class);
                startActivity(intt);
            }
        });

        Button ileri=(Button)findViewById(R.id.ileri);
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intr=new Intent(getApplicationContext(),Besinci.class);
                startActivity(intr);
            }
        });
    }

}