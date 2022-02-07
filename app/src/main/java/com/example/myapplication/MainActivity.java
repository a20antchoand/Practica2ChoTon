package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

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
        startActivity(intent);
    }

    public void onClick_technology_btn(View view) {
        Intent intent = new Intent(this, Technology.class);
        startActivity(intent);
    }

    public void onClick_health_btn(View view) {
        Intent intent = new Intent(this, Health.class);
        startActivity(intent);
    }

}