package com.alexlowe.androidgame.framework.implementation;

/**
 * Created by Alex on 7/23/2015.
 */
import java.util.List;

import android.view.View.OnTouchListener;

import com.alexlowe.androidgame.framework.Input;


public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
