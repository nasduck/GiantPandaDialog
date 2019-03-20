package com.nasduck.dialoglib.builder.dialog.footer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogFooter;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.dialog.footer.OneButtonFooter;
import com.nasduck.dialoglib.interfaces.OnNormalClickListener;

public class OneButtonFooterBuilder implements IDialogFooter {

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

    @Override
    public View getView(FragmentActivity activity, Context context, String tag) {
        return OneButtonFooter.create(activity, context, new DialogConfig(OneButtonFooterBuilder.this), tag);
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
