package com.nasduck.dialoglib.builder.dialog.header;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogHeader;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.header.TextHeader;
import com.nasduck.dialoglib.enums.GravityWay;

public class TextHeaderBuilder implements IDialogHeader {
    
    private String title;
    private int titleColor;
    private int titleSize;

    private GravityWay gravityWay;
    private Integer paddingTop;
    private Integer paddingBottom;
    private Integer paddingLeft;
    private Integer paddingRight;

    public TextHeaderBuilder() {
        title = "hello world";
        titleSize = 16;
        titleColor = R.color.text_black;
        gravityWay = GravityWay.CENTER;
        paddingTop=  0;
        paddingBottom = 0;
        paddingLeft = 0;
        paddingRight = 0;
    }

    @Override
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

    public TextHeaderBuilder setPaddingTop(Integer paddingTop) {
        this.paddingTop = paddingTop;
        return this;
    }

    public TextHeaderBuilder setPaddingBottom(Integer paddingBottom) {
        this.paddingBottom = paddingBottom;
        return this;
    }

    public TextHeaderBuilder setPaddingLeft(Integer paddingLeft) {
        this.paddingLeft = paddingLeft;
        return this;
    }

    public TextHeaderBuilder setPaddingRight(Integer paddingRight) {
        this.paddingRight = paddingRight;
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

    public Integer getPaddingTop() {
        return paddingTop;
    }

    public Integer getPaddingBottom() {
        return paddingBottom;
    }

    public Integer getPaddingLeft() {
        return paddingLeft;
    }

    public Integer getPaddingRight() {
        return paddingRight;
    }
}
