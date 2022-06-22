package com.firebase.halaracompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

import org.w3c.dom.Text;

public class SIActivity extends AppCompatActivity {

    TextView dummyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siactivity);
        dummyText=(TextView) findViewById(R.id.dummy);

    }

    public  void previous(View view){
        startActivity(new Intent(SIActivity.this,
                MenuActivity.class));
    }

    public void showData(int dummy){
        dummyText.setText(Integer.toString(dummy));

    }


}