package com.nasduck.dialoglib.builder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.config.ToastConfig;
import com.nasduck.dialoglib.toast.TextToast;

public class ToastBuilder {

    private final static String TAG = "toast";
    private ToastConfig mConfig;
    private FragmentActivity mActivity;

    private static ToastHandler mHandler = new ToastHandler();

    private ToastBuilder(FragmentActivity activity, ToastConfig config) {
        this.mConfig = config;
        this.mActivity = activity;
        this.mHandler.set(this);
    }

    public static ToastBuilder create(FragmentActivity activity) { return create(activity, ToastConfig.getInstance()); }

    public static ToastBuilder create(FragmentActivity activity, ToastConfig config) {
        return new ToastBuilder(activity, config);
    }

    public void show() {
        show(getDelay());
    }

    public void show(int delayMillis) {
        mHandler.removeMessages(ToastHandler.MSG_SHOW);

        FragmentManager manager = this.mActivity.getSupportFragmentManager();
        Fragment fragment = manager.findFragmentByTag(TAG);
        if (fragment != null) {
            // Update Toast existing
            ((TextToast)fragment).updateUI(this.mConfig);
        } else {
            // Show Toast
            TextToast.create(this.mConfig).show(this.mActivity.getSupportFragmentManager(), TAG);
        }

        // Send msg to dismiss dialog with delay
        mHandler.sendEmptyMessageDelayed(ToastHandler.MSG_SHOW, delayMillis);
    }

    public void hide() {
        DuckDialog.hide(mActivity, TAG);
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
