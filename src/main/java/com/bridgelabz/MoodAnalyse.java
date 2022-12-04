package com.bridgelabz;

public class MoodAnalyse {

    public String analyseMood(String message) {

        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
