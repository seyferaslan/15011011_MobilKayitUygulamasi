package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class recycleDetay extends AppCompatActivity {
    TextView text1;
    TextView text2;
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_detay);

        text1=(TextView) findViewById(R.id.textView15);
        text2=(TextView) findViewById(R.id.textView16);
        text3=(TextView) findViewById(R.id.textView17);

        text1.setText("Ders Adı           : Mobil Programlamaya Giriş");
        text2.setText("Öğrenci Sayısı     : 50 kişi");
        text3.setText("Ders Not Ortalaması: 45");

    }
}
