package com.technocopy.android1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class CalculatorActivity extends AppCompatActivity {
//    private Button buttonClear, buttonBrackets, buttonProcent, buttonOposit, buttonDot,
//            buttonDivide, buttonMult, buttonMinus, buttonPlus, buttonEqual,
//            button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    TextView txt;
    private  CalculatorLogic calculatorLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

     // представим id кнопок чисел в виде массива целых чисел

        int[] numId = new int[]{
        R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6,
                R.id.button7, R.id.button8, R.id.button9
        };
        // представим id кнопок действий в виде массива целых чисел

        int[] actId = new int[]{
                R.id.buttonBrackets, R.id.buttonProcent, R.id.buttonOposit, R.id.buttonDot, R.id.buttonDivide,
                R.id.buttonMult, R.id.buttonPlus, R.id.buttonMinus, R.id.buttonEqual
        };
        txt = findViewById(R.id.tvOut);
        calculatorLogic = new CalculatorLogic();

        // обработка нажатий
        View.OnClickListener numButtonClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorLogic.onNumPress(v.getId()); // передаем id нажатой кнопки
                txt.setText(calculatorLogic.getText());
            }
        };

        View.OnClickListener actionClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorLogic.onActionPress(v.getId()); // передаем id действия
                txt.setText(calculatorLogic.getText());
            }
        };

        // передаем в класс логики id нажатой кнопки, опрелелив ее в массиве

        for ( int i = 0; i < numId.length; i++ ){
            findViewById(numId[i]).setOnClickListener(numButtonClick);
        }
        for ( int i = 0; i < actId.length; i++ ) {
            findViewById(actId[i]).setOnClickListener(actionClick);
        }
    }




//    private void findView() {
//        Button button0 = findViewById(R.id.button0);
//        Button button1 = findViewById(R.id.button1);
//        Button button2 = findViewById(R.id.button2);
//        Button button3 = findViewById(R.id.button3);
//        Button button4 = findViewById(R.id.button4);
//        Button button5 = findViewById(R.id.button5);
//        Button button6 = findViewById(R.id.button6);
//        Button button7 = findViewById(R.id.button7);
//        Button button8 = findViewById(R.id.button8);
//        Button button9 = findViewById(R.id.button9);
//        Button buttonOposit = findViewById(R.id.buttonOposit);
//        Button buttonDot = findViewById(R.id.buttonDot);
//        Button buttonClear = findViewById(R.id.buttonClear);
//        Button buttonBrackets = findViewById(R.id.buttonBrackets);
//        Button buttonProcent = findViewById(R.id.buttonProcent);
//        Button buttonDivide = findViewById(R.id.buttonDivide);
//        Button buttonMult = findViewById(R.id.buttonMult);
//        Button buttonPlus = findViewById(R.id.buttonPlus);
//        Button buttonMinus = findViewById(R.id.buttonMinus);
//        Button buttonEqual = findViewById(R.id.buttonEqual);
//    }
//
//    private void setOnClick() {
//
//
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Button num = (Button) v;
//                txt.setText(txt.getText().toString() + num.getText().toString());
//            }
//        });
//        button2.setOnClickListener(this);
//        button3.setOnClickListener(this);
//        button4.setOnClickListener(this);
//        button5.setOnClickListener(this);
//        button6.setOnClickListener(this);
//        button7.setOnClickListener(this);
//        button8.setOnClickListener(this);
//        button9.setOnClickListener(this);
//        buttonOposit.setOnClickListener(this);
//        buttonDot.setOnClickListener(this);
//        buttonClear.setOnClickListener(this);
//        buttonBrackets.setOnClickListener(this);
//        buttonProcent.setOnClickListener(this);
//        buttonDivide.setOnClickListener(this);
//        buttonMult.setOnClickListener(this);
//        buttonMinus.setOnClickListener(this);
//        buttonPlus.setOnClickListener(this);
//        buttonEqual.setOnClickListener(this);

}