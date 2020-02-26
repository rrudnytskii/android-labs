package com.android.rrudnytskii.lab2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText numVar1;
    EditText numVar2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    Button btnReset;

    TextView textResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numVar1 = findViewById(R.id.num1);
        numVar2 = findViewById(R.id.num2);

        btnAdd = findViewById(R.id.sum);
        btnSub = findViewById(R.id.substraction);
        btnDiv = findViewById(R.id.division);
        btnMult = findViewById(R.id.multiple);
        btnReset = findViewById(R.id.reset);
        textResult = findViewById(R.id.result);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        String operation ="";
        boolean isCustomText = false;
        String customMessage = "";
        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(numVar1.getText().toString())
                || TextUtils.isEmpty(numVar2.getText().toString())) {
            return;
        }

        // читаем EditText и заполняем переменные числами
        num1 = Float.parseFloat(numVar1.getText().toString());
        num2 = Float.parseFloat(numVar2.getText().toString());

        switch (v.getId()) {
            case R.id.sum:
                operation = "+";
                result = num1 + num2;
                break;
            case R.id.substraction:
                operation = "-";
                result = num1 - num2;
                break;
            case R.id.multiple:
                operation = "*";
                result = num1 * num2;
                break;
            case R.id.division:
                operation = "/";
                if(num2 != 0) {
                    result = num1 / num2;
                }else{
                    isCustomText = true;
                    customMessage = "Error! You can`t divide by zero.";
                }
                break;
            case R.id.reset:
                numVar1.setText("");
                numVar2.setText("");
                isCustomText = true;
                customMessage = "Result";
            default:
                break;
        }

        // формируем строку вывода
        textResult.setText(isCustomText ? customMessage : num1 + " " + operation + " " + num2 + " = " + result);
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Exit from app")
                .setMessage("Do you want to exit from appplication?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.super.onBackPressed();
                    }
                }).setNegativeButton(android.R.string.no, null)
                .create().show();
    }

}
