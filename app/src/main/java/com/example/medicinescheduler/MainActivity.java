package com.example.medicinescheduler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //I'm not sure if this is where functions and stuff should go or not... -GD

    //Create an array of MedicineEntry
    MedicineEntry medicineDatabase [] = new MedicineEntry[50];
    private MedicineEntry newEntry;


    //adds a new entry to medicineDatabase
    public MedicineEntry addEntryToArray(){

        return newEntry;
    }

    //removes a prior entry from medicineDatabase
    public void removeEntryFromArray(){

    }

    //allows user to edit an existing entry in medicineDatabase
    public void editEntryInArray(){

    }

    //Probably need some sort functions like by name/time

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}