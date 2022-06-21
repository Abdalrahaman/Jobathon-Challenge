package com.omranic.jobathonchallenge;

import android.util.Log;

public class Task {

    private static final String TAG = "Task";

    public Task(){
    }

    public Boolean solution1(String word) {

        Character ch1 = 'a';
        Character ch2 = 'b';

        boolean aIsFinished = false;

        if (word.length() > 1 && word.length() < 300000) {

            for (Character c : word.toCharArray()) {
                if (ch1 == c) {
                    if (aIsFinished) {
                        return false;
                    }
                } else if (ch2 == c) {
                    aIsFinished = true;
                } else {
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }


    public int solution2(int[] A, int[] B, int x, int y){

        double r = 20.0;

        if (A.length > 1 && A.length < 100 && A.length == B.length){

            for (int i = 0; i < A.length; i++){

                if(A[i] > 0 && A[i] < 1919 && B[i] > 0 && B[i] < 1079 && x > 0 && x < 1919 && y > 0 && y < 1079){

                    int r1 = (x - A[i]) * (x - A[i]);
                    int r2 = (y - B[i]) * (y - B[i]);
                    double d = Math.sqrt(r1 + r2);
                    if (d == r){
                        Log.d(TAG, "solution2: Inside center");
                        return i;
                    }else if (d < r){
                        Log.d(TAG, "solution2: Inside");
                        return i;
                    }else {
                        Log.d(TAG, "solution2: outside");
                    }
                }
            }
        }
        return -1;
    }
}
