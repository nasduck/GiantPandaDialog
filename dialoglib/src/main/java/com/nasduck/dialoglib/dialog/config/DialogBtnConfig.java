package com.nasduck.dialoglib.dialog.config;

import android.view.Gravity;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.base.enums.ButtonStyle;
import com.nasduck.dialoglib.utils.DensityUtils;

public class DialogBtnConfig {

    private ButtonStyle style;
    private String text;
    private int buttonHeight;
    private int textColor;
    private int textSize;
    private int bgColor;
    private int bgColorPressed;
    private int gravity;
    private OnButtonClickListener listener;

    public interface OnButtonClickListener {
        void onButtonClick();
    }

    public static DialogBtnConfig newInstance() {
        return new DialogBtnConfig();
    }

    private DialogBtnConfig() {
        this.style = ButtonStyle.DEFAULT;
        this.buttonHeight = 44;
        this.bgColor = android.R.color.white;
        this.bgColorPressed = R.color.gray_light;
        this.textSize = 16;
        this.textColor = R.color.text_blue;
        this.gravity = Gravity.CENTER;
        this.listener = null;
    }

    public ButtonStyle getStyle() {
        return style;
    }

    public void setStyle(ButtonStyle style) {
        this.style = style;
    }

    public int getButtonHeight() {
        return buttonHeight;
    }

    public void setButtonHeight(int buttonHeight) {
        this.buttonHeight = buttonHeight;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    public int getBgColorPressed() {
        return bgColorPressed;
    }

    public void setBgColorPressed(int bgColorPressed) {
        this.bgColorPressed = bgColorPressed;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public OnButtonClickListener getListener() {
        return listener;
    }

    public void setListener(OnButtonClickListener listener) {
        this.listener = listener;
    }
}
