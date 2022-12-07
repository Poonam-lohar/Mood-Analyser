package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test

    public void givenMessage_WhenProper_ShouldReturnSad() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String sadMood = moodAnalyser.analyseMood("I am in sad mood");
        System.out.println(sadMood);
        Assertions.assertEquals("SAD", sadMood);

    }
}
