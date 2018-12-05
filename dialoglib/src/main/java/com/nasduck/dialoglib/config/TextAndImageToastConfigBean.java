package com.nasduck.dialoglib.config;

import com.nasduck.dialoglib.toast.TextImageToast;

public class TextAndImageToastConfigBean extends BaseConfigBean {

    private int image;

    private String contentText;
    private int contentTextColor;
    private int contentTextSize;

    /**  set方法  *******************************************************************************/

    public TextAndImageToastConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public TextAndImageToastConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public TextAndImageToastConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public TextAndImageToastConfigBean setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    public TextAndImageToastConfigBean setContentTextColor(int contentTextColor) {
        this.contentTextColor = contentTextColor;
        return this;
    }

    public TextAndImageToastConfigBean setContentTextSize(int contentTextSize) {
        this.contentTextSize = contentTextSize;
        return this;
    }

    public TextAndImageToastConfigBean setImage(int image) {
        this.image = image;
        return this;
    }

    /**  创建实例  *******************************************************************************/

    public TextImageToast buildTextImageToast() {
        return TextImageToast.newTextToast(this);
    }

    /**  get方法  ********************************************************************************/

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
