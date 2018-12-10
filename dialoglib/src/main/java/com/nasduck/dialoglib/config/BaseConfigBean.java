package com.nasduck.dialoglib.config;

public class BaseConfigBean {

    // background
    protected int background;
    protected boolean isCancelable;
    protected boolean hasShade;

    /**  set way *********************************************************************************/



    /**  get way *********************************************************************************/

    public int getBackground() {
        return background;
    }

    public boolean isCancelable() {
        return isCancelable;
    }

    public boolean isHasShade() {
        return hasShade;
    }
}
