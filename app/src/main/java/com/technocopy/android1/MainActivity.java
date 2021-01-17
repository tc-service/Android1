package com.technocopy.android1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import static com.technocopy.android1.R.drawable.ic_launcher_on_foreground;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    ImageView imageView;

    @SuppressLint({"UseSwitchCompatOrMaterialCode", "UseCompatLoadingForDrawables"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.etData1);
        EditText editText2 = findViewById(R.id.etData2);
        Switch switch1 = findViewById(R.id.switch1);

        toggleButton = findViewById(R.id.toggleButton);
        imageView = findViewById(R.id.ivTogg);
        imageView.setImageDrawable(getDrawable(R.drawable.ic_baseline_radio_button_on));
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton.isChecked()){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_radio_button_off));
                }
                else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_radio_button_on));
                }
            }
        });

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    editText1.setBackgroundColor(R.color.nocolor);
                    editText2.setBackgroundColor(R.color.nocolor);
                }
                else {
                    editText1.setBackgroundColor(R.color.white);
                    editText2.setBackgroundColor(R.color.white);
                }
            }
        });
    }
}