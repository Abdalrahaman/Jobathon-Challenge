package com.omranic.jobathonchallenge;

import android.util.Log;

import java.util.regex.Pattern;

public class Task {

    public Task(){
    }

    public Boolean solution(String word) {

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
}
