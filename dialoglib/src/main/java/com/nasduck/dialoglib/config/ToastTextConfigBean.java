package com.nasduck.dialoglib.config;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.base.DuckDialog;
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

    public void show(final FragmentActivity activity) {
        TextToast.newTextToast(this).show(activity.getSupportFragmentManager(), "default");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DuckDialog.hide(activity, "default");
            }
        }, 1000);
    }

    public void show(final FragmentActivity activity, int delayMillis) {
        TextToast.newTextToast(this).show(activity.getSupportFragmentManager(), "default");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DuckDialog.hide(activity, "default");
            }
        }, delayMillis);
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
