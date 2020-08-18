package com.Tutorial3Submission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=findViewById(R.id.enterNo1);
        edit2=findViewById(R.id.enterNo2);
        button1=findViewById(R.id.btn_ok);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String n1=edit1.getText().toString();
                String n2=edit2.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("EXTRA1",n1);
                intent.putExtra("EXTRA2",n2);

                startActivity(intent);

                Toast toast = Toast.makeText(getApplicationContext(), "You clicked on ok", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                toast.show();
                }

            }
        );
        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
    }

}