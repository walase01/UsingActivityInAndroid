package com.example.myapplicationusingdiferentactivityinandoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity_Other extends AppCompatActivity {

    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__other);
        text = findViewById(R.id.editTextTextPersonName);
    }

    public void EntrarOtroActivit(View view){
        Intent intent = (new Intent(this,MainActivity.class));
        intent.putExtra("dire", text.getText().toString());
        startActivity(intent);
    }
}