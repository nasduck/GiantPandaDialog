package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.NoTitleTipDialog;

public class DialogTipNoTitleConfigBean extends BaseConfigBean {

    // content
    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    // button
    private String buttonText;
    private int buttonTextColor;
    private int buttonTextSize;

    // click listener
    private NoTitleTipDialog.onSureClickListener listener;

    /**  set way  ********************************************************************************/

    public DialogTipNoTitleConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public DialogTipNoTitleConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public DialogTipNoTitleConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public DialogTipNoTitleConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public DialogTipNoTitleConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public DialogTipNoTitleConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public DialogTipNoTitleConfigBean setButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    public DialogTipNoTitleConfigBean setButtonTextColor(int buttonTextColor) {
        this.buttonTextColor = buttonTextColor;
        return this;
    }

    public DialogTipNoTitleConfigBean setButtonTextSize(int buttonTextSize) {
        this.buttonTextSize = buttonTextSize;
        return this;
    }

    public DialogTipNoTitleConfigBean setListener(NoTitleTipDialog.onSureClickListener listener) {
        this.listener = listener;
        return this;
    }

    /**  Create an instance and display it  ******************************************************/

    public void show(FragmentActivity activity, String tag) {
        NoTitleTipDialog.newTextToast(this)
                .setOnSureClickListener(getListener())
                .show(activity.getSupportFragmentManager(), tag);
    }

    /**  get way  ********************************************************************************/

    public String getContentText() {
        return contentText;
    }

    public int getContentTextColor() {
        return contentTextColor;
    }

    public int getContentTextSize() {
        return contentTextSize;
    }

    public String getButtonText() {
        return buttonText;
    }

    public int getButtonTextColor() {
        return buttonTextColor;
    }

    public int getButtonTextSize() {
        return buttonTextSize;
    }

    public NoTitleTipDialog.onSureClickListener getListener() {
        return listener;
    }
}
