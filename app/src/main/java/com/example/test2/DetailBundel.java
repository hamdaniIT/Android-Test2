package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailBundel extends AppCompatActivity {
    public static final String EXTRA_B_DATA ="data";
    public static final String EXTRA_B_NAME ="bundel_name";
    public static final String EXTRA_B_AGE ="bundel_age";
    public static final String EXTRA_B_ROLL ="bundel_roll";
    TextView tvName,tvRool,tvAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bundel);
        setTitle("Intent Using Bundel");
        tvName =findViewById(R.id.tv_det_name);
        tvRool=findViewById(R.id.tv_det_roll);
        tvAge=findViewById(R.id.tv_det_Age);
        Intent inten=getIntent();
        Bundle bundel=inten.getBundleExtra(EXTRA_B_DATA);

        tvName.setText(bundel.getString(EXTRA_B_NAME));
        tvAge.setText(""+bundel.getInt(EXTRA_B_AGE));
        tvRool.setText(""+bundel.getInt(EXTRA_B_ROLL));
    }
}
