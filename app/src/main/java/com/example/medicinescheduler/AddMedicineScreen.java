package com.example.medicinescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class AddMedicineScreen extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.medicinescheduler.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.medicinescheduler.EXTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine_screen);

        openSeeMedicineScreen();
        openMainActivity();

    }

    //GO BACK
    private void openMainActivity() {
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddMedicineScreen.this , MainActivity.class));
            }
        });
    }

    //CONFIRM AND GO TO SEE MEDICINE SCREEN
    private void openSeeMedicineScreen() {
        Button confirmButton = (Button) findViewById(R.id.confirmButton);
        //passUserInformation();

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etMedicationName = (EditText) findViewById(R.id.nameOfMedication);
                EditText etMedicationDose = (EditText) findViewById(R.id.medicineDosage);

                /*
                medicationDoseEntry might need to be an int variable
                if so, = Integer.parseInt(etMedicationDose.getText().toString());
                */
                String medicationNameEntry = etMedicationName.getText().toString();
                String medicationDoseEntry = etMedicationDose.getText().toString();

                Intent intent = new Intent(AddMedicineScreen.this, SeeMedicineScreen.class);
                intent.putExtra(EXTRA_TEXT, medicationNameEntry);
                intent.putExtra(EXTRA_NUMBER, medicationDoseEntry);
                startActivity(intent);
            }
        });
    }


    /*
    //gathers user entered information
    private void passUserInformation(){
        //etNameOfVariable where et denotes EditText variable
        EditText etMedicationName = (EditText) findViewById(R.id.nameOfMedication);
        EditText etMedicationDose = (EditText) findViewById(R.id.medicineDosage);

        *//*
        medicationDoseEntry might need to be an int variable
        if so, = Integer.parseInt(etMedicationDose.getText().toString());
        *//*
        String medicationNameEntry = etMedicationName.getText().toString();
        String medicationDoseEntry = etMedicationDose.getText().toString();

        Intent intent = new Intent(this, SeeMedicineScreen.class);
        intent.putExtra(EXTRA_TEXT, medicationNameEntry);
        intent.putExtra(EXTRA_NUMBER, medicationDoseEntry);
    }
    */


    /*
    //bool array, set to all false, when day of week selected, switch to true.
    boolean [] dayOfWeekArray = {false, false, false, false, false, false, false};

    //declare each day of the week checkbox
    CheckBox sunday;
    CheckBox monday;
    CheckBox tuesday;
    CheckBox wednesday;
    CheckBox thursday;
    CheckBox friday;
    CheckBox saturday;

    //checkbox array declaration
    CheckBox [] dayOfWeekCheckBoxArray = new CheckBox[] {};

    TextView medicationNameDisplay;
    TextView medicationDoseDisplay;






        //set each day of week checkbox to their respective variables
        sunday = (CheckBox) findViewById(R.id.checkSunday);
        monday = (CheckBox) findViewById(R.id.checkMonday);
        tuesday = (CheckBox) findViewById(R.id.checkTuesday);
        wednesday = (CheckBox) findViewById(R.id.checkWednesday);
        thursday = (CheckBox) findViewById(R.id.checkThursday);
        friday = (CheckBox) findViewById(R.id.checkFriday);
        saturday = (CheckBox) findViewById(R.id.checkSaturday);

        //insert medication name and dose into respective text view boxes
        //convert text entries to usable strings
        medicationNameEntry = medicationName.getText().toString();
        medicationDoseEntry = medicationDose.getText().toString();

        //confirm button should save entries from add medicine screen
        confirmButton = (Button) findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {


     */

}