package com.example.medicinescheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SeeMedicineScreen extends AppCompatActivity {

    //Button home_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_medicine_screen);

        openMainActivity();
        gatherUserInformation();

    }

    //GO HOME
    private void openMainActivity() {
        Button home_Button = (Button) findViewById(R.id.home_Button);
        home_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SeeMedicineScreen.this , MainActivity.class));
                //startActivity should direct see medicine screen to home/"main activity"
            }
        });
    }

    //gets information from AddMedicineScreen
    private void gatherUserInformation() {
        Intent intent = getIntent();

        String medicationName = intent.getStringExtra(AddMedicineScreen.EXTRA_TEXT);
        String medicationDose = intent.getStringExtra(AddMedicineScreen.EXTRA_NUMBER);

        TextView medNameView = (TextView) findViewById(R.id.addedMedScreenMedName);
        TextView medDoseView = (TextView) findViewById(R.id.addedMedScreenMedDose);

        medNameView.setText(medicationName);
        medDoseView.setText(medicationDose);
    }
}