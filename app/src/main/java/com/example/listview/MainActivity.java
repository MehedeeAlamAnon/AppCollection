package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.Listview);
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.tutorials_array));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent=new Intent(MainActivity.this,CounterActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        Intent intent1=new Intent(MainActivity.this,Calculator.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2=new Intent(MainActivity.this,FindMyAge.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3=new Intent(MainActivity.this,BeautifulCountry.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4=new Intent(MainActivity.this,ImageLoading.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5=new Intent(MainActivity.this,Caching.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6=new Intent(MainActivity.this,BioActivity.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7=new Intent(MainActivity.this,LearningRecyclerview.class);
                        startActivity(intent7);
                        break;
                }
            }
        });
    }
}
