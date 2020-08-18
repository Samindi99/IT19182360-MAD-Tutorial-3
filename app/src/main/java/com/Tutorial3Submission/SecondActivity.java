package com.Tutorial3Submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class  SecondActivity extends AppCompatActivity {

    TextView num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       num1=findViewById(R.id.editTextNo3);
       num2=findViewById(R.id.editTextNo4);

       String n1=getIntent().getStringExtra("EXTRA1");
       String n2=getIntent().getStringExtra("EXTRA2");

       num1.setText(n1);
       num2.setText(n2);
    }

    public void onButtonAddition(View v){
        TextView v1=(TextView)findViewById(R.id.tv_result);
        int number1=Integer.parseInt(num1.getText().toString());
        int number2=Integer.parseInt(num2.getText().toString());

        int sum=number1+number2;
        v1.setText(getIntent().getStringExtra("EXTRA1") + "+" +getIntent().getStringExtra("EXTRA2")+ "=" + String.valueOf(sum));
    }

    public void onButtonSubtraction(View v){
        TextView v1=(TextView)findViewById(R.id.tv_result);
        int number1=Integer.parseInt(num1.getText().toString());
        int number2=Integer.parseInt(num2.getText().toString());

        int sub=number1-number2;
        v1.setText(getIntent().getStringExtra("EXTRA1") + "-" +getIntent().getStringExtra("EXTRA2")+ "=" + String.valueOf(sub));

    }

    public void onButtonMultiplication(View v){
        TextView v1=(TextView)findViewById(R.id.tv_result);
        int number1=Integer.parseInt(num1.getText().toString());
        int number2=Integer.parseInt(num2.getText().toString());

        int mul=number1*number2;
        v1.setText(getIntent().getStringExtra("EXTRA1") + "x" +getIntent().getStringExtra("EXTRA2")+ "=" + String.valueOf(mul));

    }

    public void onButtonDivision(View v){
        TextView v1=(TextView)findViewById(R.id.tv_result);
        int number1=Integer.parseInt(num1.getText().toString());
        int number2=Integer.parseInt(num2.getText().toString());

        int div=number1/number2;
        v1.setText(getIntent().getStringExtra("EXTRA1") + "/" +getIntent().getStringExtra("EXTRA2")+ "=" + String.valueOf(div));

    }
}