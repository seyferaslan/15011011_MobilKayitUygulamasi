package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String a,b;
    Button girisbuton;
    EditText textid;
    EditText textpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        girisbuton=(Button) findViewById(R.id.girisbuton);
        textid= (EditText) findViewById(R.id.idtext);
        textpass = (EditText) findViewById(R.id.editText9);

        girisbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a,b;
                a=textid.getText().toString();
                b=textpass.getText().toString();
                if(giris(a,b) == 1){
                    Toast.makeText(getApplicationContext(),"Giriş başarılı!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), StartPage.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(getApplicationContext(),"Giriş başarısız!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public int giris(String a,String b){
        if(a.equals("admin")){
            if(b.equals("password")){
                return 1;
            }
        }
        return 0;
    }

}














