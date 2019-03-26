package com.nasduck.dialoglib.builder.dialog.footer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogFooter;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.composition.footer.ThreeButtonFooter;
import com.nasduck.dialoglib.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.interfaces.OnPositiveClickListener;

public class ThreeButtonFooterBuilder implements IDialogFooter {

    private OnNormalClickListener normalClickListener;
    private OnPositiveClickListener positiveClickListener;
    private OnNegativeClickListener negativeClickListener;

    private int cornerRadius;
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
        cornerRadius = 0;
        clickBackgroundColor = R.color.gray_light;
        
        normalButtonText = "normal";
        normalButtonTextColor = R.color.text_black;
        normalButtonTextSize = 16;
        normalClickListener = null;

        positiveButtonText = "confirm";
        positiveButtonTextColor = R.color.text_black;
        positiveButtonTextSize = 16;
        positiveClickListener = null;

        negativeButtonText = "cancel";
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
    public void getCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    @Override
    public void getNormalStatusColor(int color) {
        this.backgroundColor = backgroundColor;
    }

    /**********************************************************************************************/

    public ThreeButtonFooterBuilder setClickBackgroundColor(Integer clickBackgroundColor) {
        if (clickBackgroundColor != null) {
            this.clickBackgroundColor = clickBackgroundColor;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setNormalClickListener(OnNormalClickListener normalClickListener) {
        if (normalClickListener != null) {
            this.normalClickListener = normalClickListener;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonText(String normalButtonText) {
        if (normalButtonText != null) {
            this.normalButtonText = normalButtonText;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonTextColor(Integer normalButtonTextColor) {
        if (normalButtonTextColor != null) {
            this.normalButtonTextColor = normalButtonTextColor;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonTextSize(Integer normalButtonTextSize) {
        if (normalButtonTextSize != null) {
            this.normalButtonTextSize = normalButtonTextSize;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveClickListener(OnPositiveClickListener positiveClickListener) {
        if (positiveClickListener != null) {
            this.positiveClickListener = positiveClickListener;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeClickListener(OnNegativeClickListener negativeClickListener) {
        if (negativeClickListener != null) {
            this.negativeClickListener = negativeClickListener;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveButtonText(String positiveButtonText) {
        if (positiveButtonText != null) {
            this.positiveButtonText = positiveButtonText;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveButtonTextColor(Integer positiveButtonTextColor) {
        if (positiveButtonTextColor != null) {
            this.positiveButtonTextColor = positiveButtonTextColor;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveButtonTextSize(Integer positiveButtonTextSize) {
        if (positiveButtonTextSize != null) {
            this.positiveButtonTextSize = positiveButtonTextSize;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonText(String negativeButtonText) {
        if (negativeButtonText != null) {
            this.negativeButtonText = negativeButtonText;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonTextColor(Integer negativeButtonTextColor) {
        if (negativeButtonTextColor != null) {
            this.negativeButtonTextColor = negativeButtonTextColor;
        }
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonTextSize(Integer negativeButtonTextSize) {
        if (negativeButtonTextSize != null) {
            this.negativeButtonTextSize = negativeButtonTextSize;
        }
        return this;
    }

    /**********************************************************************************************/

    public int getCornerRadius() {
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
