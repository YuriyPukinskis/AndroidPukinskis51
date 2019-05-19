package ru.netology.androidpukinskis51;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static double number = 0;
    boolean point=false;
    static double digit=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnZero = findViewById(R.id.btnZero);
        Button btnOne = findViewById(R.id.btnOne);
        Button btnTwo = findViewById(R.id.btnTwo);
        Button btnThree = findViewById(R.id.btnThree);
        Button btnFour = findViewById(R.id.btnFour);
        Button btnFive = findViewById(R.id.btnFive);
        Button btnSix = findViewById(R.id.btnSix);
        Button btnSeven = findViewById(R.id.btnSeven);
        Button btnEight = findViewById(R.id.btnEight);
        Button btnNine = findViewById(R.id.btnNine);
        Button btnComa = findViewById(R.id.btnPoint);
        final TextView textView = findViewById(R.id.textView);
        final TextView textView2 = findViewById(R.id.textView2);


        btnComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                point = true;
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,1);
                textView.setText(Double.toString(number));
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,9);
                textView.setText(Double.toString(number));
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,0);
                textView.setText(Double.toString(number));
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,2);
                textView.setText(Double.toString(number));
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,3);
                textView.setText(Double.toString(number));
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,4);
                textView.setText(Double.toString(number));
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,5);
                textView.setText(Double.toString(number));
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,6);
                textView.setText(Double.toString(number));
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,7);
                textView.setText(Double.toString(number));
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(point){
                    digit=digit*10;
                }
                number = NumberCreate.numbering(point,number,digit,8);
                textView.setText(Double.toString(number));
            }
        });
    }
}
