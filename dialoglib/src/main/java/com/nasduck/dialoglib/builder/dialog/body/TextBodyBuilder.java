package com.nasduck.dialoglib.builder.dialog.body;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogBody;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.body.TextBody;
import com.nasduck.dialoglib.enums.GravityWay;

public class TextBodyBuilder implements IDialogBody {

    private String contentText;
    private Integer contentTextColor;
    private Integer contentTextSize;

    private GravityWay gravityWay;
    private Integer paddingTop;
    private Integer paddingBottom;
    private Integer paddingLeft;
    private Integer paddingRight;

    public TextBodyBuilder() {
        contentText = "hello worlddsfasgsdglkasdhfhfhsdfhasdhfjadshffjsdhjshgjshgjhsdjkfhshfsnfjsadfkjsdhf";
        contentTextSize = 16;
        contentTextColor = R.color.text_black;
        gravityWay = GravityWay.CENTER;
        paddingTop=  0;
        paddingBottom = 0;
        paddingLeft = 0;
        paddingRight = 0;
    }

    @Override
    public View getView(Context context) {
        return TextBody.create(context, new DialogConfig(TextBodyBuilder.this));
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

    public TextBodyBuilder setPaddingTop(Integer paddingTop) {
        this.paddingTop = paddingTop;
        return this;
    }

    public TextBodyBuilder setPaddingBottom(Integer paddingBottom) {
        this.paddingBottom = paddingBottom;
        return this;
    }

    public TextBodyBuilder setPaddingLeft(Integer paddingLeft) {
        this.paddingLeft = paddingLeft;
        return this;
    }

    public TextBodyBuilder setPaddingRight(Integer paddingRight) {
        this.paddingRight = paddingRight;
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
