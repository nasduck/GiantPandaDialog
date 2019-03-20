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

    private String normalButtonText;
    private Integer normalButtonTextColor;
    private Integer normalButtonTextSize;

    private String positiveButtonText;
    private Integer positiveButtonTextColor;
    private Integer positiveButtonTextSize;

    private String negativeButtonText;
    private Integer negativeButtonTextColor;
    private Integer negativeButtonTextSize;

    public ThreeButtonFooterBuilder() {
        normalButtonText = "中间件";
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

    /**********************************************************************************************/

    public ThreeButtonFooterBuilder setNormalClickListener(OnNormalClickListener normalClickListener) {
        this.normalClickListener = normalClickListener;
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonText(String normalButtonText) {
        this.normalButtonText = normalButtonText;
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonTextColor(Integer normalButtonTextColor) {
        this.normalButtonTextColor = normalButtonTextColor;
        return this;
    }

    public ThreeButtonFooterBuilder setNormalButtonTextSize(Integer normalButtonTextSize) {
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

    public ThreeButtonFooterBuilder setPositiveButtonTextColor(Integer positiveButtonTextColor) {
        this.positiveButtonTextColor = positiveButtonTextColor;
        return this;
    }

    public ThreeButtonFooterBuilder setPositiveButtonTextSize(Integer positiveButtonTextSize) {
        this.positiveButtonTextSize = positiveButtonTextSize;
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonTextColor(Integer negativeButtonTextColor) {
        this.negativeButtonTextColor = negativeButtonTextColor;
        return this;
    }

    public ThreeButtonFooterBuilder setNegativeButtonTextSize(Integer negativeButtonTextSize) {
        this.negativeButtonTextSize = negativeButtonTextSize;
        return this;
    }

    /**********************************************************************************************/

    public OnNormalClickListener getNormalClickListener() {
        return normalClickListener;
    }

    public String getNormalButtonText() {
        return normalButtonText;
    }

    public Integer getNormalButtonTextColor() {
        return normalButtonTextColor;
    }

    public Integer getNormalButtonTextSize() {
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

    public Integer getPositiveButtonTextColor() {
        return positiveButtonTextColor;
    }

    public Integer getPositiveButtonTextSize() {
        return positiveButtonTextSize;
    }

    public String getNegativeButtonText() {
        return negativeButtonText;
    }

    public Integer getNegativeButtonTextColor() {
        return negativeButtonTextColor;
    }

    public Integer getNegativeButtonTextSize() {
        return negativeButtonTextSize;
    }
}
