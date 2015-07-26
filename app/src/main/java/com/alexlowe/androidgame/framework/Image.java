package com.alexlowe.androidgame.framework;

/**
 * Created by Alex on 7/23/2015.
 */

public interface Image {
    public int getWidth();

    public int getHeight();

    public Graphics.ImageFormat getFormat();

    public void dispose();
}

