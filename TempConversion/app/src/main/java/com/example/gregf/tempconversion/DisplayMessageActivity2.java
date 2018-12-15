package com.example.gregf.tempconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DisplayMessageActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
        String message = extras.getString(EXTRA_MESSAGE);
        String[] data = message.split(" ");
        double temp = Double.parseDouble(data[0]);

        if(data[1].equalsIgnoreCase("k")) {

            temp = temp - 273;
            data[1]="C";

        }
        else if(data[1].equalsIgnoreCase("f"))
        {
            temp = (temp - 32) *0.55555;
            data[1] = "C";

        }


        String temp2 = Double.toString(temp);

        String display_message= temp2 +" " + data[1];


        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(display_message);
    }
}
