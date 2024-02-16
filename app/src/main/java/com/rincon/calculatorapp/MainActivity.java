package com.rincon.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_sum,btn_rest,btn_multi,btn,div;
        EditText et_numa,et_numb;
        TextView txt_ans;
        btn_sum = findViewById(R.id.btn_sum);
        btn_rest = findViewById(R.id.btn_rest);
        btn_multi = findViewById(R.id.btn_multi);
        btn_multi= findViewById(R.id.btn_multi);

        et_numa= findViewById(R.id.et_numa);
        et_numb= findViewById(R.id.et_numb);
        txt_ans= findViewById(R.id.txt_ans);


    }

    public void cliclkSumar(View view){

        Toast.makeText(this, "FUNCIONA", Toast.LENGTH_SHORT).show();




    }
}