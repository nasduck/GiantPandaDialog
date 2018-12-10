package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.toast.TextToast;

public class ToastTextConfigBean extends BaseConfigBean {

    // content
    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    /**  set way  ********************************************************************************/

    public ToastTextConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public ToastTextConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public ToastTextConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public ToastTextConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public ToastTextConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public ToastTextConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    /**  Create an instance and display it  ******************************************************/

    public void show(FragmentActivity activity, String tag) {
        TextToast.newTextToast(this).show(activity.getSupportFragmentManager(), tag);
    }

    /**  get way *********************************************************************************/

    public String getContentText() {
        return contentText;
    }

    public int getContentTextColor() {
        return contentTextColor;
    }

    public int getContentTextSize() {
        return contentTextSize;
    }
}
