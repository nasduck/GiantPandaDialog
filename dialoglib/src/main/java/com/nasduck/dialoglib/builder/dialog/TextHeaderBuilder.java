package com.nasduck.dialoglib.builder.dialog;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.header.TextHeader;
import com.nasduck.dialoglib.enums.GravityWay;

public class TextHeaderBuilder {
    
    private String title;
    private int titleColor;
    private int titleSize;

    private GravityWay gravityWay;
    private Integer paddingHorizontal;
    private Integer paddingVertical;

    public TextHeaderBuilder() {
        title = "hello world";
        titleSize = 16;
        titleColor = R.color.text_black;
        gravityWay = GravityWay.CENTER;
        paddingHorizontal = 8;
        paddingVertical = 8;
    }

    public static TextHeaderBuilder create() {
        return new TextHeaderBuilder();
    }

    public View getView(Context context) {
        return TextHeader.create(context, new DialogConfig(TextHeaderBuilder.this));
    }

    /**********************************************************************************************/

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

    public TextHeaderBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public TextHeaderBuilder setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    /**********************************************************************************************/
    
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

    public Integer getPaddingHorizontal() {
        return paddingHorizontal;
    }

    public Integer getPaddingVertical() {
        return paddingVertical;
    }
}
