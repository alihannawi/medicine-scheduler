package com.example.medicinescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddMedicineScreen extends AppCompatActivity {

    //This is the 'screen' that will hold all the information
    //boxes required to add a new medication.

    private EditText nameOfMedication , medicineDosage;
    private Button confirmButton , backButton;
    private static final String TAG = "MainActivity";
    private final String TEXT_CONTENTS = "TextContents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG , "onCreate: in");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine_screen);

        //confirmButton = (Button) findViewById(R.id.confirmButton);
        backButton = (Button) findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMainActivity();
            }
        });

        Log.d(TAG , "onCreate: out");
    }

    public void openMainActivity() {

        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");
        super.onStart();
        Log.d(TAG, "onStart: out");
    }

//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        Log.d(TAG, "onRestoreInstanceState: in");
//        super.onRestoreInstanceState(savedInstanceState);
////        String savedString = savedInstanceState.getString(TEXT_CONTENTS);
////        textView.setText(savedString);
//        textView.setText(savedInstanceState.getString(TEXT_CONTENTS));
//        Log.d(TAG, "onRestoreInstanceState: out");
//    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: in");
        super.onRestart();
        Log.d(TAG, "onRestart: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: in");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }

//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        Log.d(TAG, "onPause: in");
//        outState.putString(TEXT_CONTENTS, textView.getText().toString());
//        super.onSaveInstanceState(outState);
//        Log.d(TAG, "onPause: out");
//    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onPause: in");
        super.onResume();
        Log.d(TAG, "onPause: out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onPause: in");
        super.onStop();
        Log.d(TAG, "onPause: out");
    }
}