package com.example.mac13.permissions;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonRed,buttonGreen, buttonBLue,buttonYellow;
    View view;
    Map<String,Integer> colors = new HashMap();


    private static final String COLOR_KEY = "COLOR_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonBLue=(Button)findViewById(R.id.buttonBlue);
        buttonYellow=(Button)findViewById(R.id.buttonYellow);
        buttonRed=(Button)findViewById(R.id.buttonRed);
        buttonGreen=(Button)findViewById(R.id.buttonGreen);
        colors.put("green",ContextCompat.getColor(this,R.color.green));
        colors.put("blue",ContextCompat.getColor(this,R.color.colorPrimary));
        colors.put("red",ContextCompat.getColor(this,R.color.red));
        colors.put("yellow",ContextCompat.getColor(this,R.color.yellow));

        view=findViewById(R.id.view);

        buttonBLue.setOnClickListener(this);
        buttonYellow.setOnClickListener(this);
        buttonRed.setOnClickListener(this);
        buttonGreen.setOnClickListener(this);

        int color = Settings.getInteger(COLOR_KEY);
        if(color!=0) {
            view.setBackgroundColor(Settings.getInteger(COLOR_KEY));

        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonBlue:
                view.setBackgroundColor(colors.get("blue"));
                Settings.saveInteger(COLOR_KEY,colors.get("blue"));
                break;
        }
        switch (v.getId()){
            case R.id.buttonYellow:
                view.setBackgroundColor(colors.get("yellow"));
                Settings.saveInteger(COLOR_KEY,colors.get("yellow"));
                break;
        }
        switch (v.getId()){
            case R.id.buttonRed:
                view.setBackgroundColor(colors.get("red"));
                Settings.saveInteger(COLOR_KEY,colors.get("red"));
                break;
        }
        switch (v.getId()){
            case R.id.buttonGreen:
                view.setBackgroundColor(colors.get("green"));
                Settings.saveInteger(COLOR_KEY,colors.get("green"));
                break;
        }
    }
}
