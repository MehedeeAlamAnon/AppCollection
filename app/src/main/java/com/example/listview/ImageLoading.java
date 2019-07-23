package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageLoading extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loading);
        imageView=findViewById(R.id.testingImage);

        //int imageResource= getResources().getIdentifier("@drawable/anon",null,this.getPackageName());
        //imageView.setImageResource(imageResource);

        //String imageUri="https://square.github.io/picasso/static/sample.png";
        //Picasso.get().load(imageUri).into(imageView);

        Picasso.get().load("https://square.github.io/picasso/static/sample.png").into(imageView);
    }
}
