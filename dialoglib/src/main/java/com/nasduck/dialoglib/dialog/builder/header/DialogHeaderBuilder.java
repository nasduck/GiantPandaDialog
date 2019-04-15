package com.nasduck.dialoglib.dialog.builder.header;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.dialog.config.HeaderConfig;
import com.nasduck.dialoglib.dialog.interfaces.IDialogHeaderBuilder;
import com.nasduck.dialoglib.dialog.composition.header.DialogHeader;

public class DialogHeaderBuilder implements IDialogHeaderBuilder {

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
}
