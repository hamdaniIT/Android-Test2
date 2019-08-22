package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityResult extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_NUMBER1="number1";
    public static final String EXTRA_NUMBER2="number2";
    public static final String EXTRA_RESINT="result";
    int number1,number2,result;
    Button btnAdd,btnSubstrack;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        btnAdd=findViewById(R.id.btn_add);
        btnSubstrack=findViewById(R.id.btn_substrak);
        btnAdd.setOnClickListener(this);
        btnSubstrack.setOnClickListener(this);
        tvResult= findViewById(R.id.tv_result);

        Intent intent= getIntent();
        number1=intent.getIntExtra(EXTRA_NUMBER1,0);
        number2=intent.getIntExtra(EXTRA_NUMBER2,0);
        tvResult.setText("Number : "+number1+", "+number2 );
       // Toast.makeText(this,""+intent.getIntExtra(EXTRA_NUMBER1,0),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_add:
                Intent intentResult= new Intent();
                result=number1+number2;
                intentResult.putExtra(EXTRA_RESINT,result);
                setResult(RESULT_OK,intentResult);
                finish();
                break;
            case R.id.btn_substrak:
                intentResult= new Intent();
                result=number1-number2;
                intentResult.putExtra(EXTRA_RESINT,result);
                setResult(RESULT_OK,intentResult);
                finish();
                break;
        }
    }
}
