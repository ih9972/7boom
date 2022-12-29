package com.example.a7boom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = 1;
        btn = (Button) findViewById(R.id.btn);
    }

    public void boom(View view) {
        if (sum%7 == 0 && sum != 0) {
            btn.setText("boom");
            sum++;
        }
        else {
            btn.setText("This is a click number:"+sum);
            sum++;
        }
    }
}