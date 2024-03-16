package com.rincon.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal,Pow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button clear,del,mod,div,multi,sub,add,equal,power,zero,dot;
        Button seven,eight,nine,six,five,four,three,two,one;

        //textView Reference
        TextView problem = findViewById(R.id.problem),sol;

        //functions
        clear = findViewById(R.id.clear);
        del = findViewById(R.id.del);

        //Operators
        mod = findViewById(R.id.mod);
        div = findViewById(R.id.divide);
        multi = findViewById(R.id.multiplication);
        sub = findViewById(R.id.minus);
        add = findViewById(R.id.plus);
        equal = findViewById(R.id.equal);
        power = findViewById(R.id.power);
        dot = findViewById(R.id.dot);

        //numbers
        nine = findViewById(R.id.nine);
        eight = findViewById(R.id.eight);
        seven = findViewById(R.id.seven);
        six = findViewById(R.id.six);
        five = findViewById(R.id.five);
        four = findViewById(R.id.four);
        three = findViewById(R.id.three);
        two = findViewById(R.id.two);
        one = findViewById(R.id.one);
        zero = findViewById(R.id.zero);

        sol = findViewById(R.id.sol);

        //working of buttons
        zero.setOnClickListener(view -> problem.setText(problem.getText() + "0"));
        one.setOnClickListener(view -> problem.setText(problem.getText() + "1"));
        two.setOnClickListener(view -> problem.setText(problem.getText() + "2"));
        three.setOnClickListener(view -> problem.setText(problem.getText() + "3"));
        four.setOnClickListener(view -> problem.setText(problem.getText() + "4"));
        five.setOnClickListener(view -> problem.setText(problem.getText() + "5"));
        six.setOnClickListener(view -> problem.setText(problem.getText() + "6"));
        seven.setOnClickListener(view -> problem.setText(problem.getText() + "7"));
        eight.setOnClickListener(view -> problem.setText(problem.getText() + "8"));
        nine.setOnClickListener(view -> problem.setText(problem.getText() + "9"));

        //basic function
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                problem.setText("");
                sol.setText("");
                input1 = 0;
                input2 =0;
            }
        });

        //erase
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = (String) problem.getText();
                int n = s.length()-1;
                s= s.substring(0,n);
                problem.setText(s);
            }
        });

        //operation

        //addition
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sol.getText().length()!=0){
                    problem.setText(sol.getText()+"");
                }
                if(problem.getText().length()!=0){

                    //input1 = Float.parseFloat(problem.getText() + "");
                    Addition = true;
                    decimal = false;
                    problem.setText(problem.getText() + "+");

                }
            }
        });

        //subtraction
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sol.getText().length()!=0){
                    problem.setText(sol.getText()+"");
                }

                if(problem.getText().length()!=0){
                    //input1 = Float.parseFloat(problem.getText() + "");
                    Subtract = true;
                    decimal = false;
                    problem.setText(problem.getText() + "-");
                }
            }
        });

        //Multiplication
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sol.getText().length()!=0){
                    problem.setText(sol.getText()+"");
                }

                if(problem.getText().length()!=0){
                    //input1 = Float.parseFloat(problem.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    problem.setText(problem.getText() + "x");
                }
            }
        });

        //Division
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(sol.getText().length()!=0){
                    problem.setText(sol.getText()+"");
                }

                if(problem.getText().length()!=0){
                    //input1 = Float.parseFloat(problem.getText() + "");
                    Division = true;
                    decimal = false;
                    problem.setText(problem.getText() + "/");
                }
            }
        });

        //remainder
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //this will work on output
                if(sol.getText().length()!=0){
                    problem.setText(sol.getText()+"");
                }

                //this will work for first input
                if(problem.getText().length()!=0){
                    //input1 = Float.parseFloat(problem.getText() + "");
                    mRemainder= true;
                    decimal = false;
                    problem.setText(problem.getText() + "%");
                }
            }
        });


        //decimal
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(decimal){

                }
                else {
                    problem.setText(problem.getText() + ".");
                    decimal = true;
                }

            }
        });

        //power
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //this will work on output
                if(sol.getText().length()!=0){
                    problem.setText(sol.getText()+"");
                }

                //this will work for first input
                if(problem.getText().length()!=0){
                    //input1 = Float.parseFloat(problem.getText() + "");
                    Pow = true;
                    decimal = false;
                    problem.setText(problem.getText() + "^");
                }
            }
        });

        // equal to
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    //input2 = Float.parseFloat(problem.getText() + "");
                }

                if (Addition) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('+');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1,s.length()));
                    sol.setText(input1 + input2 + "");

                    Addition = false;
                }

                if (Subtract) {

                    String s = (String) problem.getText();
                    int index = s.indexOf('-');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1,s.length()));
                    sol.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('x');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1,s.length()));
                    sol.setText(input1 * input2 + "");

                    Multiplication = false;
                }

                if (Division) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('/');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1,s.length()));
                    sol.setText(input1 / input2 + "");

                    Division = false;
                }
                if (mRemainder) {
                    String s = (String) problem.getText();
                    int index = s.indexOf('%');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1,s.length()));
                    sol.setText(input1 % input2 + "");

                    mRemainder = false;
                }

                if(Pow){
                    String s = (String) problem.getText();
                    int index = s.indexOf('^');
                    input1 = Float.parseFloat(s.substring(0,index));
                    input2 = Float.parseFloat(s.substring(index+1,s.length()));
                    double ans = Math.pow(input1,input2);
                    sol.setText(ans+"");
                    Pow = false;
                }
            }
        });

    }
}