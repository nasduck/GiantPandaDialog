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

    private String positiveButtonText;
    private Integer positiveButtonTextColor;
    private Integer positiveButtonTextSize;

    private String negativeButtonText;
    private Integer negativeButtonTextColor;
    private Integer negativeButtonTextSize;

    public TwoButtonFooterBuilder() {
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

    /**********************************************************************************************/

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

    public TwoButtonFooterBuilder setPositiveButtonTextColor(Integer positiveButtonTextColor) {
        this.positiveButtonTextColor = positiveButtonTextColor;
        return this;
    }

    public TwoButtonFooterBuilder setPositiveButtonTextSize(Integer positiveButtonTextSize) {
        this.positiveButtonTextSize = positiveButtonTextSize;
        return this;
    }

    public TwoButtonFooterBuilder setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
        return this;
    }

    public TwoButtonFooterBuilder setNegativeButtonTextColor(Integer negativeButtonTextColor) {
        this.negativeButtonTextColor = negativeButtonTextColor;
        return this;
    }

    public TwoButtonFooterBuilder setNegativeButtonTextSize(Integer negativeButtonTextSize) {
        this.negativeButtonTextSize = negativeButtonTextSize;
        return this;
    }

    /**********************************************************************************************/

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
