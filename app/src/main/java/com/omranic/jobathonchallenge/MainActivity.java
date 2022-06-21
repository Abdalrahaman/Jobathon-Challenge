package com.omranic.jobathonchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Task t = new Task();
        // Result Task 1
        Log.d(TAG, "Result is : " + t.solution1("aaa"));
        // Result Task 2
        int index = t.solution2(new int[]{100, 200, 100}, new int[]{50, 100, 100}, 100, 100);
        if (index == -1){
            Log.d(TAG, "No icon clicked");
        }else{
            Log.d(TAG, "Icon " + index + " is clicked");
        }
    }
}