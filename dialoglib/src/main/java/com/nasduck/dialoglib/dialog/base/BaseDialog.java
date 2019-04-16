package com.nasduck.dialoglib.dialog.base;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.utils.DensityUtils;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class BaseDialog extends DialogFragment {

    private IDialogView mDialogView;
    private int mCornerRadius;
    private int mDialogWidth;
    private boolean mTouchOutsideCancelable;
    private boolean mTouchBackCancelable;
    private boolean mHasShade;

    public static BaseDialog newInstance() {
        return new BaseDialog();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        View rootView = inflater.inflate(R.layout.dialog_custom, container, false);
        LinearLayout layout = rootView.findViewById(R.id.container);

        // BgColor & CornerRadius
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(DensityUtils.dp2px(getContext(), mCornerRadius));
        drawable.setColor(getResources().getColor(android.R.color.transparent));
        layout.setBackground(drawable);

        if (!mHasShade) {
            getDialog().getWindow().setDimAmount(0f);
        }

        // Outside Touch Cancelable
        getDialog().setCanceledOnTouchOutside(mTouchOutsideCancelable);

        // Back Key Cancelable
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

        int index = 0;
        // set dialog mView
        if (mDialogView != null) {
            // Add header
            if (mDialogView.getHeaderLayout(getContext()) != null) {
                layout.addView(mDialogView.getHeaderLayout(rootView.getContext()), index++);
            }

            // Add Body
            layout.addView(mDialogView.getBodyLayout(getContext()), index++);

            // Add footer
            if (mDialogView.getFooterLayout(getContext()) != null) {
                layout.addView(mDialogView.getFooterLayout(rootView.getContext()), index);
            }

        }
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        getDialog().getWindow().setLayout(DensityUtils.dp2px(getContext(), mDialogWidth), WRAP_CONTENT);
    }

    public BaseDialog setDialogView(IDialogView dialogView) {
        this.mDialogView = dialogView;
        return this;
    }

    public BaseDialog setDialogWidth(int width) {
        this.mDialogWidth = width;
        return this;
    }

    public BaseDialog setCornerRadius(int cornerRadius) {
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
