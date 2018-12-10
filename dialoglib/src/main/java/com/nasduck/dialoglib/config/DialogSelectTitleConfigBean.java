package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.TitleSelectDialog;

public class DialogSelectTitleConfigBean extends BaseConfigBean {

    // title
    private String titleText;
    private int titleTextColor;
    private int titleTextSize;

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

    private TitleSelectDialog.onSelectClickListener listener;

    /**  set way  ********************************************************************************/

    public DialogSelectTitleConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public DialogSelectTitleConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public DialogSelectTitleConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public DialogSelectTitleConfigBean setTitleText(String titleText) {
        this.titleText = titleText;
        return this;
    }

    public DialogSelectTitleConfigBean setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
        return this;
    }

    public DialogSelectTitleConfigBean setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
        return this;
    }

    public DialogSelectTitleConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public DialogSelectTitleConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public DialogSelectTitleConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public DialogSelectTitleConfigBean setPositiveButtonText(String positiveButtonText) {
        this.positiveButtonText = positiveButtonText;
        return this;
    }

    public DialogSelectTitleConfigBean setPositiveButtonTextColor(int positiveButtonTextColor) {
        this.positiveButtonTextColor = positiveButtonTextColor;
        return this;
    }

    public DialogSelectTitleConfigBean setPositiveButtonTextSize(int positiveButtonTextSize) {
        this.positiveButtonTextSize = positiveButtonTextSize;
        return this;
    }

    public DialogSelectTitleConfigBean setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
        return this;
    }

    public DialogSelectTitleConfigBean setNegativeButtonTextColor(int negativeButtonTextColor) {
        this.negativeButtonTextColor = negativeButtonTextColor;
        return this;
    }

    public DialogSelectTitleConfigBean setNegativeButtonTextSize(int negativeButtonTextSize) {
        this.negativeButtonTextSize = negativeButtonTextSize;
        return this;
    }

    public DialogSelectTitleConfigBean setListener(TitleSelectDialog.onSelectClickListener listener) {
        this.listener = listener;
        return this;
    }

    /**  Create an instance and display it  ******************************************************/

    public void show(FragmentActivity activity, String tag) {
        TitleSelectDialog.newTitleTipDialog(this)
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

    public String getTitleText() {
        return titleText;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public int getTitleTextSize() {
        return titleTextSize;
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

    public TitleSelectDialog.onSelectClickListener getListener() {
        return listener;
    }
}
