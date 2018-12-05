package com.nasduck.dialoglib.config;

import com.nasduck.dialoglib.toast.TextToast;

/**
 * TextToast需要配置的参数
 */
public class TextToastConfigBean extends BaseConfigBean {

    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    /**  set方法  *******************************************************************************/

    public TextToastConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public TextToastConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public TextToastConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public TextToastConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public TextToastConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public TextToastConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    /**  创建实例  *******************************************************************************/

    public TextToast buildTextToast() {
        return TextToast.newTextToast(this);
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
