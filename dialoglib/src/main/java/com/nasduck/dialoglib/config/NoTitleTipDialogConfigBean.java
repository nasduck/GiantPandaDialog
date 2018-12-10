package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.NoTitleTipDialog;
import com.nasduck.dialoglib.toast.TextToast;

public class NoTitleTipDialogConfigBean extends BaseConfigBean {

    // content
    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    // button
    private String buttonText;
    private int buttonTextColor;
    private int buttonTextSize;

    // 按钮点击事件监听
    private NoTitleTipDialog.onSureClickListener listener;

    /**  set方法  *******************************************************************************/

    public NoTitleTipDialogConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public NoTitleTipDialogConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public NoTitleTipDialogConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public NoTitleTipDialogConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public NoTitleTipDialogConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public NoTitleTipDialogConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public NoTitleTipDialogConfigBean setButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    public NoTitleTipDialogConfigBean setButtonTextColor(int buttonTextColor) {
        this.buttonTextColor = buttonTextColor;
        return this;
    }

    public NoTitleTipDialogConfigBean setButtonTextSize(int buttonTextSize) {
        this.buttonTextSize = buttonTextSize;
        return this;
    }

    public NoTitleTipDialogConfigBean setListener(NoTitleTipDialog.onSureClickListener listener) {
        this.listener = listener;
        return this;
    }

    /**  创建实例并显示  *************************************************************************/

    public void show(FragmentActivity activity, String tag) {
        NoTitleTipDialog.newTextToast(this)
                .setOnSureClickListener(getListener())
                .show(activity.getSupportFragmentManager(), tag);
    }

    /**  get方法  ********************************************************************************/

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
