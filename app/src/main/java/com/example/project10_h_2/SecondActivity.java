package com.example.project10_h_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("Second 액티비티");

        Intent inIntent = getIntent(); //앞에서 넘긴 intent
        String operator = inIntent.getStringExtra("Operator");

        final int num1 = inIntent.getIntExtra("Num1", 0);
        final int num2 = inIntent.getIntExtra("Num2", 0);

        int Value = 0;
        if (operator.equals("+")) {
            Value = num1 + num2;

        } else if (operator.equals("-")) {
            Value = num1 - num2;

        } else if (operator.equals("*")) {
            Value = num1 * num2;

        } else if (operator.equals("/")) {
            Value = num1 / num2;
        }

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        final int finalHapValue = Value;
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
                outIntent.putExtra("CalResult", finalHapValue);//결과값을 넣어 줌
                setResult(RESULT_OK, outIntent);//결과값을 돌려줌
                finish();
            }
        });

    }
}
