package com.alexlowe.androidgame.framework.implementation;

import android.graphics.Bitmap;

import com.alexlowe.androidgame.framework.Graphics;
import com.alexlowe.androidgame.framework.Graphics.ImageFormat;
import com.alexlowe.androidgame.framework.Image;


public class AndroidImage implements Image {
    Bitmap bitmap;
    Graphics.ImageFormat format;

    public AndroidImage(Bitmap bitmap, ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}
