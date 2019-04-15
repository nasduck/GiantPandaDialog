package com.nasduck.dialoglib.dialog.config;

import android.view.Gravity;

import com.nasduck.dialoglib.R;

public class DialogBtnConfig {

    private String text;
    private int textColor;
    private int textSize;
    private int bgColor;
    private int bgColorPressed;
    private int gravity;

    public static DialogBtnConfig newInstance() {
        return new DialogBtnConfig();
    }

    private DialogBtnConfig() {
        this.bgColor = android.R.color.white;
        this.bgColorPressed = R.color.gray_light;
        this.textSize = 16;
        this.textColor = R.color.text_gray;
        this.gravity = Gravity.CENTER;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public int getBgColorPressed() {
        return bgColorPressed;
    }

    public void setBgColorPressed(int bgColorPressed) {
        this.bgColorPressed = bgColorPressed;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }
}
