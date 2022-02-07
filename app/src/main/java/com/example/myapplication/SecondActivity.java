package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_view);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView titol = findViewById(R.id.tit);
        TextView subtitol = findViewById(R.id.sub);
        TextView article = findViewById(R.id.art);

        switch (message) {
            case "science":

                titol.setText(R.string.title_science);
                subtitol.setText(R.string.subtitle_science);
                article.setText(R.string.article_science);

                break;

            case "salut":
                ((TextView)findViewById(R.id.titol)).setText(R.string.title_salut);
                ((TextView)findViewById(R.id.sub)).setText(R.string.subtitle_salut);
                ((TextView)findViewById(R.id.sub)).setText(R.string.subtitle_salut);
                ((TextView)findViewById(R.id.art)).setText(R.string.article_salut);

                break;

            case "sport":
                ((TextView)findViewById(R.id.titol)).setText(R.string.title_sports);
                ((TextView)findViewById(R.id.sub)).setText(R.string.subtitle_sports);
                ((TextView)findViewById(R.id.art)).setText(R.string.article_sports);

                break;

            default:

                break;
        }

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.sub);
        textView.setText(message);
    }

}
