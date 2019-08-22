package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailParselable extends AppCompatActivity {
    public static final String EXTRA_DATA ="data";
    Student student;
    TextView tvName,tvRool,tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_parselable);
        tvName =findViewById(R.id.tv_det_name);
        tvRool=findViewById(R.id.tv_det_roll);
        tvAge=findViewById(R.id.tv_det_Age);
        setTitle("Intent Using Parselable");

        Intent intent=getIntent();
        student=intent.getParcelableExtra(EXTRA_DATA);

        tvName.setText(student.getName());
        tvAge.setText(""+student.getAge());
        tvRool.setText(""+student.getRollno());
    }
}
