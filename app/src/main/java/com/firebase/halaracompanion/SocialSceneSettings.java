package com.firebase.halaracompanion;

public class SocialSceneSettings {
    boolean eyetracking;
    boolean person;
    boolean background;
    boolean distraction;
    boolean music;
    Integer difficulty;
    Integer volume;
    Integer brightness;

    public SocialSceneSettings(boolean eyetracking, boolean person, boolean background,
                               boolean distraction, boolean music, Integer difficulty,
                               Integer volume, Integer brightness) {

        this.eyetracking = eyetracking;
        this.person = person;
        this.background = background;
        this.distraction = distraction;
        this.music = music;
        this.difficulty = difficulty;
        this.volume = volume;
        this.brightness = brightness;
    }

    public boolean isEyetracking() {
        return eyetracking;
    }

    public boolean isPerson() {
        return person;
    }

    public boolean isBackground() {
        return background;
    }

    public boolean isDistraction() {
        return distraction;
    }

    public boolean isMusic() {
        return music;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getBrightness() {
        return brightness;
    }
}
