package com.example.gregf.tempconversion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Bundle extras = getIntent().getExtras();
        String message = extras.getString(EXTRA_MESSAGE);
        String[] data = message.split(" ");
        double temp = Double.parseDouble(data[0]);


        if(data[1].equalsIgnoreCase("c")) {


            temp = (temp * 1.8) +32;
            data[1]="F";

        }
        else if(data[1].equalsIgnoreCase("k"))
        {
            temp = temp + 273;
            temp = (temp * 1.8) +32;
            data[1] = "F";

        }


        String temp2 = Double.toString(temp);

        String display_message= temp2 +" " + data[1];


        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(display_message);

    }
}
