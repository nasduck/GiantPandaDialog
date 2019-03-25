package com.nasduck.dialoglib.builder.dialog.body;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogBody;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.composition.body.TextBody;
import com.nasduck.dialoglib.enums.GravityWay;

public class TextBodyBuilder implements IDialogBody {

    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    private GravityWay gravityWay;
    private int paddingTop;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;

    public TextBodyBuilder() {
        contentText = "dialog content";
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
        if (contentText != null) {
            this.contentText = contentText;
        }
        return this;
    }

    public TextBodyBuilder setContentTextColor(Integer contentTextColor) {
        if (contentTextColor != null) {
            this.contentTextColor = contentTextColor;
        }
        return this;
    }

    public TextBodyBuilder setContentTextSize(Integer contentTextSize) {
        if (contentTextSize != null) {
            this.contentTextSize = contentTextSize;
        }
        return this;
    }

    public TextBodyBuilder setGravityWay(GravityWay gravityWay) {
        if (gravityWay != null) {
            this.gravityWay = gravityWay;
        }
        return this;
    }

    public TextBodyBuilder setPaddingTop(Integer paddingTop) {
        if (paddingTop != null) {
            this.paddingTop = paddingTop;
        }
        return this;
    }

    public TextBodyBuilder setPaddingBottom(Integer paddingBottom) {
        if (paddingBottom != null) {
            this.paddingBottom = paddingBottom;
        }
        return this;
    }

    public TextBodyBuilder setPaddingLeft(Integer paddingLeft) {
        if (paddingLeft != null) {
            this.paddingLeft = paddingLeft;
        }
        return this;
    }

    public TextBodyBuilder setPaddingRight(Integer paddingRight) {
        if (paddingRight != null) {
            this.paddingRight = paddingRight;
        }
        return this;
    }

    /**********************************************************************************************/

    public String getContentText() {
        return contentText;
    }

    public int getContentTextColor() {
        return contentTextColor;
    }

    public int getContentTextSize() {
        return contentTextSize;
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
