package com.nasduck.dialoglib.dialog.config;

import android.view.Gravity;

import com.nasduck.dialoglib.R;

public class BodyConfig {

    private int gravity;
    private int layoutGravity;
    private int paddingTop;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;

    private int bgColor;
    private int cornerRadius;

    // Content
    private String content;
    private int contentTextColor;
    private int contentTextSize;

    public static BodyConfig newInstance() {
        return new BodyConfig();
    }

    private BodyConfig() {

        this.gravity = Gravity.CENTER;
        this.layoutGravity = Gravity.CENTER;
        this.paddingTop = 16;
        this.paddingBottom = 16;
        this.paddingLeft = this.paddingRight = 26;

        this.bgColor = android.R.color.white;
        this.cornerRadius = 10;

        // Content
        this.content = "";
        this.contentTextColor = R.color.text_black_light;
        this.contentTextSize = 14;
    }

    //* Getter & Setter **************************************************************************//


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

    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getContentTextColor() {
        return contentTextColor;
    }

    public void setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
    }

    public int getContentTextSize() {
        return contentTextSize;
    }

    public void setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
    }

    public int getLayoutGravity() {
        return layoutGravity;
    }

    public void setLayoutGravity(int layoutGravity) {
        this.layoutGravity = layoutGravity;
    }
}
