package com.example.calculator12102022;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    EditText edtNumber1, edtNumber2;
    TextView tvResult;
    Button btnPlus, btnMinus, btnMultiplication, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = findViewById(R.id.edit_text_number1);
        edtNumber2 = findViewById(R.id.edit_text_number2);
        tvResult = findViewById(R.id.text_view_result);
        btnPlus = findViewById(R.id.button_plus);
        btnMinus = findViewById(R.id.button_minus);
        btnMultiplication = findViewById(R.id.button_multiplication);
        btnDivision = findViewById(R.id.button_division);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 = edtNumber1.getText().toString();
                String textNumber2 = edtNumber2.getText().toString();

                if (textNumber1.isEmpty() || textNumber2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int result = number1 + number2;
                tvResult.setText("Result: " + number1 + " + " + number2 + " = " + result);
            }
        });
    }

}
