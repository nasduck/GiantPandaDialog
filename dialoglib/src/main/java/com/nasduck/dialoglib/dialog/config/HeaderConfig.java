package com.nasduck.dialoglib.dialog.config;

import android.graphics.Typeface;
import android.view.Gravity;

import com.nasduck.dialoglib.R;

public class HeaderConfig {

    private String title;
    private int titleColor;
    private int titleTextSize;
    private int typeface;
    private int gravity;

    public static HeaderConfig newInstance() {
        return new HeaderConfig();
    }

    private HeaderConfig() {
        this.typeface = Typeface.BOLD;
        this.title = "";
        this.titleColor = R.color.text_black_light;
        this.titleTextSize = 16;
        this.gravity = Gravity.CENTER;
    }

    //* Getter & Setter **************************************************************************//

    public int getTypeface() {
        return typeface;
    }

    public void setTypeface(int typeface) {
        this.typeface = typeface;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public void setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }
}
