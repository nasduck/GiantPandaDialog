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
    private float mCornerRadius;
    private boolean mTouchOutsideCancelable;
    private boolean mTouchBackCancelable;
    private boolean mHasShade;

    private String mDialogTag;

    public DialogController(FragmentActivity activity) {
        mActivity = activity;
        mBackgroundColorId = R.color.white;
        mCornerRadius = 0f;
        mDialogTag = "dialog";
        mTouchOutsideCancelable = false;
        mTouchBackCancelable = false;
        mHasShade = true;
    }

    public static DialogController create(FragmentActivity activity) {
        return new DialogController(activity);
    }

    public DialogController setHeader(IDialogHeader builder) {
        this.headerBuilder = builder;
        return this;
    }

    public DialogController setBody(IDialogBody builder) {
        this.bodyBuilder = builder;
        return this;
    }

    public DialogController setFooter(IDialogFooter builder) {
        this.footerBuilder = builder;
        return this;
    }

    public DialogController setDialogTag(String tag) {
        this.mDialogTag = tag;
        return this;
    }

    public DialogController setBackgroundColor(int colorId) {
        this.mBackgroundColorId = colorId;
        return this;
    }

    public DialogController setCornerRadius(float radius) {
        this.mCornerRadius = radius;
        return this;
    }

    public DialogController setTouchOutsideCancelable(boolean cancelable) {
        this.mTouchOutsideCancelable = cancelable;
        return this;
    }

    public DialogController setCancelOnTouchBack(boolean cancelable) {
        this.mTouchBackCancelable = cancelable;
        return this;
    }

    public DialogController setHasShade(boolean hasShade) {
        this.mHasShade = hasShade;
        return this;
    }

    public void show() {
        BaseDialog.create()
                .setDialogView(new IDialogView() {
                    @Override
                    public View getViewHeader(Context context) {
                        if (headerBuilder != null) {
                            headerBuilder.getCornerRadius(mCornerRadius);
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
                            footerBuilder.getCornerRadius(mCornerRadius);
                            footerBuilder.getNormalStatusColor(mBackgroundColorId);
                            return footerBuilder.getView(mActivity, context, mDialogTag);
                        } else {
                            return null;
                        }
                    }
                })
                .setBackgroundColor(mBackgroundColorId)
                .setCornerRadius(mCornerRadius)
                .setCanceledOnTouchOutside(mTouchOutsideCancelable)
                .setCancelOnTouchBack(mTouchBackCancelable)
                .setHasShade(mHasShade)
                .show(mActivity.getSupportFragmentManager(), mDialogTag);
    }

}
