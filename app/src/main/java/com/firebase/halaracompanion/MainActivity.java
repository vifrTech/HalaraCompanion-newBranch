package com.firebase.halaracompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Switch eyeTracking;
    Switch person;
    Switch background;
    Switch distraction;
    Switch music;
    EditText difficultyValue;
    EditText volumeValue;
    EditText brightnessValue;
    Button saveDataButton;

    DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eyeTracking = findViewById(R.id.eyetracking);
        person = findViewById(R.id.person);
        background = findViewById(R.id.background);
        distraction = findViewById(R.id.distraction);
        music = findViewById(R.id.music);
        difficultyValue = findViewById(R.id.difficultylevel);
        volumeValue = findViewById(R.id.volumelevel);
        brightnessValue = findViewById(R.id.brightnesslevel);
        saveDataButton = findViewById(R.id.savedatabutton);

        dbRef = FirebaseDatabase.getInstance().getReference().child("Social Interaction").child("Scene Settings");

        saveDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData();
                startSession();
            }
        });
    }

    public void startSession(){
        Intent intent=new Intent(this,SIActivity.class);
        startActivity(intent);
    }

    private void insertData() {
        boolean eyeTrackingState = eyeTracking.isChecked();
        boolean personState = person.isChecked();
        boolean backgroundState = background.isChecked();
        boolean distractionState = distraction.isChecked();
        boolean musicState = music.isChecked();

        Integer difficulty = Integer.parseInt(difficultyValue.getText().toString());
        Integer brightness = Integer.parseInt(brightnessValue.getText().toString());
        Integer volume = Integer.parseInt(volumeValue.getText().toString());

        SocialSceneSettings settings = new SocialSceneSettings(eyeTrackingState, personState, backgroundState,
                                                               distractionState, musicState, difficulty,
                                                               volume, brightness);

        dbRef.setValue(settings);
        Toast.makeText(MainActivity.this, "Data Inserted!", Toast.LENGTH_SHORT).show();
    }
}