package com.example.unit_test_lab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.Log;
import android.widget.TextView;
import java.lang.Math;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Unit";

    public int Min(int[] A){
        int min = Integer.MAX_VALUE;

        for(int a : A){
            if(min > a){
                min = a;
            }
        }
        return min;
    }

    public int Max(int[] A){
        int max = Integer.MIN_VALUE;

        for(int a : A){
            if(max < a){
               max = a;
            }
        }
        return max;
    }

    public int getRandomNumber(int min, int max){
        return (int)(Math.random()*((max-min)+1)) + min;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String min,max;
        int[] A = new int[10];
        Log.i(TAG, "Massive A:");
        for(int i = 0; i<A.length; i++){
            A[i] = getRandomNumber(1, 20);
            Log.i(TAG, String.valueOf(A[i]));
        }

        min = "Min: "+Min(A);
        max = "Max: "+Max(A);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        textView.setText(R.string.app_string1);
        textView.setTextSize(30);
        textView1.setText(min);
        textView1.setTextSize(30);
        textView2.setText(max);
        textView2.setTextSize(30);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

        ConstraintLayout.LayoutParams layoutParams1 = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams1.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams1.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams1.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;

        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams2.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams2.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams2.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams2.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);

        textView1.setLayoutParams(layoutParams2);
        constraintLayout.addView(textView1);

        textView2.setLayoutParams(layoutParams1);
        constraintLayout.addView(textView2);

        setContentView(constraintLayout);
    }
}