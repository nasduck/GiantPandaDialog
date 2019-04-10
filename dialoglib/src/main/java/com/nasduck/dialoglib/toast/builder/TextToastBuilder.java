package com.nasduck.dialoglib.toast.builder;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.toast.base.BaseToastBuilder;
import com.nasduck.dialoglib.toast.config.ToastConfig;
import com.nasduck.dialoglib.base.enums.ToastType;

public class TextToastBuilder extends BaseToastBuilder {

    private FragmentActivity mActivity;

    private String text;
    private Integer textColor;
    private Integer textSize;
    private Integer bgColor ;
    private Integer cornerRadius;
    private Integer paddingHorizontal;
    private Integer paddingVertical;

    public TextToastBuilder(FragmentActivity activity) {
        mHandler.set(this);

        this.mActivity = activity;

        this.text = "";
        this.textColor = R.color.text_white;
        this.textSize = 14;
        this.bgColor = R.color.black_alpha_50;
        this.cornerRadius = 4;
        this.paddingHorizontal = 20;
        this.paddingVertical = 8;
    }

    @Override
    public ToastType getType() {
        return ToastType.TEXT_TOAST;
    }

    @Override
    public FragmentActivity getActivity() {
        return mActivity;
    }

    @Override
    public ToastConfig build() {
        return new ToastConfig(TextToastBuilder.this);
    }

    /**********************************************************************************************/

    public TextToastBuilder setBackgroundColor(int backgroundColor) {
        this.bgColor = backgroundColor;
        return this;
    }

    public TextToastBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public TextToastBuilder setTextSize(int textSize) {
        this.textSize = textSize;
        return this;
    }

    public TextToastBuilder setTextColor(int textColor) {
        this.textColor = textColor;
        return this;
    }


    public TextToastBuilder setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public TextToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public TextToastBuilder setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    /**********************************************************************************************/

    public String getText() {
        return text;
    }

    public Integer getTextColor() {
        return textColor;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public Integer getBgColor() {
        return bgColor;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public Integer getPaddingHorizontal() {
        return paddingHorizontal;
    }

    public Integer getPaddingVertical() {
        return paddingVertical;
    }
}
