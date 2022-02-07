package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_navigate_btn(View view) {
        String url = ((EditText) findViewById(R.id.url)).getText().toString();
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void onClick_science_btn(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = "science";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void onClick_salut_btn(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = "salut";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void onClick_sport_btn(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = "sport";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}