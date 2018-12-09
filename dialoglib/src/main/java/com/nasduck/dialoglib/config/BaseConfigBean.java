package com.nasduck.dialoglib.config;

public class BaseConfigBean {

    // 背景
    protected int background;
    protected boolean isCancelable;
    protected boolean hasShade;

    /**  set方法  ********************************************************************************/



    /**  get方法  ********************************************************************************/

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
