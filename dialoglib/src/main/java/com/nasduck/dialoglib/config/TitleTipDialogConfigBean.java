package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.TitleTipDialog;

public class TitleTipDialogConfigBean extends BaseConfigBean {

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

    // 按钮点击事件监听
    private TitleTipDialog.onSureClickListener listener;

    /**  set方法  *******************************************************************************/

    public TitleTipDialogConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public TitleTipDialogConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public TitleTipDialogConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public TitleTipDialogConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public TitleTipDialogConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public TitleTipDialogConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public TitleTipDialogConfigBean setButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    public TitleTipDialogConfigBean setButtonTextColor(int buttonTextColor) {
        this.buttonTextColor = buttonTextColor;
        return this;
    }

    public TitleTipDialogConfigBean setButtonTextSize(int buttonTextSize) {
        this.buttonTextSize = buttonTextSize;
        return this;
    }

    public TitleTipDialogConfigBean setTitleText(String titleText) {
        this.titleText = titleText;
        return this;
    }

    public TitleTipDialogConfigBean setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
        return this;
    }

    public TitleTipDialogConfigBean setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
        return this;
    }

    public TitleTipDialogConfigBean setListener(TitleTipDialog.onSureClickListener listener) {
        this.listener = listener;
        return this;
    }

    /**  创建实例并显示  *************************************************************************/

    public void show(FragmentActivity activity, String tag) {
        TitleTipDialog.newTextToast(this)
                .setOnSureClickListener(getListener())
                .show(activity.getSupportFragmentManager(), tag);
    }

    /**  get方法  ********************************************************************************/

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
