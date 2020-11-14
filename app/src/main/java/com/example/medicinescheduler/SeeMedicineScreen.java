package com.example.medicinescheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeeMedicineScreen extends AppCompatActivity {

    Button home_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_medicine_screen);

        home_Button = (Button) findViewById(R.id.home_Button);

        home_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMainActivity();
            }
        });
    }

    public void openMainActivity() {

        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
}