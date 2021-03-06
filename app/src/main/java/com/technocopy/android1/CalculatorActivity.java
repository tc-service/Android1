package com.technocopy.android1;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    TextView txt;
    private CalculatorLogic calculatorLogic = new CalculatorLogic();
//    private final String key_out_text = "txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // представим id кнопок чисел в виде массива целых чисел

        int[] numId = new int[]{
                R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6,
                R.id.button7, R.id.button8, R.id.button9, R.id.buttonOposit, R.id.buttonDot
        };
        // представим id кнопок действий в виде массива целых чисел

        int[] actId = new int[]{
                R.id.buttonBrackets, R.id.buttonOposit, R.id.buttonProcent, R.id.buttonDivide,
                R.id.buttonMult, R.id.buttonPlus, R.id.buttonMinus, R.id.buttonEqual, R.id.buttonClear
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

        for (int i = 0; i < numId.length; i++) {
            findViewById(numId[i]).setOnClickListener(numButtonClick);
        }
        for (int i = 0; i < actId.length; i++) {
            findViewById(actId[i]).setOnClickListener(actionClick);
        }
    }

//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putString(key_out_text, String.valueOf(txt));
//        outState.putParcelable(key_out_text, (Parcelable) txt);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        txt = savedInstanceState.getParcelable(key_out_text);
//    }
}