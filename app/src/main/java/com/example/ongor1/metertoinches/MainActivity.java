package com.example.ongor1.metertoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
        1  meter to inches = 39.37
    */
    private EditText enterMeter;
    private Button convertButton;
    private TextView resultTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeter =(EditText)findViewById(R.id.meterEditText);
        resultTextview =(TextView)findViewById(R.id.resultTextView);
        convertButton =(Button)findViewById(R.id.convertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double mul = 39.37;
                double result = 0.0;

                // double meterValue =Double.parseDouble(enterMeter.getText().toString());
                // result = meterValue*mul;

                //resultTextview.setText(Double.toString(result)+"inches");
                // resultTextview.setText(String.format("%.2f",result)+"inches");

                if (enterMeter.getText().toString().equals("")) {

                    resultTextview.setText(R.string.error_massage);
                    resultTextview.setTextColor(Color.GREEN);
                }
                else {
                    double meterValue = Double.parseDouble(enterMeter.getText().toString());
                    result = meterValue * mul;

                    resultTextview.setTextColor(Color.DKGRAY);
                    resultTextview.setText(String.format("%2f", result) + "inches");
                }

            }



        });
    }
}
