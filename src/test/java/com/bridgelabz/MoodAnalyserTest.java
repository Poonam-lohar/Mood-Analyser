package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyse moodAnalyser = new MoodAnalyse();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        System.out.println(mood);
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyse moodAnalyser = new MoodAnalyse();
        String mood = moodAnalyser.analyseMood("This is a happy message");
        System.out.println(mood);
        Assertions.assertEquals("HAPPY", mood);
    }
}
