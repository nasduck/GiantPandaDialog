package com.nasduck.dialoglib.dialog.builder;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.dialog.config.HeaderConfig;
import com.nasduck.dialoglib.dialog.view.DialogHeader;

public class DialogHeaderBuilder implements IBuilder {

    private HeaderConfig mConfig;

    private DialogHeaderBuilder(HeaderConfig config) {
        this.mConfig = config;
    }

    public static DialogHeaderBuilder getInstance() {
        return create(HeaderConfig.newInstance());
    }

    public static DialogHeaderBuilder create(HeaderConfig config) {
        return new DialogHeaderBuilder(config);
    }

    @Override
    public View getView(Context context) {
        return DialogHeader.create(context, mConfig);
    }

    public DialogHeaderBuilder setTitleTypeface(int typeface) {
        mConfig.setTypeface(typeface);
        return this;
    }

    public DialogHeaderBuilder setTitle(String title) {
        mConfig.setTitle(title);
        return this;
    }

    public DialogHeaderBuilder setTitleColor(Integer titleColor) {
        mConfig.setTitleColor(titleColor);
        return this;
    }

    public DialogHeaderBuilder setTitleSize(Integer titleSize) {
        mConfig.setTitleTextSize(titleSize);
        return this;
    }

    public DialogHeaderBuilder setPaddingTop(int paddingTop) {
        mConfig.setPaddingTop(paddingTop);
        return this;
    }

    public DialogHeaderBuilder setPaddingBottom(int paddingBottom) {
        mConfig.setPaddingBottom(paddingBottom);
        return this;
    }

    public DialogHeaderBuilder setPaddingLeft(int paddingLeft) {
        mConfig.setPaddingLeft(paddingLeft);
        return this;
    }

    public DialogHeaderBuilder setPaddingRight(int paddingRight) {
        mConfig.setPaddingRight(paddingRight);
        return this;
    }

    public DialogHeaderBuilder setBgColor(int color) {
        mConfig.setBgColor(color);
        return this;
    }

}
