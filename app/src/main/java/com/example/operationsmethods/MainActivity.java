package com.example.operationsmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        textView = findViewById( R.id.textView );
        int num1 = 20;
        int num2 = 10;
        int num3 = 5;
        textView.setText(String.valueOf(divide(num1,num2,num3)));

    }

    public int subtract(int x, int y, int z)
    {

       return x- y - z;
    }

    public int add(int x, int y, int z)
    {

        return x+ y + z;
    }
    public int mult(int x, int y, int z)
    {

        return x * y * z;
    }
    public int divide(int x, int y, int z)
    {

        return x / y ;
    }


}