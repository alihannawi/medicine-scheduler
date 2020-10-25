package com.example.medicinescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Ignore all this for now
    /*
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
     */

    Button add_new_medicine_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        add_new_medicine_button = (Button) findViewById(R.id.add_new_medicine_button);
        add_new_medicine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, AddMedicineScreen.class);
        startActivity(intent);
    }
}