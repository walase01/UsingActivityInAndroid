package com.example.myapplicationusingdiferentactivityinandoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web1= findViewById(R.id.website);

        Bundle bund = getIntent().getExtras();
        String dato = bund.getString("dire");
        web1.loadUrl("https://WWW."+dato);
    }

    public void Finaly(View v){
        finish();
    }


}