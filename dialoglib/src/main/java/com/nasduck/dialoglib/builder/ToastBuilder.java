package com.nasduck.dialoglib.builder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;

import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.config.ToastImageConfig;
import com.nasduck.dialoglib.config.ToastTextAndImageConfig;
import com.nasduck.dialoglib.config.ToastTextConfig;
import com.nasduck.dialoglib.interfaces.ToastType;
import com.nasduck.dialoglib.toast.ImageToast;
import com.nasduck.dialoglib.toast.TextImageToast;
import com.nasduck.dialoglib.toast.TextToast;

public class ToastBuilder {

    private final static String TEXT_TOAST = "textToast";
    private final static String IMAGE_TOAST = "imageToast";
    private final static String TEXT_AND_IMAGE_TOAST = "textAndImageToast";
    private static ToastType mType;
    private ToastTextConfig mToastTextConfig;
    private ToastImageConfig mToastImageConfig;
    private ToastTextAndImageConfig mToastTextAndImageConfig;
    private FragmentActivity mActivity;

    private static ToastHandler mHandler = new ToastHandler();

    private ToastBuilder(FragmentActivity activity, ToastTextConfig config) {
        this.mToastTextConfig = config;
        this.mActivity = activity;
        this.mHandler.set(this);
    }

    private ToastBuilder(FragmentActivity activity, ToastImageConfig config) {
        this.mToastImageConfig = config;
        this.mActivity = activity;
        this.mHandler.set(this);
    }

    private ToastBuilder(FragmentActivity activity, ToastTextAndImageConfig config) {
        this.mToastTextAndImageConfig = config;
        this.mActivity = activity;
        this.mHandler.set(this);
    }

    public static ToastBuilder create(FragmentActivity activity) {
        mType = ToastType.TEXT_TOAST;
        return create(activity, ToastTextConfig.getInstance());
    }

    public static ToastBuilder create(FragmentActivity activity, ToastType toastType) {
        mType = toastType;
        switch (mType) {
            case TEXT_TOAST:
                return create(activity, ToastTextConfig.getInstance());
            case IMAGE_TOAST:
                return create(activity, ToastImageConfig.getInstance());
            case TEXT_AND_IMAGE_TOAST:
                return create(activity, ToastTextAndImageConfig.getInstance());
            default:
                return create(activity);
        }
    }

    public static ToastBuilder create(FragmentActivity activity, ToastTextConfig config) {
        return new ToastBuilder(activity, config);
    }

    public static ToastBuilder create(FragmentActivity activity, ToastImageConfig config) {
        return new ToastBuilder(activity, config);
    }

    public static ToastBuilder create(FragmentActivity activity, ToastTextAndImageConfig config) {
        return new ToastBuilder(activity, config);
    }

    public void show() {
        show(getDelay());
    }

    public void show(int delayMillis) {
        mHandler.removeMessages(ToastHandler.MSG_SHOW);
        FragmentManager manager = this.mActivity.getSupportFragmentManager();
        Fragment fragment;
        switch (mType) {
            case TEXT_TOAST:
                fragment = manager.findFragmentByTag(TEXT_TOAST);
                if (fragment != null) {
                    // Update Toast existing
                    ((TextToast)fragment).updateUI(this.mToastTextConfig);
                } else {
                    if (manager.findFragmentByTag(IMAGE_TOAST) != null) {
                        DuckDialog.hide(mActivity, IMAGE_TOAST);
                    }
                    if (manager.findFragmentByTag(TEXT_AND_IMAGE_TOAST) != null) {
                        DuckDialog.hide(mActivity, TEXT_AND_IMAGE_TOAST);
                    }
                    // Show Toast
                    TextToast.create(this.mToastTextConfig).show(this.mActivity.getSupportFragmentManager(), TEXT_TOAST);
                }
                break;
            case IMAGE_TOAST:
                fragment = manager.findFragmentByTag(IMAGE_TOAST);
                if (fragment != null) {
                    // Update Toast existing
                    ((ImageToast)fragment).updateUI(this.mToastImageConfig);
                } else {
                    if (manager.findFragmentByTag(TEXT_TOAST) != null) {
                        DuckDialog.hide(mActivity, TEXT_TOAST);
                    }
                    if (manager.findFragmentByTag(TEXT_AND_IMAGE_TOAST) != null) {
                        DuckDialog.hide(mActivity, TEXT_AND_IMAGE_TOAST);
                    }
                    // Show Toast
                    ImageToast.create(this.mToastImageConfig).show(this.mActivity.getSupportFragmentManager(), IMAGE_TOAST);
                }
                break;
            case TEXT_AND_IMAGE_TOAST:
                fragment = manager.findFragmentByTag(TEXT_AND_IMAGE_TOAST);
                if (fragment != null) {
                    // Update Toast existing
                    ((TextImageToast)fragment).updateUI(this.mToastTextAndImageConfig);
                } else {
                    if (manager.findFragmentByTag(TEXT_TOAST) != null) {
                        DuckDialog.hide(mActivity, TEXT_TOAST);
                    }
                    if (manager.findFragmentByTag(IMAGE_TOAST) != null) {
                        DuckDialog.hide(mActivity, IMAGE_TOAST);
                    }
                    // Show Toast
                    TextImageToast.create(this.mToastTextAndImageConfig).show(this.mActivity.getSupportFragmentManager(), TEXT_AND_IMAGE_TOAST);
                }
        }
        // Send msg to dismiss dialog with delay
        mHandler.sendEmptyMessageDelayed(ToastHandler.MSG_SHOW, delayMillis);
    }

