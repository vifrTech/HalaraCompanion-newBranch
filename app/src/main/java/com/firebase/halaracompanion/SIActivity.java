package com.firebase.halaracompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SIActivity extends AppCompatActivity {
//    TextView timeCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siactivity);
        //timeCounter=(TextView) findViewById(R.id.timeCounter);
    }

    public  void previous(View view){
        startActivity(new Intent(SIActivity.this,
                MenuActivity.class));
    }


}