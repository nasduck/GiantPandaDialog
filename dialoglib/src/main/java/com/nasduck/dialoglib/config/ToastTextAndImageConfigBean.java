package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.toast.TextImageToast;

public class ToastTextAndImageConfigBean extends BaseConfig {

    // image
    private int image;

    // content
    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    /**  set way  *******************************************************************************/

    public ToastTextAndImageConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public ToastTextAndImageConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public ToastTextAndImageConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public ToastTextAndImageConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public ToastTextAndImageConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public ToastTextAndImageConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public ToastTextAndImageConfigBean setImage(int image) {
        this.image = image;
        return this;
    }

    /**  Create an instance and display it  ******************************************************/

    public void show(FragmentActivity activity, String tag) {
        TextImageToast.newTextToast(this).show(activity.getSupportFragmentManager(), tag);
    }

    /**  get way  ********************************************************************************/

    public int getImage() {
        return image;
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
}
