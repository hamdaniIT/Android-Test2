package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3withData extends AppCompatActivity {
    public static final String EXTRA_NAME="extra_name";
    public static final String EXTRA_AGE="extra_age";

    TextView tvName,tvAge;
    String name, age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3with_data);
        Intent intent=getIntent();
        tvName=findViewById(R.id.tv_name);
        tvAge=findViewById(R.id.tv_age);
        name= intent.getStringExtra(EXTRA_NAME);
        age= intent.getStringExtra(EXTRA_AGE);
        tvName.setText(name);
        tvAge.setText(age);
    }
}
