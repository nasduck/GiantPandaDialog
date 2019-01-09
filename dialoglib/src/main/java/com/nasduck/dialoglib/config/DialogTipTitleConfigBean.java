package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.TitleTipDialog;

public class DialogTipTitleConfigBean extends BaseConfig {

    // title
    private String titleText;
    private int titleTextColor;
    private int titleTextSize;

    // content
    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    // button
    private String buttonText;
    private int buttonTextColor;
    private int buttonTextSize;

    // click listener
    private TitleTipDialog.onSureClickListener listener;

    /**  set way  ********************************************************************************/

    public DialogTipTitleConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public DialogTipTitleConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public DialogTipTitleConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public DialogTipTitleConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public DialogTipTitleConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public DialogTipTitleConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public DialogTipTitleConfigBean setButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    public DialogTipTitleConfigBean setButtonTextColor(int buttonTextColor) {
        this.buttonTextColor = buttonTextColor;
        return this;
    }

    public DialogTipTitleConfigBean setButtonTextSize(int buttonTextSize) {
        this.buttonTextSize = buttonTextSize;
        return this;
    }

    public DialogTipTitleConfigBean setTitleText(String titleText) {
        this.titleText = titleText;
        return this;
    }

    public DialogTipTitleConfigBean setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
        return this;
    }

    public DialogTipTitleConfigBean setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
        return this;
    }

    public DialogTipTitleConfigBean setListener(TitleTipDialog.onSureClickListener listener) {
        this.listener = listener;
        return this;
    }

    /**  Create an instance and display it  ******************************************************/

    public void show(FragmentActivity activity, String tag) {
        TitleTipDialog.newTitleTipDialog(this)
                .setOnSureClickListener(getListener())
                .show(activity.getSupportFragmentManager(), tag);
    }

    /**  get way  ********************************************************************************/

    public String getTitleText() {
        return titleText;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public int getTitleTextSize() {
        return titleTextSize;
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

    public String getButtonText() {
        return buttonText;
    }

    public int getButtonTextColor() {
        return buttonTextColor;
    }

    public int getButtonTextSize() {
        return buttonTextSize;
    }

    public TitleTipDialog.onSureClickListener getListener() {
        return listener;
    }
}
