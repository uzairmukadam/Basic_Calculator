package com.uzitech.basiccalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView res;
    Spinner arith_func;

    ArithmeticClass aClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.number_1);
        num2 = findViewById(R.id.number_2);
        res = findViewById(R.id.result);
        arith_func = findViewById(R.id.arithmetic_action);

        aClass = new ArithmeticClass();
    }

    public void calculate(View view) {
        if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter the numbers", Toast.LENGTH_SHORT).show();
        } else {
            float num1 = Float.parseFloat(this.num1.getText().toString());
            float num2 = Float.parseFloat(this.num2.getText().toString());
            switch (arith_func.getSelectedItem().toString()) {
                case "Addition":
                        res.setText(String.valueOf(aClass.Addition(num1, num2)));
                        break;
                case "Subtraction":
                    res.setText(String.valueOf(aClass.Subtraction(num1, num2)));
                    break;
                case "Multiplication":
                    res.setText(String.valueOf(aClass.Multiplication(num1, num2)));
                    break;
                case "Division":
                    res.setText(String.valueOf(aClass.Division(num1, num2)));
                    break;
            }
        }
    }
}