package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class recycle extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i=0 ; i<=5 ; i++){
            ListItem listItem = new ListItem(
                    "BLM100" + (i),
                    "Harf Notu: AA"
            );
            listItems.add(listItem);
        }

        adapter = new Adapter(listItems,this);
        recyclerView.setAdapter(adapter);
    }
    public void next(View view){
        Intent intent2=new Intent(getApplicationContext(),recycleDetay.class);
        startActivity(intent2);
    }
}
