package com.zoopark.dialog.builder;

import android.content.Context;
import android.view.View;

import com.zoopark.dialog.config.HeaderConfig;
import com.zoopark.dialog.view.DialogHeader;

public class DialogHeaderBuilder implements IBuilder {

    private HeaderConfig config;

    private DialogHeaderBuilder(HeaderConfig config) {
        this.config = config;
    }

    public static DialogHeaderBuilder getInstance() {
        return create(HeaderConfig.newInstance());
    }

    public static DialogHeaderBuilder create(HeaderConfig config) {
        return new DialogHeaderBuilder(config);
    }

    @Override
    public View getView(Context context) {
        return DialogHeader.create(context, config);
    }

    public DialogHeaderBuilder setTitleTypeface(int typeface) {
        this.config.setTypeface(typeface);
        return this;
    }
    
    public DialogHeaderBuilder setGravity(int gravity) {
        this.config.setGravity(gravity);
        return this;
    }

    public DialogHeaderBuilder setTitle(String title) {
        this.config.setTitle(title);
        return this;
    }

    public DialogHeaderBuilder setTitleColor(int titleColor) {
        this.config.setTitleColor(titleColor);
        return this;
    }

    public DialogHeaderBuilder setTitleSize(int titleSize) {
        this.config.setTitleTextSize(titleSize);
        return this;
    }

    public DialogHeaderBuilder setPaddingTop(int paddingTop) {
        this.config.setPaddingTop(paddingTop);
        return this;
    }

    public DialogHeaderBuilder setPaddingBottom(int paddingBottom) {
        this.config.setPaddingBottom(paddingBottom);
        return this;
    }

    public DialogHeaderBuilder setPaddingLeft(int paddingLeft) {
        this.config.setPaddingLeft(paddingLeft);
        return this;
    }

    public DialogHeaderBuilder setPaddingRight(int paddingRight) {
        this.config.setPaddingRight(paddingRight);
        return this;
    }

    public DialogHeaderBuilder setPaddingHorizontal(int padding) {
        this.config.setPaddingLeft(padding);
        this.config.setPaddingRight(padding);
        return this;
    }

    public DialogHeaderBuilder setPaddingVertical(int padding) {
        this.config.setPaddingTop(padding);
        this.config.setPaddingBottom(padding);
        return this;
    }

    public DialogHeaderBuilder setPadding(int padding) {
        this.config.setPaddingLeft(padding);
        this.config.setPaddingTop(padding);
        this.config.setPaddingRight(padding);
        this.config.setPaddingBottom(padding);
        return this;
    }

    public DialogHeaderBuilder setBgColor(int color) {
        this.config.setBgColor(color);
        return this;
    }

}
