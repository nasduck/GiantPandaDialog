package com.nasduck.dialoglib.dialog;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.base.IDialogView;
import com.nasduck.dialoglib.config.ToastConfig;
import com.nasduck.dialoglib.toast.TextToast;
import com.nasduck.dialoglib.utils.DensityUtils;

public class BaseDialog extends DialogFragment {

    private IDialogView mDialogView;
    private int mBackgroundColorId;
    private float mCornerRadius;
    private boolean mTouchOutsideCancelable;
    private boolean mTouchBackCancelable;
    private boolean mHasShade;

    public static BaseDialog create() {
        BaseDialog dialog = new BaseDialog();
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        View viewLayout = inflater.inflate(R.layout.dialog_custom, container, false);
        LinearLayout layout = viewLayout.findViewById(R.id.layout);
        // set dialog background
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(DensityUtils.dp2px(getContext(), mCornerRadius));
        drawable.setColor(getResources().getColor(mBackgroundColorId));
        layout.setBackground(drawable);
        if (!mHasShade) {
            getDialog().getWindow().setDimAmount(0f);
        }
        // set dialog cancel
        getDialog().setCanceledOnTouchOutside(mTouchOutsideCancelable);
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    if (mTouchBackCancelable) {
                        return false;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        });
        // set dialog view
        if (mDialogView != null) {
            if (mDialogView.getViewHeader(viewLayout.getContext()) != null) {
                layout.addView(mDialogView.getViewHeader(viewLayout.getContext()), 0);
            }
            if (mDialogView.getBodyLayout(viewLayout.getContext()) != null) {
                layout.addView(mDialogView.getBodyLayout(viewLayout.getContext()), 1);
            }
            if (mDialogView.getFooterLayout(viewLayout.getContext()) != null) {
                layout.addView(mDialogView.getFooterLayout(viewLayout.getContext()), 2);
            }
        }
        return viewLayout;
    }

    public BaseDialog setDialogView(IDialogView dialogView) {
        this.mDialogView = dialogView;
        return this;
    }

    public BaseDialog setBackgroundColor(int colorId) {
        this.mBackgroundColorId = colorId;
        return this;
    }

    public BaseDialog setCornerRadius(float cornerRadius) {
        this.mCornerRadius = cornerRadius;
        return this;
    }

    public BaseDialog setCanceledOnTouchOutside(boolean cancelable) {
        this.mTouchOutsideCancelable = cancelable;
        return this;
    }

    public BaseDialog setCancelOnTouchBack(boolean cancelable) {
        this.mTouchBackCancelable = cancelable;
        return this;
    }

    public BaseDialog setHasShade(boolean hasShade) {
        this.mHasShade = hasShade;
        return this;
    }
}
