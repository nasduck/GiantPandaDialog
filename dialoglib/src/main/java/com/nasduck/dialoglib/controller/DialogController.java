package com.nasduck.dialoglib.controller;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.interfaces.IDialogBody;
import com.nasduck.dialoglib.interfaces.IDialogFooter;
import com.nasduck.dialoglib.interfaces.IDialogHeader;
import com.nasduck.dialoglib.base.IDialogView;
import com.nasduck.dialoglib.dialog.BaseDialog;

public class DialogController {

    private FragmentActivity mActivity;

    private IDialogHeader headerBuilder;
    private IDialogBody bodyBuilder;
    private IDialogFooter footerBuilder;

    private int mBackgroundColorId;
    private int mCornerRadius;

    private String mDialogTag;

    public DialogController(FragmentActivity activity) {
        mActivity = activity;
        mBackgroundColorId = R.color.white;
        mCornerRadius = 10;
        mDialogTag = "dialog";
    }

    public static DialogController create(FragmentActivity activity) {
        return new DialogController(activity);
    }

    public DialogController createHeader(IDialogHeader builder) {
        headerBuilder = builder;
        return this;
    }

    public DialogController createBody(IDialogBody builder) {
        bodyBuilder = builder;
        return this;
    }

    public DialogController createFooter(IDialogFooter builder) {
        footerBuilder = builder;
        return this;
    }

    public DialogController setDialogTag(String tag) {
        mDialogTag = tag;
        return this;
    }

    public DialogController setBackgroundColor(int colorId) {
        mBackgroundColorId = colorId;
        return this;
    }

    public DialogController setCornerRadius(int radius) {
        mCornerRadius = radius;
        return this;
    }

    public void show() {
        BaseDialog.create()
                .setDialogView(new IDialogView() {
                    @Override
                    public View getViewHeader(Context context) {
                        if (headerBuilder != null) {
                            return headerBuilder.getView(context);
                        } else {
                            return null;
                        }

                    }

                    @Override
                    public View getBodyLayout(Context context) {
                        if (bodyBuilder != null) {
                            return bodyBuilder.getView(context);
                        } else {
                            return null;
                        }

                    }

                    @Override
                    public View getFooterLayout(Context context) {
                        if (footerBuilder != null) {
                            return footerBuilder.getView(mActivity, context, mDialogTag);
                        } else {
                            return null;
                        }
                    }
                })
                .setBackgroundColor(mBackgroundColorId)
                .setCornerRadius(mCornerRadius)
                .show(mActivity.getSupportFragmentManager(), mDialogTag);
    }

}
