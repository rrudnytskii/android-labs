package com.android.rrudnytskii.lab2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButtonSumClick(View v){
        EditText numVar1 = findViewById(R.id.num1);
        EditText numVar2 = findViewById(R.id.num2);
        TextView resText = findViewById(R.id.result);

        int num1 = Integer.parseInt(numVar1.getText().toString());
        int num2 = Integer.parseInt(numVar2.getText().toString());
        int result = num1 + num2;
        resText.setText(result);
    }

    public void OnButtonMultipleClick(View v){
        EditText numVar1 = findViewById(R.id.num1);
        EditText numVar2 = findViewById(R.id.num2);
        TextView resText = findViewById(R.id.result);

        int num1 = Integer.parseInt(numVar1.getText().toString());
        int num2 = Integer.parseInt(numVar2.getText().toString());
        int result = num1 * num2;
        resText.setText(result);
    }

    public void OnButtonDistractionClick(View v){
        EditText numVar1 = findViewById(R.id.num1);
        EditText numVar2 = findViewById(R.id.num2);
        TextView resText = findViewById(R.id.result);

        int num1 = Integer.parseInt(numVar1.getText().toString());
        int num2 = Integer.parseInt(numVar2.getText().toString());
        int result = num1 - num2;
        resText.setText(result);
    }

    public void OnButtonDivisionClick(View v){
        EditText numVar1 = findViewById(R.id.num1);
        EditText numVar2 = findViewById(R.id.num2);
        TextView resText = findViewById(R.id.result);

        double num1 = Integer.parseInt(numVar1.getText().toString());
        double num2 = Integer.parseInt(numVar2.getText().toString());
        double result = num1 / num2;
        resText.setText(Double.toString(result));
    }
}
