package com.example.medicinescheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AddMedicineScreen extends AppCompatActivity {

    //This is the 'screen' that will hold all the information
    //boxes required to add a new medication.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine_screen);
    }
}