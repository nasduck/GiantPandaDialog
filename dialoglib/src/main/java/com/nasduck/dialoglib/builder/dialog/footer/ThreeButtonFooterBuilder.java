package com.nasduck.dialoglib.builder.dialog.footer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogFooter;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.footer.ThreeButtonFooter;
import com.nasduck.dialoglib.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.interfaces.OnPositiveClickListener;

public class ThreeButtonFooterBuilder implements IDialogFooter {

    private OnNormalClickListener normalClickListener;
    private OnPositiveClickListener positiveClickListener;
    private OnNegativeClickListener negativeClickListener;

    private float cornerRadius;
    private int backgroundColor;
    private int clickBackgroundColor;

    private String normalButtonText;
    private int normalButtonTextColor;
    private int normalButtonTextSize;

    private String positiveButtonText;
    private int positiveButtonTextColor;
    private int positiveButtonTextSize;

    private String negativeButtonText;
    private int negativeButtonTextColor;
    private int negativeButtonTextSize;

    public ThreeButtonFooterBuilder() {
        cornerRadius = 0f;
        clickBackgroundColor = R.color.gray_light;
        
        normalButtonText = "中间键";
        normalButtonTextColor = R.color.text_black;
        normalButtonTextSize = 16;
        normalClickListener = null;

        positiveButtonText = "确定";
        positiveButtonTextColor = R.color.text_black;
        positiveButtonTextSize = 16;
        positiveClickListener = null;

        negativeButtonText = "取消";
        negativeButtonTextColor = R.color.text_black;
        negativeButtonTextSize = 16;
        negativeClickListener = null;
    }

    public static ThreeButtonFooterBuilder create() {
        return new ThreeButtonFooterBuilder();
    }

    @Override
    public View getView(FragmentActivity activity, Context context, String tag) {
        return ThreeButtonFooter.create(activity, context, new DialogConfig(ThreeButtonFooterBuilder.this), tag);
    }

    @Override
    public void getCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    @Override
    public void getNormalStatusColor(int color) {
        this.backgroundColor = backgroundColor;
    }

    /**********************************************************************************************/

    public ThreeButtonFooterBuilder setClickBackgroundColor(int clickBackgroundColor) {
        this.clickBackgroundColor = clickBackgroundColor;
        return this;
    }

    public ThreeButtonFooterBuilder setNormalClickListener(OnNormalClickListener normalClickListener) {
        this.normalClickListener = normalClickListener;
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonText(String normalButtonText) {
        this.normalButtonText = normalButtonText;
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonTextColor(int normalButtonTextColor) {
        this.normalButtonTextColor = normalButtonTextColor;
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonTextSize(int normalButtonTextSize) {
        this.normalButtonTextSize = normalButtonTextSize;
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveClickListener(OnPositiveClickListener positiveClickListener) {
        this.positiveClickListener = positiveClickListener;
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeClickListener(OnNegativeClickListener negativeClickListener) {
        this.negativeClickListener = negativeClickListener;
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveButtonText(String positiveButtonText) {
        this.positiveButtonText = positiveButtonText;
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveButtonTextColor(int positiveButtonTextColor) {
        this.positiveButtonTextColor = positiveButtonTextColor;
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveButtonTextSize(int positiveButtonTextSize) {
        this.positiveButtonTextSize = positiveButtonTextSize;
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonTextColor(int negativeButtonTextColor) {
        this.negativeButtonTextColor = negativeButtonTextColor;
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonTextSize(int negativeButtonTextSize) {
        this.negativeButtonTextSize = negativeButtonTextSize;
        return this;
    }

    /**********************************************************************************************/

    public float getCornerRadius() {
        return cornerRadius;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getClickBackgroundColor() {
        return clickBackgroundColor;
    }

    public OnNormalClickListener getNormalClickListener() {
        return normalClickListener;
    }

    public String getNormalButtonText() {
        return normalButtonText;
    }

    public int getNormalButtonTextColor() {
        return normalButtonTextColor;
    }

    public int getNormalButtonTextSize() {
        return normalButtonTextSize;
    }

    public OnPositiveClickListener getPositiveClickListener() {
        return positiveClickListener;
    }

    public OnNegativeClickListener getNegativeClickListener() {
        return negativeClickListener;
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
}
