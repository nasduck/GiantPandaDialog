package com.nasduck.dialoglib.builder;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.config.ToastConfig;
import com.nasduck.dialoglib.toast.TextToast;

public class ToastBuilder {

    private ToastConfig mConfig;

    private ToastBuilder(ToastConfig config) {
        this.mConfig = config;
    }

    public static ToastBuilder create() { return create(ToastConfig.getInstance()); }

    public static ToastBuilder create(ToastConfig config) {
        return new ToastBuilder(config);
    }

    public void show(final FragmentActivity activity) {
        show(activity, getDelay());
    }

    public void show(final FragmentActivity activity, int delayMillis) {
        TextToast.create(mConfig).show(activity.getSupportFragmentManager(), "toast");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DuckDialog.hide(activity, "toast");
            }
        }, delayMillis);
    }

    //* Getter & Setter **************************************************************************//

    public String getText() {
        return mConfig.getText();
    }

    public ToastBuilder setText(String text) {
        mConfig.setText(text);
        return this;
    }

    public int getTextSize() {
        return mConfig.getTextSize();
    }

    public ToastBuilder setTextSize(int textSize) {
        mConfig.setTextSize(textSize);
        return this;
    }

    public int getTextColor() {
        return mConfig.getTextColor();
    }

    public ToastBuilder setTextColor(int color) {
        mConfig.setTextColor(color);
        return this;
    }

    public int getBackgroundColor() {
        return mConfig.getBackgroundColor();
    }

    public ToastBuilder setBackgroundColor(int color) {
        mConfig.setBackgroundColor(color);
        return this;
    }

    public int getCornerRadius() {
        return mConfig.getCornerRadius();
    }

    public ToastBuilder setCornerRadius(int cornerRadius) {
        mConfig.setCornerRadius(cornerRadius);
        return this;
    }

    public ToastConfig getConfig() {
        return mConfig;
    }

    public ToastBuilder setConfig(ToastConfig config) {
        this.mConfig = config;
        return this;
    }

    public int getPaddingHorizontal() {
        return mConfig.getPaddingHorizontal();
    }

    public ToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        mConfig.setPaddingHorizontal(paddingHorizontal);
        return this;
    }

    public int getPaddingVertical() {
        return mConfig.getPaddingVertical();
    }

    public ToastBuilder setPaddingVertical(Integer paddingVertical) {
        mConfig.setPaddingVertical(paddingVertical);
        return this;
    }

    public int getDelay() {
        return mConfig.getDelay();
    }

    public ToastBuilder setDelay(Integer delay) {
        mConfig.setDelay(delay);
        return this;
    }
}
