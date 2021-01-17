package com.technocopy.android1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonClear, buttonBrackets, buttonProcent,
            buttonDivide, buttonMulty, buttonMinus, buttonPlus, buttonEqual,
            button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    private TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        // обрабатываем нажате кнопок, выносим в отдельный метод
        tapeButton ();
    }

    private void tapeButton() {
        findView ();
        setOnClick ();
    }

    private void setOnClick() {
        button0.setOnClickListener(this);
    }

    private void findView() {
        button0.findViewById(R.id.button0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.button0)
        }
    }
}