    public void hide() {
        switch (mType) {
            case TEXT_TOAST:
                DuckDialog.hide(mActivity, TEXT_TOAST);
            case IMAGE_TOAST:
                DuckDialog.hide(mActivity, IMAGE_TOAST);
            case TEXT_AND_IMAGE_TOAST:
                DuckDialog.hide(mActivity, TEXT_AND_IMAGE_TOAST);
            default:
                DuckDialog.hide(mActivity, TEXT_TOAST);
        }
    }

    //* Getter & Setter **************************************************************************//

    public String getText() {
        switch (mType) {
            case TEXT_TOAST:
                return mToastTextConfig.getText();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getText();
            default:
                return mToastTextConfig.getText();
        }
    }

    public ToastBuilder setText(String text) {
        switch (mType) {
            case TEXT_TOAST:
                mToastTextConfig.setText(text);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setText(text);
                return this;
            default:
                mToastTextConfig.setText(text);
                return this;
        }
    }

    public int getTextSize() {
        switch (mType) {
            case TEXT_TOAST:
                return mToastTextConfig.getTextSize();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getTextSize();
            default:
                return mToastTextConfig.getTextSize();
        }
    }

    public ToastBuilder setTextSize(int textSize) {
        switch (mType) {
            case TEXT_TOAST:
                mToastTextConfig.setTextSize(textSize);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setTextSize(textSize);
            default:
                mToastTextConfig.setTextSize(textSize);
                return this;
        }
    }

    public int getTextColor() {
        switch (mType) {
            case TEXT_TOAST:
                return mToastTextConfig.getTextColor();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getTextColor();
            default:
                return mToastTextConfig.getTextColor();
        }
    }

    public ToastBuilder setTextColor(int color) {
        switch (mType) {
            case TEXT_TOAST:
                mToastTextConfig.setTextColor(color);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setTextColor(color);
            default:
                mToastTextConfig.setTextColor(color);
                return this;
        }
    }

    public int getImageId() {
        switch (mType) {
            case IMAGE_TOAST:
                return mToastImageConfig.getImage();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getImage();
            default:
                return 0;
        }
    }

    public ToastBuilder setImageId(int imageId) {
        switch (mType) {
            case IMAGE_TOAST:
                mToastImageConfig.setImage(imageId);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setImage(imageId);
                return this;
            default:
                return this;
        }
    }

    public int getBackgroundColor() {
        switch (mType) {
            case TEXT_TOAST:
                return mToastTextConfig.getBackgroundColor();
            case IMAGE_TOAST:
                return mToastImageConfig.getBackgroundColor();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getBackgroundColor();
            default:
                return mToastTextConfig.getBackgroundColor();
        }
    }

