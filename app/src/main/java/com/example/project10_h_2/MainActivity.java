package com.example.project10_h_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        final RadioGroup rGroup = (RadioGroup) findViewById(R.id.rGroup);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtNum1 = (EditText) findViewById(R.id.edtNum1);
                EditText edtNum2 = (EditText) findViewById(R.id.edtNum2);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                switch (rGroup.getCheckedRadioButtonId()) {
                    case R.id.rBtnSum:
                        intent.putExtra("Operator", "+");
                        break;
                    case R.id.rBtnMinus:
                        intent.putExtra("Operator", "-");
                        break;
                    case R.id.rBtnMul:
                        intent.putExtra("Operator", "*");
                        break;
                    case R.id.rBtnDiv:
                        intent.putExtra("Operator", "/");
                        break;
                }

                intent.putExtra("Num1", Integer.parseInt(edtNum1.getText().toString()));//값을 intent에 넣어줌
                intent.putExtra("Num2", Integer.parseInt(edtNum2.getText().toString()));//값을 intent에 넣어줌

                startActivityForResult(intent, 0); //답이 올때까지 기다림

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            int calResult = data.getIntExtra("CalResult", 0);

            RadioGroup rGroup = (RadioGroup) findViewById(R.id.rGroup);

            String str = "";
            switch (rGroup.getCheckedRadioButtonId()) {
                case R.id.rBtnSum:
                    str = "결과";
                    break;
                case R.id.rBtnMinus:
                    str = "결과";
                    break;
                case R.id.rBtnMul:
                    str = "결과";
                    break;
                case R.id.rBtnDiv:
                    str = "결과";
                    break;
            }

            Toast.makeText(getApplicationContext(), str + " : " + calResult, Toast.LENGTH_SHORT).show();

        }
    }
}
