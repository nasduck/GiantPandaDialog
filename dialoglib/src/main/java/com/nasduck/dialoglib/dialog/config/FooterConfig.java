package com.nasduck.dialoglib.dialog.config;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.dialog.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnPositiveClickListener;

public class FooterConfig {

    private int clickBackgroundColor;

    // listener
    private OnNormalClickListener normalClickListener;
    private OnPositiveClickListener positiveClickListener;
    private OnNegativeClickListener negativeClickListener;

    // positive button
    private String positiveButtonText;
    private int positiveButtonTextColor;
    private int positiveButtonTextSize;

    // negative button
    private String negativeButtonText;
    private int negativeButtonTextColor;
    private int negativeButtonTextSize;

    // normal button
    private String normalButtonText;
    private int normalButtonTextColor;
    private int normalButtonTextSize;

    public static FooterConfig newInstance() {
        return new FooterConfig();
    }

    private FooterConfig() {
        this.clickBackgroundColor = R.color.gray_light;

        this.positiveButtonTextSize = 16;
        this.positiveButtonTextColor = R.color.text_gray;
        this.normalButtonTextSize = 16;
        this.normalButtonTextColor = R.color.text_gray;
        this.negativeButtonTextSize = 16;
        this.negativeButtonTextColor = R.color.text_gray;
    }

    public int getClickBackgroundColor() {
        return clickBackgroundColor;
    }

    public void setClickBackgroundColor(int clickBackgroundColor) {
        this.clickBackgroundColor = clickBackgroundColor;
    }

    public OnNormalClickListener getNormalClickListener() {
        return normalClickListener;
    }

    public void setNormalClickListener(OnNormalClickListener normalClickListener) {
        this.normalClickListener = normalClickListener;
    }

    public OnPositiveClickListener getPositiveClickListener() {
        return positiveClickListener;
    }

    public void setPositiveClickListener(OnPositiveClickListener positiveClickListener) {
        this.positiveClickListener = positiveClickListener;
    }

    public OnNegativeClickListener getNegativeClickListener() {
        return negativeClickListener;
    }

    public void setNegativeClickListener(OnNegativeClickListener negativeClickListener) {
        this.negativeClickListener = negativeClickListener;
    }

    public String getPositiveButtonText() {
        return positiveButtonText;
    }

    public void setPositiveButtonText(String positiveButtonText) {
        this.positiveButtonText = positiveButtonText;
    }

    public int getPositiveButtonTextColor() {
        return positiveButtonTextColor;
    }

    public void setPositiveButtonTextColor(int positiveButtonTextColor) {
        this.positiveButtonTextColor = positiveButtonTextColor;
    }

    public int getPositiveButtonTextSize() {
        return positiveButtonTextSize;
    }

    public void setPositiveButtonTextSize(int positiveButtonTextSize) {
        this.positiveButtonTextSize = positiveButtonTextSize;
    }

    public String getNegativeButtonText() {
        return negativeButtonText;
    }

    public void setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
    }

    public int getNegativeButtonTextColor() {
        return negativeButtonTextColor;
    }

    public void setNegativeButtonTextColor(int negativeButtonTextColor) {
        this.negativeButtonTextColor = negativeButtonTextColor;
    }

    public int getNegativeButtonTextSize() {
        return negativeButtonTextSize;
    }

    public void setNegativeButtonTextSize(int negativeButtonTextSize) {
        this.negativeButtonTextSize = negativeButtonTextSize;
    }

    public String getNormalButtonText() {
        return normalButtonText;
    }

    public void setNormalButtonText(String normalButtonText) {
        this.normalButtonText = normalButtonText;
    }

    public int getNormalButtonTextColor() {
        return normalButtonTextColor;
    }

    public void setNormalButtonTextColor(int normalButtonTextColor) {
        this.normalButtonTextColor = normalButtonTextColor;
    }

    public int getNormalButtonTextSize() {
        return normalButtonTextSize;
    }

    public void setNormalButtonTextSize(int normalButtonTextSize) {
        this.normalButtonTextSize = normalButtonTextSize;
    }
}
