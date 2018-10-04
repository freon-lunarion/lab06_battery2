package com.example.antonio.lab06_battery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnTask_1,btnTask_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btnTask_1 = findViewById(R.id.btn_task1);
        btnTask_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchTask1(view);
            }
        });
        btnTask_2 = findViewById(R.id.btn_task1);
        btnTask_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchTask2(view);
            }
        });
    }

    private void switchTask2(View view) {
        Intent intent = new Intent(this, Task2Activity.class);
        startActivity(intent);
    }

    private void switchTask1(View view) {

        Intent intent = new Intent(this, Task1Activity.class);
        startActivity(intent);
    }
}
