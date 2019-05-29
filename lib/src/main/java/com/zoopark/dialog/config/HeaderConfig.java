package com.zoopark.dialog.config;

import android.graphics.Typeface;
import android.view.Gravity;

import com.zoopark.dialog.R;

public class HeaderConfig {

    private String title;
    private int titleColor;
    private int titleTextSize;
    private int typeface;
    private int gravity;
    private int bgColor;
    private int paddingTop;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;

    public static HeaderConfig newInstance() {
        return new HeaderConfig();
    }

    private HeaderConfig() {
        this.typeface = Typeface.BOLD;
        this.title = "";
        this.titleColor = R.color.text_black_light;
        this.titleTextSize = 16;
        this.bgColor = android.R.color.white;
        this.gravity = Gravity.CENTER;
        this.paddingTop = 18;
        this.paddingBottom = 0;
        this.paddingLeft = 0;
        this.paddingRight = 0;
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

    public int getPaddingTop() {
        return paddingTop;
    }

    public void setPaddingTop(int paddingTop) {
        this.paddingTop = paddingTop;
    }

    public int getPaddingBottom() {
        return paddingBottom;
    }

    public void setPaddingBottom(int paddingBottom) {
        this.paddingBottom = paddingBottom;
    }

    public int getPaddingLeft() {
        return paddingLeft;
    }

    public void setPaddingLeft(int paddingLeft) {
        this.paddingLeft = paddingLeft;
    }

    public int getPaddingRight() {
        return paddingRight;
    }

    public void setPaddingRight(int paddingRight) {
        this.paddingRight = paddingRight;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }
}
