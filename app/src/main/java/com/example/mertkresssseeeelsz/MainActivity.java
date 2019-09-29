package com.example.mertkresssseeeelsz;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity
        implements SeekBar.OnSeekBarChangeListener{


    private SeekBar seekRed;
    private SeekBar seekGreen;
    private SeekBar seekBlue;
    private TextView hatter_RGB;
    private int red=0;
    private int green=0;
    private int blue=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekRed=findViewById(R.id.seekRED);
        seekGreen=findViewById(R.id.seekGREEN);
        seekBlue=findViewById(R.id.seekBLUE);
        hatter_RGB=findViewById(R.id.hatter_RGB);
        seekRed.setOnSeekBarChangeListener(this);
        seekGreen.setOnSeekBarChangeListener(this);
        seekBlue.setOnSeekBarChangeListener(this);
    }
 //


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        red=seekRed.getProgress();
        green=seekGreen.getProgress();
        blue=seekBlue.getProgress();
        hatter_RGB.setBackgroundColor(Color.rgb(red,green,blue));
        hatter_RGB.setText("("+red+","+green+","+blue+")");


    }
    @Override
    public void onStartTrackingTouch (SeekBar seekBar){

    }
    @Override
    public void onStopTrackingTouch (SeekBar seekBar){



    }




}