package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class BeautifulCountry extends AppCompatActivity {

    Button find;
    String [] countries= {"Bangladesh","Spain","India","Pakistan","Italy","Finland","England"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beautiful_country);
        find=findViewById(R.id.find);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random= new Random();
                int value= random.nextInt(countries.length);
                Toast.makeText(BeautifulCountry.this,countries[value],Toast.LENGTH_LONG).show();

            }
        });
    }
}
