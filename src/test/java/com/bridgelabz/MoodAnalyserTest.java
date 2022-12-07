package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test

    public void givenMessage_WhenProper_ShouldReturnHappy() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String happyMood = moodAnalyser.analyseMood("I am in happy mood");
        System.out.println(happyMood);
        Assertions.assertEquals("HAPPY", happyMood);

    }
}
