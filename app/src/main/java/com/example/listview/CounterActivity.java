package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    Button plus,minus;
    TextView placeholder;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        placeholder=findViewById(R.id.placeholder);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                placeholder.setText(counter+"");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter>0)
                {
                    counter--;
                    placeholder.setText(counter+"");
                }


            }
        });
    }
}
