package com.example.laptophome.homeworkand1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 public int Nrandom;
    EditText e;
    TextView text;
    String Nstring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.editText);
        text=(TextView)findViewById(R.id.textView);

    }

    public void press(View view)
    {
        Random r = new Random(10);
        Nrandom = r.nextInt();
    }
    public void click(View view)
    {
        Nstring=e.getText().toString();
        int n1 =Integer.valueOf(Nstring);
        text.setText("");

            if (n1 < Nrandom)
                {
                    text.setText("the number is bigger than you entered");
                }

                if (n1 > Nrandom)
                {
                        text.setText("the number is smaller than you entered");
                    }


        if(Nrandom==n1) {
            text.setText("correct answer");

        }

    }
}
