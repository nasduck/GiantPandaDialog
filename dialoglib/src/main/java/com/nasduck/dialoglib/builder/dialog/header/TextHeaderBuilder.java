package com.nasduck.dialoglib.builder.dialog.header;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogHeader;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.header.TextHeader;
import com.nasduck.dialoglib.enums.GravityWay;

public class TextHeaderBuilder implements IDialogHeader {

    private int backgroundColor;
    private float cornerRadius;

    private String title;
    private int titleColor;
    private int titleSize;

    private GravityWay gravityWay;
    private int paddingTop;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;

    public TextHeaderBuilder() {
        backgroundColor = R.color.white;
        cornerRadius = 0f;
        title = "hello world";
        titleSize = 16;
        titleColor = R.color.text_black;
        gravityWay = GravityWay.CENTER;
        paddingTop = 0;
        paddingBottom = 0;
        paddingLeft = 0;
        paddingRight = 0;
    }

    @Override
    public View getView(Context context) {
        return TextHeader.create(context, new DialogConfig(TextHeaderBuilder.this));
    }

    @Override
    public void getCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    /**********************************************************************************************/

    public TextHeaderBuilder setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public TextHeaderBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public TextHeaderBuilder setTitleColor(int titleColor) {
        this.titleColor = titleColor;
        return this;
    }

    public TextHeaderBuilder setTitleSize(int titleSize) {
        this.titleSize = titleSize;
        return this;
    }

    public TextHeaderBuilder setGravityWay(GravityWay gravityWay) {
        this.gravityWay = gravityWay;
        return this;
    }

    public TextHeaderBuilder setPaddingTop(int paddingTop) {
        this.paddingTop = paddingTop;
        return this;
    }

    public TextHeaderBuilder setPaddingBottom(int paddingBottom) {
        this.paddingBottom = paddingBottom;
        return this;
    }

    public TextHeaderBuilder setPaddingLeft(int paddingLeft) {
        this.paddingLeft = paddingLeft;
        return this;
    }

    public TextHeaderBuilder setPaddingRight(int paddingRight) {
        this.paddingRight = paddingRight;
        return this;
    }

    /**********************************************************************************************/

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public float getCornerRadius() {
        return cornerRadius;
    }

    public String getTitle() {
        return title;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public int getTitleSize() {
        return titleSize;
    }

    public GravityWay getGravityWay() {
        return gravityWay;
    }

    public int getPaddingTop() {
        return paddingTop;
    }

    public int getPaddingBottom() {
        return paddingBottom;
    }

    public int getPaddingLeft() {
        return paddingLeft;
    }

    public int getPaddingRight() {
        return paddingRight;
    }
}
