package com.example.akshey.helloakshey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // grab the text the user inputed
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Akshey!");

                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }

                // put the text into the text view once the 'change text' button is clicked
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // reset the text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                // reset the background color to coloAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
                // reset the text back to 'Hello from Akshey!'
                ((TextView) findViewById(R.id.textView)).setText("Hello from Akshey!");
            }
        });


    }
}
