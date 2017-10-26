package com.example.yasvanth1.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view) {


        EditText dollarField = (EditText) findViewById(R.id.dollarField);


        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());
        Double poundAmount = dollarAmount * 0.75;

        Log.i("Pounds Conversion:", poundAmount.toString());


        Toast.makeText(getApplicationContext(), "£" + poundAmount.toString() , Toast.LENGTH_LONG).show();






    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

