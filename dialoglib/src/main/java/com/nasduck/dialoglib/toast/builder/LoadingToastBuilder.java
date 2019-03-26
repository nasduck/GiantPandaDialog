package com.nasduck.dialoglib.toast.builder;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.base.enums.ToastType;
import com.nasduck.dialoglib.toast.base.BaseToastBuilder;
import com.nasduck.dialoglib.toast.config.ToastConfig;

public class LoadingToastBuilder extends BaseToastBuilder {

    private FragmentActivity activity;

    private Integer image;
    private Integer animation;
    private String text;
    private Integer textColor;
    private Integer textSize;
    private Integer bgColor ;
    private Integer cornerRadius;
    private Integer paddingHorizontal;
    private Integer paddingVertical;

    public LoadingToastBuilder(FragmentActivity activity) {
        mHandler.set(this);
        this.activity = activity;
        this.image = 0;
        this.animation = 0;
        this.text = "";
        this.textColor = R.color.text_white;
        this.textSize = 14;
        this.bgColor = R.color.black_alpha_50;
        this.cornerRadius = 4;
        this.paddingHorizontal = 15;
        this.paddingVertical = 12;
    }

    @Override
    public FragmentActivity getActivity() {
        return activity;
    }

    @Override
    public ToastConfig build() {
        return new ToastConfig(LoadingToastBuilder.this);
    }

    @Override
    public ToastType getType() {
        return ToastType.LOADING_TOAST;
    }

    /**********************************************************************************************/

    public LoadingToastBuilder setAnimation(Integer animation) {
        this.animation = animation;
        return this;
    }

    public LoadingToastBuilder setImage(Integer image) {
        this.image = image;
        return this;
    }

    public LoadingToastBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public LoadingToastBuilder setTextColor(Integer textColor) {
        this.textColor = textColor;
        return this;
    }

    public LoadingToastBuilder setTextSize(Integer textSize) {
        this.textSize = textSize;
        return this;
    }

    public LoadingToastBuilder setBgColor(Integer bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public LoadingToastBuilder setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public LoadingToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public LoadingToastBuilder setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    /**********************************************************************************************/

    public Integer getImage() {
        return image;
    }

    public Integer getAnimation() {
        return animation;
    }

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
