package com.example.medicinescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button add_new_medicine_button;
    Button see_medicine_list_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add_new_medicine_button = (Button) findViewById(R.id.add_new_medicine_button);
        see_medicine_list_button = (Button) findViewById(R.id.see_medicine_list_button);

        add_new_medicine_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddMedicineScreen();
            }
        });

        see_medicine_list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeeMedicineScreen();
            }
        });
    }
    public void openAddMedicineScreen(){
        Intent intent = new Intent(this, AddMedicineScreen.class);
        startActivity(intent);
    }

    public void openSeeMedicineScreen(){
        Intent intent = new Intent(this, SeeMedicineScreen.class);
        startActivity(intent);
    }
}