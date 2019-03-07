package com.nasduck.dialoglib.builder.dialog;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.body.TextBody;
import com.nasduck.dialoglib.dialog.header.TextHeader;
import com.nasduck.dialoglib.enums.GravityWay;

public class TextBodyBuilder {

    private String contentText;
    private Integer contentTextColor;
    private Integer contentTextSize;

    private GravityWay gravityWay;
    private Integer paddingHorizontal;
    private Integer paddingVertical;

    public TextBodyBuilder() {
        contentText = "hello worlddsfasgsdglkasdhfhfhsdfhasdhfjadshffjsdhjshgjshgjhsdjkfhshfsnfjsadfkjsdhf";
        contentTextSize = 16;
        contentTextColor = R.color.text_black;
        gravityWay = GravityWay.CENTER;
        paddingHorizontal = 8;
        paddingVertical = 8;
    }

    public static TextBodyBuilder create() {
        return new TextBodyBuilder();
    }

    public View getView(Context context) {
        return TextBody.create(context, new DialogConfig(TextBodyBuilder.this));
    }

    public DialogConfig build() {
        return new DialogConfig(TextBodyBuilder.this);
    }

    /**********************************************************************************************/

    public TextBodyBuilder setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public TextBodyBuilder setContentTextColor(Integer contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public TextBodyBuilder setContentTextSize(Integer contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public TextBodyBuilder setGravityWay(GravityWay gravityWay) {
        this.gravityWay = gravityWay;
        return this;
    }

    public TextBodyBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public TextBodyBuilder setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    /**********************************************************************************************/

    public String getContentText() {
        return contentText;
    }

    public Integer getContentTextColor() {
        return contentTextColor;
    }

    public Integer getContentTextSize() {
        return contentTextSize;
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
