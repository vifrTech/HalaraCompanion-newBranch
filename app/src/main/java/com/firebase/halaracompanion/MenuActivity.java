package com.firebase.halaracompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button buttonJA;
    private Button buttonSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        buttonJA=(Button) findViewById(R.id.jointAttentionButton);
        buttonSI=(Button) findViewById(R.id.socialInteractionButton);
        buttonJA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });

        buttonSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });
    }

    public void openSettings(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}