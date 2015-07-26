package com.alexlowe.androidgame.framework.robotgame;

/**
 * Created by Alex on 7/25/2015.
 */
import com.alexlowe.androidgame.framework.Image;
import com.alexlowe.androidgame.framework.Music;
import com.alexlowe.androidgame.framework.Sound;

public class Assets {

    public static Image menu, splash, background, character, character2, character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
    public static Image tiledirt, tilegrassTop, tilegrassBot, tilegrassLeft, tilegrassRight, characterJump, characterDown;
    public static Image button;
    public static Sound click;
    public static Music theme;

    public static void load(SampleGame sampleGame) {
        // TODO Auto-generated method stub
        theme = sampleGame.getAudio().createMusic("menumusic.wav");
        theme.setLooping(true);
        theme.setVolume(0.85f);
        theme.play();
    }

}
