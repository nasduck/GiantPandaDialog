package com.nasduck.dialoglib.dialog.builder;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.dialog.interfaces.IDialogBody;
import com.nasduck.dialoglib.dialog.interfaces.IDialogFooter;
import com.nasduck.dialoglib.dialog.interfaces.IDialogHeader;
import com.nasduck.dialoglib.dialog.base.IDialogView;
import com.nasduck.dialoglib.dialog.base.BaseDialog;

public class DialogBuilder {

    private FragmentActivity mActivity;

    private IDialogHeader headerBuilder;
    private IDialogBody bodyBuilder;
    private IDialogFooter footerBuilder;

    private int mBackgroundColorId;
    private int mCornerRadius;
    private int mDialogWidth;
    private boolean mTouchOutsideCancelable;
    private boolean mTouchBackCancelable;
    private boolean mHasShade;

    private String mDialogTag;

    public DialogBuilder(FragmentActivity activity) {
        mActivity = activity;
        mDialogWidth = 260;
        mBackgroundColorId = R.color.white;
        mCornerRadius = 0;
        mDialogTag = "dialog";
        mTouchOutsideCancelable = false;
        mTouchBackCancelable = false;
        mHasShade = true;
    }

    public DialogBuilder setHeader(IDialogHeader builder) {
        this.headerBuilder = builder;
        return this;
    }

    public DialogBuilder setBody(IDialogBody builder) {
        this.bodyBuilder = builder;
        return this;
    }

    public DialogBuilder setFooter(IDialogFooter builder) {
        this.footerBuilder = builder;
        return this;
    }

    public DialogBuilder setDialogTag(String tag) {
        if (tag != null) {
            this.mDialogTag = tag;
        }
        return this;
    }

    public DialogBuilder setBackgroundColor(Integer colorId) {
        if (colorId != null) {
            this.mBackgroundColorId = colorId;
        }
        return this;
    }

    public DialogBuilder setCornerRadius(Integer radius) {
        if (radius != null) {
            this.mCornerRadius = radius;
        }
        return this;
    }

    public DialogBuilder setTouchOutsideCancelable(Boolean cancelable) {
        if (cancelable != null) {
            this.mTouchOutsideCancelable = cancelable;
        }
        return this;
    }

    public DialogBuilder setCancelOnTouchBack(Boolean cancelable) {
        if (cancelable != null) {
            this.mTouchBackCancelable = cancelable;
        }
        return this;
    }

    public DialogBuilder setHasShade(Boolean hasShade) {
        if (hasShade != null) {
            this.mHasShade = hasShade;
        }
        return this;
    }

    public DialogBuilder setDialogWidth(Integer width) {
        if (width != null) {
            this.mDialogWidth = width;
        }
        return this;
    }

    public void show() {
        BaseDialog.create()
                .setDialogView(new IDialogView() {
                    @Override
                    public View getHeaderLayout(Context context) {
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
                .setDialogWidth(mDialogWidth)
                .show(mActivity.getSupportFragmentManager(), mDialogTag);
    }

}
