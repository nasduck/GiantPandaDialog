package com.nasduck.dialoglib.dialog.config;

import com.nasduck.dialoglib.dialog.builder.footer.OneButtonFooterBuilder;
import com.nasduck.dialoglib.dialog.builder.body.TextBodyBuilder;
import com.nasduck.dialoglib.dialog.builder.header.TextHeaderBuilder;
import com.nasduck.dialoglib.dialog.builder.footer.ThreeButtonFooterBuilder;
import com.nasduck.dialoglib.dialog.builder.footer.TwoButtonFooterBuilder;
import com.nasduck.dialoglib.base.enums.GravityWay;
import com.nasduck.dialoglib.base.enums.TextStyle;
import com.nasduck.dialoglib.dialog.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnPositiveClickListener;

public class DialogConfig {
    
    /****  Dialog Item Common Config **************************************************************/

    private GravityWay gravityWay;
    private int paddingTop;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;

    private int clickBackgroundColor;
    private int backgroundColor;
    private int cornerRadius;

    /****  Dialog Header Config *******************************************************************/

    // title
    private TextStyle textStyle;
    private String titleText;
    private int titleTextColor;
    private int titleTextSize;

    /****  Dialog Body Config *********************************************************************/

    // content
    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    /****  Dialog Footer Config *******************************************************************/

    // listener
    private OnNormalClickListener normalClickListener;
    private OnPositiveClickListener positiveClickListener;
    private OnNegativeClickListener negativeClickListener;
    // positive button
    private String positiveButtonText;
    private int positiveButtonTextColor;
    private int positiveButtonTextSize;
    // negative button
    private String negativeButtonText;
    private int negativeButtonTextColor;
    private int negativeButtonTextSize;
    // normal button
    private String normalButtonText;
    private int normalButtonTextColor;
    private int normalButtonTextSize;

    /**********************************************************************************************/

    public DialogConfig(TextHeaderBuilder builder) {
        this.backgroundColor = builder.getBackgroundColor();
        this.cornerRadius = builder.getCornerRadius();
        this.textStyle = builder.getTextStyle();
        this.titleText = builder.getTitle();
        this.titleTextSize = builder.getTitleSize();
        this.titleTextColor = builder.getTitleColor();
        this.gravityWay = builder.getGravityWay();
        this.paddingTop = builder.getPaddingTop();
        this.paddingBottom = builder.getPaddingBottom();
        this.paddingLeft = builder.getPaddingLeft();
        this.paddingRight = builder.getPaddingRight();
    }

    public DialogConfig(TextBodyBuilder builder) {
        this.contentText = builder.getContentText();
        this.contentTextSize = builder.getContentTextSize();
        this.contentTextColor = builder.getContentTextColor();
        this.gravityWay = builder.getGravityWay();
        this.paddingTop = builder.getPaddingTop();
        this.paddingBottom = builder.getPaddingBottom();
        this.paddingLeft = builder.getPaddingLeft();
        this.paddingRight = builder.getPaddingRight();
    }

    public DialogConfig(OneButtonFooterBuilder builder) {
        this.cornerRadius = builder.getCornerRadius();
        this.backgroundColor = builder.getBackgroundColor();
        this.clickBackgroundColor = builder.getClickBackgroundColor();
        this.normalButtonText = builder.getNormalButtonText();
        this.normalButtonTextSize = builder.getNormalButtonTextSize();
        this.normalButtonTextColor = builder.getNormalButtonTextColor();
        this.normalClickListener = builder.getNormalClickListener();
    }

    public DialogConfig(TwoButtonFooterBuilder builder) {
        this.cornerRadius = builder.getCornerRadius();
        this.backgroundColor = builder.getBackgroundColor();
        this.clickBackgroundColor = builder.getClickBackgroundColor();
        this.positiveButtonText = builder.getPositiveButtonText();
        this.positiveButtonTextSize = builder.getPositiveButtonTextSize();
        this.positiveButtonTextColor = builder.getPositiveButtonTextColor();
        this.positiveClickListener = builder.getPositiveClickListener();
        this.negativeButtonText = builder.getNegativeButtonText();
        this.negativeButtonTextSize = builder.getNegativeButtonTextSize();
        this.negativeButtonTextColor = builder.getNegativeButtonTextColor();
        this.negativeClickListener = builder.getNegativeClickListener();
    }

    public DialogConfig(ThreeButtonFooterBuilder builder) {
        this.cornerRadius = builder.getCornerRadius();
        this.backgroundColor = builder.getBackgroundColor();
        this.clickBackgroundColor = builder.getClickBackgroundColor();
        this.positiveButtonText = builder.getPositiveButtonText();
        this.positiveButtonTextSize = builder.getPositiveButtonTextSize();
        this.positiveButtonTextColor = builder.getPositiveButtonTextColor();
        this.positiveClickListener = builder.getPositiveClickListener();
        this.normalButtonText = builder.getNormalButtonText();
        this.normalButtonTextSize = builder.getNormalButtonTextSize();
        this.normalButtonTextColor = builder.getNormalButtonTextColor();
        this.normalClickListener = builder.getNormalClickListener();
        this.negativeButtonText = builder.getNegativeButtonText();
        this.negativeButtonTextSize = builder.getNegativeButtonTextSize();
        this.negativeButtonTextColor = builder.getNegativeButtonTextColor();
        this.negativeClickListener = builder.getNegativeClickListener();
    }

    /**********************************************************************************************/

    public OnNormalClickListener getNormalClickListener() {
        return normalClickListener;
    }

    public OnPositiveClickListener getPositiveClickListener() {
        return positiveClickListener;
    }

    public OnNegativeClickListener getNegativeClickListener() {
        return negativeClickListener;
    }

    public int getClickBackgroundColor() {
        return clickBackgroundColor;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public String getTitleText() {
        return titleText;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public int getTitleTextSize() {
        return titleTextSize;
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

    public String getContentText() {
        return contentText;
    }

    public int getContentTextColor() {
        return contentTextColor;
    }

    public int getContentTextSize() {
        return contentTextSize;
    }

    public String getPositiveButtonText() {
        return positiveButtonText;
    }

    public int getPositiveButtonTextColor() {
        return positiveButtonTextColor;
    }

    public int getPositiveButtonTextSize() {
        return positiveButtonTextSize;
    }

    public String getNegativeButtonText() {
        return negativeButtonText;
    }

    public int getNegativeButtonTextColor() {
        return negativeButtonTextColor;
    }

    public int getNegativeButtonTextSize() {
        return negativeButtonTextSize;
    }

    public String getNormalButtonText() {
        return normalButtonText;
    }

    public int getNormalButtonTextColor() {
        return normalButtonTextColor;
    }

    public int getNormalButtonTextSize() {
        return normalButtonTextSize;
    }


}
