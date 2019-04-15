package com.nasduck.dialoglib.dialog.classification;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.builder.DialogBuilder;
import com.nasduck.dialoglib.dialog.builder.body.DialogBodyBuilder;
import com.nasduck.dialoglib.dialog.classification.base.TitleBaseDialog;
import com.nasduck.dialoglib.base.enums.GravityWay;

public class TextDialog extends TitleBaseDialog<TextDialog> {
    
    private String content;
    private Integer contentSize;
    private Integer contentColor;
    private GravityWay gravityWay;
    private Integer paddingLeft;
    private Integer paddingTop;
    private Integer paddingRight;
    private Integer paddingBottom;

    public static TextDialog getInstance(FragmentActivity activity) {
        return new TextDialog(activity);
    }

    public TextDialog(FragmentActivity activity) {
        super(activity);
    }

    @Override
    public void setBodyBuilderConfig(DialogBuilder builder) {
        /**
        DialogBodyBuilder bodyBuilder = new DialogBodyBuilder();
        bodyBuilder.setContentText(content)
                .setContentTextSize(contentSize)
                .setContentTextColor(contentColor)
                .setGravityWay(gravityWay)
                .setPaddingLeft(paddingLeft)
                .setPaddingRight(paddingRight)
                .setPaddingTop(paddingTop)
                .setPaddingBottom(paddingBottom);

        builder.setBody(bodyBuilder);
         **/
    }

    public TextDialog setContent(String content) {
        this.content = content;
        return this;
    }
    
    public TextDialog setContentSize(Integer contentSize) {
        this.contentSize = contentSize;
        return this;
    }
    
    public TextDialog setContentColor(Integer contentColor) {
        this.contentColor = contentColor;
        return this;
    }

    public TextDialog setContentGravity(GravityWay gravityWay) {
        this.gravityWay = gravityWay;
        return this;
    }

    public TextDialog setContentPadding(Integer left, Integer top, Integer right, Integer bottom) {
        this.paddingLeft = left;
        this.paddingTop = top;
        this.paddingRight = right;
        this.paddingBottom = bottom;
        return this;
    }


}
