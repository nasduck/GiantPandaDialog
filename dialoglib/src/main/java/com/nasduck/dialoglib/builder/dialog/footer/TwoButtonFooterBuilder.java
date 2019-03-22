package com.nasduck.dialoglib.builder.dialog.footer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogFooter;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.footer.TwoButtonFooter;
import com.nasduck.dialoglib.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.interfaces.OnPositiveClickListener;

public class TwoButtonFooterBuilder implements IDialogFooter {

    private OnPositiveClickListener positiveClickListener;
    private OnNegativeClickListener negativeClickListener;

    private float cornerRadius;
    private int backgroundColor;
    private int clickBackgroundColor;

    private String positiveButtonText;
    private int positiveButtonTextColor;
    private int positiveButtonTextSize;

    private String negativeButtonText;
    private int negativeButtonTextColor;
    private int negativeButtonTextSize;

    public TwoButtonFooterBuilder() {
        cornerRadius = 0f;
        clickBackgroundColor = R.color.gray_light;

        positiveButtonText = "确定";
        positiveButtonTextColor = R.color.text_black;
        positiveButtonTextSize = 16;
        positiveClickListener = null;

        negativeButtonText = "取消";
        negativeButtonTextColor = R.color.text_black;
        negativeButtonTextSize = 16;
        negativeClickListener = null;
    }

    public static TwoButtonFooterBuilder create() {
        return new TwoButtonFooterBuilder();
    }

    @Override
    public View getView(FragmentActivity activity, Context context, String tag) {
        return TwoButtonFooter.create(activity, context, new DialogConfig(TwoButtonFooterBuilder.this), tag);
    }

    @Override
    public void getCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    @Override
    public void getNormalStatusColor(int color) {
        this.backgroundColor = color;
    }

    /**********************************************************************************************/

    public TwoButtonFooterBuilder setClickBackgroundColor(int clickBackgroundColor) {
        this.clickBackgroundColor = clickBackgroundColor;
        return this;
    }

    public TwoButtonFooterBuilder setPositiveClickListener(OnPositiveClickListener positiveClickListener) {
        this.positiveClickListener = positiveClickListener;
        return this;
    }

    public TwoButtonFooterBuilder setNegativeClickListener(OnNegativeClickListener negativeClickListener) {
        this.negativeClickListener = negativeClickListener;
        return this;
    }

    public TwoButtonFooterBuilder setPositiveButtonText(String positiveButtonText) {
        this.positiveButtonText = positiveButtonText;
        return this;
    }

    public TwoButtonFooterBuilder setPositiveButtonTextColor(int positiveButtonTextColor) {
        this.positiveButtonTextColor = positiveButtonTextColor;
        return this;
    }

    public TwoButtonFooterBuilder setPositiveButtonTextSize(int positiveButtonTextSize) {
        this.positiveButtonTextSize = positiveButtonTextSize;
        return this;
    }

    public TwoButtonFooterBuilder setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
        return this;
    }

    public TwoButtonFooterBuilder setNegativeButtonTextColor(int negativeButtonTextColor) {
        this.negativeButtonTextColor = negativeButtonTextColor;
        return this;
    }

    public TwoButtonFooterBuilder setNegativeButtonTextSize(int negativeButtonTextSize) {
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
