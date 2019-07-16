package com.zoopark.dialog.builder;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.zoopark.dialog.view.DialogButton;
import com.zoopark.dialog.view.DialogFooter;
import com.zoopark.dialog.base.IDialogView;
import com.zoopark.dialog.base.BaseDialog;

import java.util.ArrayList;
import java.util.List;

public class DialogBuilder {

    private FragmentActivity mActivity;

    private IBuilder mHeaderBuilder;
    private IBuilder mBodyBuilder;
    private List<DialogButton> mFooterBtnList;

    private int mCornerRadius;
    private int mDialogWidth;
    private int mBodyBackgroundColor;
    private boolean isBottomDividerVisible;
    private boolean mTouchOutsideCancelable;
    private boolean mTouchBackCancelable;
    private boolean mHasShade;

    private String mDialogTag;

    public static DialogBuilder getInstance(FragmentActivity activity) {
        return create(activity);
    }

    public static DialogBuilder create(FragmentActivity activity) {
        return new DialogBuilder(activity);
    }

    private DialogBuilder(FragmentActivity activity) {
        mActivity = activity;
        mDialogWidth = 260;
        mCornerRadius = 10;
        mBodyBackgroundColor = android.R.color.white;
        mDialogTag = "giant_panda_dialog";
        isBottomDividerVisible = true;
        mTouchOutsideCancelable = true;
        mTouchBackCancelable = true;
        mHasShade = true;

        mFooterBtnList = new ArrayList<>();
        mBodyBuilder = DialogBodyBuilder.getInstance();
    }

    public DialogBuilder setHeader(IBuilder builder) {
        this.mHeaderBuilder = builder;
        return this;
    }

    public DialogBuilder setBody(IBuilder builder) {
        this.mBodyBuilder = builder;
        return this;
    }

    public DialogBuilder addButton(DialogButton btn) {
        this.mFooterBtnList.add(btn);
        return this;
    }

    public DialogBuilder setDialogTag(String tag) {
        if (tag != null) {
            this.mDialogTag = tag;
        }
        return this;
    }

    public DialogBuilder setBodyBackgroundColor(int bgColor) {
        this.mBodyBackgroundColor = bgColor;
        return this;
    }

    public DialogBuilder setBottomDivideVisible(boolean isVisible) {
        this.isBottomDividerVisible = isVisible;
        return this;
    }

    public DialogBuilder setCornerRadius(int radius) {
        this.mCornerRadius = radius;
        return this;
    }

    public DialogBuilder setTouchOutsideCancelable(boolean cancelable) {
        this.mTouchOutsideCancelable = cancelable;
        return this;
    }

    public DialogBuilder setCancelOnTouchBack(boolean cancelable) {
        this.mTouchBackCancelable = cancelable;
        return this;
    }

    public DialogBuilder setHasShade(boolean hasShade) {
        this.mHasShade = hasShade;
        return this;
    }

    public DialogBuilder setDialogWidth(int width) {
        this.mDialogWidth = width;
        return this;
    }

    public void show() {
        BaseDialog.newInstance()
                .setDialogView(new IDialogView() {
                    @Override
                    public View getHeaderLayout(Context context) {
                        return mHeaderBuilder == null ? null : mHeaderBuilder.getView(context);
                    }

                    @Override
                    public View getBodyLayout(Context context) {
                        return mBodyBuilder.getView(context);
                    }

                    @Override
                    public View getFooterLayout(Context context) {
                        return mFooterBtnList.size() == 0 ? null : DialogFooter.newInstance(context, mFooterBtnList);
                    }
                })
                .setBodyBackgroundColor(mBodyBackgroundColor)
                .setCornerRadius(mCornerRadius)
                .setBottomDivideVisible(isBottomDividerVisible)
                .setCanceledOnTouchOutside(mTouchOutsideCancelable)
                .setCancelOnTouchBack(mTouchBackCancelable)
                .setHasShade(mHasShade)
                .setDialogWidth(mDialogWidth)
                .show(mActivity.getSupportFragmentManager(), mDialogTag);
    }

}
