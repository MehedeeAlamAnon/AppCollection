package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class FindMyAge extends AppCompatActivity {

    EditText placeholder;
    Button age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_my_age);

        placeholder=findViewById(R.id.placeholder);
        age= findViewById(R.id.age);

        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(placeholder.getText().toString());
                int year= Calendar.getInstance().get(Calendar.YEAR);

                Toast.makeText(FindMyAge.this,"Your age is "+(year-value),Toast.LENGTH_LONG).show();
            }
        });
    }
}
