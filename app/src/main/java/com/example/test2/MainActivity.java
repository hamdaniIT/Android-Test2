package com.example.test2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity,btnMoveWithData;
    Button btnMoveWithObject;
    Button btnDialPhone,btnMoveWinthResult;
    TextView tvResultM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity=findViewById(R.id.btn_move_activity);
        btnMoveWithData=findViewById(R.id.btn_move_with_data);
        btnMoveWithObject=findViewById(R.id.btn_move_activity_object);
        btnDialPhone=findViewById(R.id.btn_dial_number);
        btnMoveWinthResult=findViewById(R.id.btn_intent_with_result);
        tvResultM=findViewById(R.id.tv_result_main);
        //
        btnMoveWithData.setOnClickListener(this);
        btnMoveActivity.setOnClickListener(this);
        btnDialPhone.setOnClickListener(this);
        btnMoveWithObject.setOnClickListener(this);
        btnMoveWinthResult.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
                break;
            case R.id.btn_move_with_data:
                intent = new Intent(MainActivity.this, Activity3withData.class);
                intent.putExtra(Activity3withData.EXTRA_NAME,"Hamdani");
                intent.putExtra(Activity3withData.EXTRA_AGE,"23 tahun");
                startActivity(intent);
                break;
            case R.id.btn_move_activity_object:
                intent = new Intent(MainActivity.this, LatihanIntentParcelable.class);
                startActivity(intent);
                break;
            case R.id.btn_dial_number:
                String numberPhone="082350021215";
                intent= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ numberPhone));
                startActivity(intent);
                break;
            case R.id.btn_intent_with_result:
                intent = new Intent(MainActivity.this,ActivityResult.class);
                intent.putExtra(ActivityResult.EXTRA_NUMBER1,2);
                intent.putExtra(ActivityResult.EXTRA_NUMBER2,4);
                startActivityForResult(intent,1);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                tvResultM.setText(""+data.getIntExtra(ActivityResult.EXTRA_RESINT,0));
            }else if(resultCode==RESULT_CANCELED){
                tvResultM.setText(""+data.getIntExtra(ActivityResult.EXTRA_RESINT,0));
            }
        }
    }
}
