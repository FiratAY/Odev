package com.example.firat.odev;


import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GirisActivity extends AppCompatActivity {


    Button btn;
    TextView txt_yaz;
    TextView txt_tek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        txt_yaz= (TextView) findViewById(R.id.bas_tek);
        txt_tek= (TextView) findViewById(R.id.bas_yaz);
        btn=(Button)findViewById(R.id.sonra);


        VeriTabani vt=new VeriTabani(GirisActivity.this);
        vt.veriEkle();


        //butona tıklanınca yapılacaklar
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sonra=new Intent(getApplicationContext(),Ikinci.class);
                startActivity(sonra);
            }
        });


    }
}
