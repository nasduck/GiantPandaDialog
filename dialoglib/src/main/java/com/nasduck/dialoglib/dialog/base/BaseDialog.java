package com.nasduck.dialoglib.dialog.base;

import android.content.DialogInterface;
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
import android.widget.LinearLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.dialog.composition.DialogBody;
import com.nasduck.dialoglib.dialog.composition.DialogHeader;
import com.nasduck.dialoglib.utils.DensityUtils;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class BaseDialog extends DialogFragment {

    private IDialogView mDialogView;
    private int mCornerRadius;
    private int mDialogWidth;
    private boolean mCanceledOnTouchOutside;
    private boolean mCancelOnTouchBack;
    private boolean mHasShade;

    public static BaseDialog newInstance() {
        return new BaseDialog();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.base_dialog);
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dialog_custom, container, false);
        LinearLayout layout = rootView.findViewById(R.id.container);

        // CornerRadius
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(DensityUtils.dp2px(getContext(), mCornerRadius));
        layout.setBackground(drawable);

        if (!mHasShade) {
            getDialog().getWindow().setDimAmount(0f);
        }

        // Touch Cancelable
        getDialog().setCanceledOnTouchOutside(mCanceledOnTouchOutside);
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    if (mCancelOnTouchBack) {
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

            DialogHeader header = (DialogHeader) mDialogView.getHeaderLayout(getContext());
            DialogBody body = (DialogBody) mDialogView.getBodyLayout(getContext());

            if (header != null) {
                // Add Header
                layout.addView(header, index++);
                header.setCornerRadius(getContext(), mCornerRadius);
            } else {
                body.setCornerRadius(getContext(), mCornerRadius);
            }

            // Add Body
            layout.addView(body, index++);

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
        this.mCanceledOnTouchOutside = cancelable;
        return this;
    }

    public BaseDialog setCancelOnTouchBack(boolean cancelable) {
        this.mCancelOnTouchBack = cancelable;
        return this;
    }

    public BaseDialog setHasShade(boolean hasShade) {
        this.mHasShade = hasShade;
        return this;
    }
}
