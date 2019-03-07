package com.nasduck.dialoglib.builder.dialog;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.controller.DuckDialog;
import com.nasduck.dialoglib.dialog.footer.OneButtonFooter;
import com.nasduck.dialoglib.interfaces.OnNormalClickListener;

public class OneButtonFooterBuilder {

    private OnNormalClickListener normalClickListener;

    private String normalButtonText;
    private Integer normalButtonTextColor;
    private Integer normalButtonTextSize;

    public OneButtonFooterBuilder() {
        normalButtonText = "确定";
        normalButtonTextColor = R.color.text_black;
        normalButtonTextSize = 16;
        normalClickListener = null;
    }

    public static OneButtonFooterBuilder create() {
        return new OneButtonFooterBuilder();
    }

    public View getView(Context context) {
        return OneButtonFooter.create(context, new DialogConfig(OneButtonFooterBuilder.this));
    }

    public DialogConfig build() {
        return new DialogConfig(OneButtonFooterBuilder.this);
    }

    /**********************************************************************************************/

    public OneButtonFooterBuilder setNormalClickListener(OnNormalClickListener normalClickListener) {
        this.normalClickListener = normalClickListener;
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonText(String normalButtonText) {
        this.normalButtonText = normalButtonText;
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonTextColor(Integer normalButtonTextColor) {
        this.normalButtonTextColor = normalButtonTextColor;
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonTextSize(Integer normalButtonTextSize) {
        this.normalButtonTextSize = normalButtonTextSize;
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
}