    public ToastBuilder setBackgroundColor(int color) {
        switch (mType) {
            case TEXT_TOAST:
                mToastTextConfig.setBackgroundColor(color);
                return this;
            case IMAGE_TOAST:
                mToastImageConfig.setBackgroundColor(color);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setBackgroundColor(color);
                return this;
            default:
                mToastTextConfig.setBackgroundColor(color);
                return this;
        }
    }

    public int getCornerRadius() {
        switch (mType) {
            case TEXT_TOAST:
                return mToastTextConfig.getCornerRadius();
            case IMAGE_TOAST:
                return mToastImageConfig.getCornerRadius();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getCornerRadius();
            default:
                return mToastTextConfig.getCornerRadius();
        }
    }

    public ToastBuilder setCornerRadius(int cornerRadius) {
        switch (mType) {
            case TEXT_TOAST:
                mToastTextConfig.setCornerRadius(cornerRadius);
                return this;
            case IMAGE_TOAST:
                mToastImageConfig.setCornerRadius(cornerRadius);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setCornerRadius(cornerRadius);
            default:
                mToastTextConfig.setCornerRadius(cornerRadius);
                return this;
        }
    }

    public int getPaddingHorizontal() {
        switch (mType) {
            case TEXT_TOAST:
                return mToastTextConfig.getPaddingHorizontal();
            case IMAGE_TOAST:
                return mToastImageConfig.getPaddingHorizontal();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getPaddingHorizontal();
            default:
                return mToastTextConfig.getPaddingHorizontal();
        }
    }

    public ToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        switch (mType) {
            case TEXT_TOAST:
                mToastTextConfig.setPaddingHorizontal(paddingHorizontal);
                return this;
            case IMAGE_TOAST:
                mToastImageConfig.setPaddingHorizontal(paddingHorizontal);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setPaddingHorizontal(paddingHorizontal);
            default:
                mToastTextConfig.setPaddingHorizontal(paddingHorizontal);
                return this;
        }
    }

    public int getPaddingVertical() {
        switch (mType) {
            case TEXT_TOAST:
                return mToastTextConfig.getPaddingVertical();
            case IMAGE_TOAST:
                return mToastImageConfig.getPaddingVertical();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getPaddingVertical();
            default:
                return mToastTextConfig.getPaddingVertical();
        }
    }

    public ToastBuilder setPaddingVertical(Integer paddingVertical) {
        switch (mType) {
            case TEXT_TOAST:
                mToastTextConfig.setPaddingVertical(paddingVertical);
                return this;
            case IMAGE_TOAST:
                mToastImageConfig.setPaddingVertical(paddingVertical);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setPaddingVertical(paddingVertical);
            default:
                mToastTextConfig.setPaddingVertical(paddingVertical);
                return this;
        }
    }

    public int getDelay() {
        switch (mType) {
            case TEXT_TOAST:
                return mToastTextConfig.getDelay();
            case IMAGE_TOAST:
                return mToastImageConfig.getDelay();
            case TEXT_AND_IMAGE_TOAST:
                return mToastTextAndImageConfig.getDelay();
            default:
                return mToastTextConfig.getDelay();
        }
    }

    public ToastBuilder setDelay(Integer delay) {
        switch (mType) {
            case TEXT_TOAST:
                mToastTextConfig.setDelay(delay);
                return this;
            case IMAGE_TOAST:
                mToastImageConfig.setDelay(delay);
                return this;
            case TEXT_AND_IMAGE_TOAST:
                mToastTextAndImageConfig.setDelay(delay);
                return this;
            default:
                mToastTextConfig.setDelay(delay);
                return this;
        }
    }

    public ToastTextConfig getTextToastConfig() {
        return mToastTextConfig;
    }

    public ToastBuilder setTextToastConfig(ToastTextConfig config) {
        this.mToastTextConfig = config;
        return this;
    }

    public ToastImageConfig getImageToastConfig() {
        return mToastImageConfig;
    }

    public ToastBuilder setImageToastConfig(ToastImageConfig config) {
        this.mToastImageConfig = config;
        return this;
    }

    public ToastTextAndImageConfig getTextAndImageToastConfig() {
        return mToastTextAndImageConfig;
    }

    public ToastBuilder setTextAndImageToastConfig(ToastTextAndImageConfig config) {
        this.mToastTextAndImageConfig = config;
        return this;
    }
}
