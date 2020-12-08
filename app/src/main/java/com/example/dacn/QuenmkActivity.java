package com.example.dacn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class QuenmkActivity extends AppCompatActivity {
    private ListView listview;
    private String[] listdata;
    private ArrayAdapter<String> adapter;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quenmk);

        context = this;
        listview =(ListView) findViewById(R.id.lv);
        listdata = context.getResources().getStringArray(R.array.Listview);

        adapter= new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, listdata);
        listview.setAdapter(adapter);

    }
}