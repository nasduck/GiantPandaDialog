package com.nasduck.toastlib.builder.impl;

import android.support.v4.app.FragmentActivity;

import com.nasduck.toastlib.builder.BaseToastBuilder;
import com.nasduck.toastlib.config.ToastConfig;

public class ToastBuilder extends BaseToastBuilder {

    private FragmentActivity activity;

    private ToastConfig config;

    private ToastBuilder(FragmentActivity activity, ToastConfig config) {
        mHandler.set(this);

        this.activity = activity;
        this.config = config;
    }

    public static ToastBuilder getInstance(FragmentActivity activity) {
        return create(activity, ToastConfig.newInstance());
    }

    public static ToastBuilder create(FragmentActivity activity, ToastConfig config) {
        return new ToastBuilder(activity, config);
    }

    @Override
    public FragmentActivity getActivity() {
        return activity;
    }

    @Override
    public ToastConfig getConfig() {
        return this.config;
    }

    //* Setter & Getter **************************************************************************//

    public ToastBuilder setImage(Integer image) {
        this.config.setImage(image);
        return this;
    }

    public ToastBuilder setText(String text) {
        this.config.setText(text);
        return this;
    }

    public ToastBuilder setTextColor(Integer textColor) {
        this.config.setTextColor(textColor);
        return this;
    }

    public ToastBuilder setTextSize(Integer textSize) {
        this.config.setTextSize(textSize);
        return this;
    }

    public ToastBuilder setBgColor(Integer bgColor) {
        this.config.setBgColor(bgColor);
        return this;
    }

    public ToastBuilder setCornerRadius(Integer cornerRadius) {
        this.config.setCornerRadius(cornerRadius);
        return this;
    }

    public ToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.config.setPaddingHorizontal(paddingHorizontal);
        return this;
    }

    public ToastBuilder setPaddingVertical(Integer paddingVertical) {
        this.config.setPaddingVertical(paddingVertical);
        return this;
    }

    public ToastBuilder setAnimation(Integer animation) {
        this.config.setAnim(animation);
        return this;
    }
}
