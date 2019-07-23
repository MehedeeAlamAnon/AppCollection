package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LearningRecyclerview extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_recyclerview);

        List<String> data= new ArrayList<>();
        data.add("Vietnam");
        data.add("Croatia");
        data.add("Norway");
        data.add("Peru");
        data.add("Switzerland");
        MyAdapter myAdapter= new MyAdapter(LearningRecyclerview.this,data);

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }
}
