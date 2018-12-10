package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.NoTitleSelectDialog;

public class DialogSelectNoTitleConfigBean extends BaseConfigBean {

    // content
    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    // positive button
    private String positiveButtonText;
    private int positiveButtonTextColor;
    private int positiveButtonTextSize;

    // negative button
    private String negativeButtonText;
    private int negativeButtonTextColor;
    private int negativeButtonTextSize;

    private NoTitleSelectDialog.onSelectClickListener listener;

    /**  set way  ********************************************************************************/

    public DialogSelectNoTitleConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public DialogSelectNoTitleConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public DialogSelectNoTitleConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public DialogSelectNoTitleConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public DialogSelectNoTitleConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public DialogSelectNoTitleConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public DialogSelectNoTitleConfigBean setPositiveButtonText(String positiveButtonText) {
        this.positiveButtonText = positiveButtonText;
        return this;
    }

    public DialogSelectNoTitleConfigBean setPositiveButtonTextColor(int positiveButtonTextColor) {
        this.positiveButtonTextColor = positiveButtonTextColor;
        return this;
    }

    public DialogSelectNoTitleConfigBean setPositiveButtonTextSize(int positiveButtonTextSize) {
        this.positiveButtonTextSize = positiveButtonTextSize;
        return this;
    }

    public DialogSelectNoTitleConfigBean setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
        return this;
    }

    public DialogSelectNoTitleConfigBean setNegativeButtonTextColor(int negativeButtonTextColor) {
        this.negativeButtonTextColor = negativeButtonTextColor;
        return this;
    }

    public DialogSelectNoTitleConfigBean setNegativeButtonTextSize(int negativeButtonTextSize) {
        this.negativeButtonTextSize = negativeButtonTextSize;
        return this;
    }

    public DialogSelectNoTitleConfigBean setListener(NoTitleSelectDialog.onSelectClickListener listener) {
        this.listener = listener;
        return this;
    }

    /**  Create an instance and display it  ******************************************************/

    public void show(FragmentActivity activity, String tag) {
        NoTitleSelectDialog.newNoTitleTipDialog(this)
                .setOnSelectClickListener(getListener())
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

    public String getPositiveButtonText() {
        return positiveButtonText;
    }

    public int getPositiveButtonTextColor() {
        return positiveButtonTextColor;
    }

    public int getPositiveButtonTextSize() {
        return positiveButtonTextSize;
    }

    public String getNegativeButtonText() {
        return negativeButtonText;
    }

    public int getNegativeButtonTextColor() {
        return negativeButtonTextColor;
    }

    public int getNegativeButtonTextSize() {
        return negativeButtonTextSize;
    }

    public NoTitleSelectDialog.onSelectClickListener getListener() {
        return listener;
    }
}
