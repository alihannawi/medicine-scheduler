package com.example.medicinescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /*
    Intents work roughly like so:
    Intent intent = new Intent(theActivityYouAreIn.this, theActivityYouWantToGoTo.class);
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Only method calls should go in onCreate. */

        openAddMedicineScreen();
        openSeeMedicineScreen();

    }

    private void openAddMedicineScreen(){
        Button add_new_medicine_button = (Button) findViewById(R.id.add_new_medicine_button);
        add_new_medicine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddMedicineScreen.class));
            }
        });
    }

    private void openSeeMedicineScreen(){
        Button see_medicine_list_button = (Button) findViewById(R.id.see_medicine_list_button);
        see_medicine_list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SeeMedicineScreen.class));
            }
        });
    }
}