package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.toast.TextToast;

/**
 * TextToast需要配置的参数
 */
public class ToastTextConfigBean extends BaseConfigBean {

    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    /**  set方法  *******************************************************************************/

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

    /**  创建实例并显示  *************************************************************************/

    public void show(FragmentActivity activity) {
        TextToast.newTextToast(this).show(activity.getSupportFragmentManager(), "");
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
}
