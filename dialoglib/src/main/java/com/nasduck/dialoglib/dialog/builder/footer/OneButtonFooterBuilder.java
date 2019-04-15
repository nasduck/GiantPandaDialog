package com.nasduck.dialoglib.dialog.builder.footer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.dialog.config.FooterConfig;
import com.nasduck.dialoglib.dialog.interfaces.IDialogFooterBuilder;
import com.nasduck.dialoglib.dialog.config.BodyConfig;
import com.nasduck.dialoglib.dialog.composition.footer.OneButtonFooter;
import com.nasduck.dialoglib.dialog.interfaces.OnNormalClickListener;

public class OneButtonFooterBuilder implements IDialogFooterBuilder {

    private FooterConfig config;

    private OneButtonFooterBuilder(FooterConfig config) {
        this.config = config;
    }

    public static OneButtonFooterBuilder getInstance() {
        return create(FooterConfig.newInstance());
    }

    public static OneButtonFooterBuilder create(FooterConfig config) {
        return new OneButtonFooterBuilder(config);
    }

    @Override
    public View getView(FragmentActivity activity, Context context, String tag) {
        return OneButtonFooter.create(activity, context, FooterConfig.newInstance(), tag);
    }

    @Override
    public void getCornerRadius(int cornerRadius) {
        //this.config.;
    }

    @Override
    public void getNormalStatusColor(int color) {
        //this.backgroundColor = color;
    }

    public OneButtonFooterBuilder setClickBackgroundColor(Integer clickBackgroundColor) {
        this.config.setClickBackgroundColor(clickBackgroundColor);
        return this;
    }

    public OneButtonFooterBuilder setNormalClickListener(OnNormalClickListener normalClickListener) {
        this.config.setNormalClickListener(normalClickListener);
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonText(String normalButtonText) {
        this.config.setNormalButtonText(normalButtonText);
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonTextColor(Integer normalButtonTextColor) {
        this.config.setNormalButtonTextColor(normalButtonTextColor);
        return this;
    }

    public OneButtonFooterBuilder setNormalButtonTextSize(Integer normalButtonTextSize) {
        this.config.setNormalButtonTextSize(normalButtonTextSize);
        return this;
    }
}
