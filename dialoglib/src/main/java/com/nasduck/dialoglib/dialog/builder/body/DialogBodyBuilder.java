package com.nasduck.dialoglib.dialog.builder.body;

import android.content.Context;
import android.view.View;

import com.nasduck.dialoglib.dialog.interfaces.IDialogBodyBuilder;
import com.nasduck.dialoglib.dialog.config.BodyConfig;
import com.nasduck.dialoglib.dialog.composition.body.DialogBody;
import com.nasduck.dialoglib.base.enums.GravityWay;

public class DialogBodyBuilder implements IDialogBodyBuilder {

    private BodyConfig config;

    private DialogBodyBuilder(BodyConfig config) {
        this.config = config;
    }

    public static DialogBodyBuilder getInstance() {
        return create(BodyConfig.newInstance());
    }

    public static DialogBodyBuilder create(BodyConfig config) {
        return new DialogBodyBuilder(config);
    }

    @Override
    public View getView(Context context) {
        return DialogBody.create(context, BodyConfig.newInstance());
    }

    public DialogBodyBuilder setContent(String content) {
        this.config.setContent(content);
        return this;
    }

    public DialogBodyBuilder setContentColor(Integer contentColor) {
        this.config.setContentColor(contentColor);
        return this;
    }

    public DialogBodyBuilder setContentSize(Integer contentSize) {
        this.config.setContentTextSize(contentSize);
        return this;
    }

    public DialogBodyBuilder setGravity(GravityWay gravity) {
        this.config.setGravity(gravity);
        return this;
    }

    public DialogBodyBuilder setPaddingTop(Integer paddingTop) {
        this.config.setPaddingTop(paddingTop);
        return this;
    }

    public DialogBodyBuilder setPaddingBottom(Integer paddingBottom) {
        this.config.setPaddingBottom(paddingBottom);
        return this;
    }

    public DialogBodyBuilder setPaddingLeft(Integer paddingLeft) {
        this.config.setPaddingLeft(paddingLeft);
        return this;
    }

    public DialogBodyBuilder setPaddingRight(Integer paddingRight) {
        this.config.setPaddingRight(paddingRight);
        return this;
    }

    public DialogBodyBuilder setBgColor(Integer color) {
        this.config.setBgColor(color);
        return this;
    }

    public DialogBodyBuilder setCornerRadius(Integer cornerRadius) {
        this.config.setCornerRadius(cornerRadius);
        return this;
    }
}
