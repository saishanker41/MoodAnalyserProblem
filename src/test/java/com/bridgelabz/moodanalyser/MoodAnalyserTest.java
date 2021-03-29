package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is SAD message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is HAPPY message");
        Assertions.assertEquals("HAPPY", mood);
    }
}    

