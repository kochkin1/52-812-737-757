package com.example.a52_812;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends ListActivity {

    String[] things = {"Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай", "Сопрано"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, things);
        setListAdapter(adapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent intent1 = new Intent(MainActivity.this, argentina.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(MainActivity.this, brasilia.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(MainActivity.this, chili.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(MainActivity.this, columbia.class);
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(MainActivity.this, urugvai.class);
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(MainActivity.this, soprano.class);
                        startActivity(intent6);
                        break;
                }
                Toast.makeText(getApplicationContext(),"вы выбрали" + parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
            }
        };
        getListView().setOnItemClickListener(itemListener);
    }
}