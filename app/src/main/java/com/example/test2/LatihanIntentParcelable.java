package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LatihanIntentParcelable extends AppCompatActivity {
    Student student;
    EditText etName,etRollno,etAge;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_intent_parcelable);

        etName=findViewById(R.id.Ed_Name);
        etAge=findViewById(R.id.Ed_Age);
        etRollno=findViewById(R.id.Ed_RollNo);
        button=findViewById(R.id.E_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                student=new Student(Integer.parseInt(etRollno.getText().toString()),etName.getText().toString(),Integer.parseInt(etAge.getText().toString()));
                Intent intent=new Intent(LatihanIntentParcelable.this,DetailParselable.class);
                intent.putExtra(DetailParselable.EXTRA_DATA, student);
                startActivity(intent);

            }
        });

    }
}
