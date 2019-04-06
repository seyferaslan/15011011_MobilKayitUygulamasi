package com.example.myfirstapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class newActivity extends AppCompatActivity {
    TextView al;
    TextView al1;
    TextView al2;
    TextView al3;
    ImageView al4;
    TextView al5;
    TextView al6;
    TextView al7;
    Button aramabutonu;
    Button emailbutonu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        al=(TextView)findViewById(R.id.textView);
        al1=(TextView)findViewById(R.id.textView2);
        al2=(TextView)findViewById(R.id.textView3);
        al3=(TextView)findViewById(R.id.textView4);
        al4=(ImageView)findViewById(R.id.imageView2);
        al5=(TextView)findViewById(R.id.textView9);
        al6=(TextView)findViewById(R.id.textView13);
        al7=(TextView)findViewById(R.id.textView12);
        aramabutonu=(Button)findViewById(R.id.button4);
        emailbutonu=(Button)findViewById(R.id.button5);

        final Intent intent = getIntent();
        String ad = ((Intent) intent).getStringExtra("isim");
        String soyad = ((Intent) intent).getStringExtra("soyisim");
        String dogumyeri = ((Intent) intent).getStringExtra("dogumyeri");
        String tcno = ((Intent) intent).getStringExtra("tcno");
        String tarih = ((Intent) intent).getStringExtra("tarih");
        final String telno = ((Intent) intent).getStringExtra("telefon");
        final String email = ((Intent) intent).getStringExtra("email");
        /*Bundle extras = getIntent().getExtras();
        byte[] byteArray = extras.getByteArray("resim");
        Bitmap bitMap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        al4.setImageBitmap(bitMap);*/

        Bundle extras = getIntent().getExtras();
        Bitmap bmp = (Bitmap) extras.getParcelable("imagebitmap");
        al4.setImageBitmap(bmp );

        al.setText(ad);
        al1.setText(soyad);
        al2.setText(dogumyeri);
        al3.setText(tcno);
        al5.setText(tarih);
        al6.setText(telno);
        al7.setText(email);

        aramabutonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number= Uri.parse("tel:"+ telno);
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

        emailbutonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
                //emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"gonderilecekmailadresi"});
                emailIntent.putExtra( Intent.EXTRA_SUBJECT, "MyFirstApp'ten gönderildi." );
                emailIntent.putExtra( Intent.EXTRA_TEXT, "-My First App-" );
                emailIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(emailIntent, "E-mail Göndermek için Seçiniz:")); //birden fazla email uygulaması varsa seçmek için
            }
        });
    }

    public void ilerle(View view){
        Intent intent1 = new Intent(getApplicationContext(),recycle.class);
        startActivity(intent1);
    }
}
