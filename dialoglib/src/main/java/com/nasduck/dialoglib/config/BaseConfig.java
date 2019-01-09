package com.nasduck.dialoglib.config;

public class BaseConfig {

    protected int background;
    protected boolean isCancelable;
    protected boolean hasShade;

    public int getBackground() {
        return background;
    }

    public BaseConfig setBackground(int background) {
        this.background = background;
        return this;
    }

    public boolean isCancelable() {
        return isCancelable;
    }

    public BaseConfig setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public boolean isHasShade() {
        return hasShade;
    }

    public BaseConfig setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }
}
