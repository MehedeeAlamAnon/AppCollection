package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class BioActivity extends AppCompatActivity {

    EditText name,details;
    RadioGroup gender;
    RadioButton radioButton;
    CheckBox c,cpp,java,android;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        name=findViewById(R.id.name);
        details=findViewById(R.id.details);
        gender=findViewById(R.id.gender);
        c=findViewById(R.id.c);
        cpp=findViewById(R.id.cpp);
        java=findViewById(R.id.java);
        android=findViewById(R.id.android);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuffer buffer= new StringBuffer();
                buffer.append("Hello"+name.getText().toString());
                buffer.append("\nDescription: \n"+details.getText().toString());

                radioButton=findViewById(gender.getCheckedRadioButtonId());
                buffer.append("\nYour Gender is: "+radioButton.getText().toString());

                buffer.append("\nYour skills are: ");
                buffer.append("\nC: "+c.isChecked());
                buffer.append("\nC++: "+cpp.isChecked());
                buffer.append("\nJava: "+java.isChecked());
                buffer.append("\nAndroid: "+android.isChecked());

                Log.d("Bio",buffer.toString());

            }
        });
    }
}
