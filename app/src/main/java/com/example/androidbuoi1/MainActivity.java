package com.example.androidbuoi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnadd,btnsub,btnmul, btndiv,btnclear,btnreview;
    EditText num1,num2,result;
    String v1,v2,r,Cal;
    TextView t1,t2;
    public void saveData(double num1,double num2,String cal,double result) {
        v1 = Double.toString(num1);
        v2 = Double.toString(num2);
        Cal = cal;
        r = Double.toString(result);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.label1);
        t2 = findViewById(R.id.label2);

        t1.setText("Enter 2 num");
        t2.setText("Result");

        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnclear = findViewById(R.id.btnclear);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        btnreview= findViewById(R.id.btnreview);



        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double oper1 = Double.parseDouble(num1.getText().toString());
                    double oper2 = Double.parseDouble(num2.getText().toString());
                    double answ = oper1 + oper2;
                    saveData(oper1,oper2,btnadd.getText().toString(),answ);
                    result.setText(Double.toString(answ));
                }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double oper1 = Double.parseDouble(num1.getText().toString());
                    double oper2 = Double.parseDouble(num2.getText().toString());
                    double answ = oper1 - oper2;
                    saveData(oper1,oper2,btnsub.getText().toString(),answ);
                    result.setText(Double.toString(answ));
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double oper1 = Double.parseDouble(num1.getText().toString());
                    double oper2 = Double.parseDouble(num2.getText().toString());
                    double answ = oper1 * oper2;
                    saveData(oper1,oper2,btnmul.getText().toString(),answ);
                    result.setText(Double.toString(answ));
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double oper1 = Double.parseDouble(num1.getText().toString());
                    double oper2 = Double.parseDouble(num2.getText().toString());
                    double answ = oper1 / oper2;
                    saveData(oper1,oper2,btndiv.getText().toString(),answ);
                    result.setText(Double.toString(answ));
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText("0.00");
                num1.requestFocus();
            }
        });

        btnreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),reviewActivity.class);
                intent1.putExtra("v1",v1);
                intent1.putExtra("v2",v2);
                intent1.putExtra("cal",Cal);
                intent1.putExtra("r",r);
                startActivity(intent1);

            }
        });

    }
}
