package com.bridgelabz;

public class MoodAnalyserException extends Throwable {

    public String message;
    public MoodAnalyserException(String message) {
        super(message);
    }
}
