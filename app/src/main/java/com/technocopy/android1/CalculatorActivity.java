package com.technocopy.android1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonClear, buttonBrackets, buttonProcent,
            buttonDivide, buttonMult, buttonMinus, buttonPlus, buttonEqual,
            button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    private TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        TextView txt = findViewById(R.id.tvOut);
        // обрабатываем нажате кнопок, выносим в отдельный метод
        initView ();
    }

    private void initView() {
        findView ();
        setOnClick ();
    }
    private void findView() {
                button0.findViewById(R.id.button0);
                button1.findViewById(R.id.button1);
                button2.findViewById(R.id.button2);
                button3.findViewById(R.id.button3);
                button4.findViewById(R.id.button4);
                button5.findViewById(R.id.button5);
                button6.findViewById(R.id.button6);
                button7.findViewById(R.id.button7);
                button8.findViewById(R.id.button8);
                button9.findViewById(R.id.button9);
                buttonClear.findViewById(R.id.buttonClear);
                buttonBrackets.findViewById(R.id.buttonBrackets);
                buttonProcent.findViewById(R.id.buttonProcent);
                buttonDivide.findViewById(R.id.buttonDivide);
                buttonMult.findViewById(R.id.buttonMult);
                buttonPlus.findViewById(R.id.buttonPlus);
                buttonMinus.findViewById(R.id.buttonMinus);
                buttonEqual.findViewById(R.id.buttonEqual);
     }

    private void setOnClick() {
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonBrackets.setOnClickListener(this);
        buttonProcent.setOnClickListener(this);
        buttonProcent.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}