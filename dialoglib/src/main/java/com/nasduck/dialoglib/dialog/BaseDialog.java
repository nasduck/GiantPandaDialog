package com.nasduck.dialoglib.dialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.base.IDialogView;

public class BaseDialog extends DialogFragment {

    private IDialogView dialogView;

    public static BaseDialog create() {
        BaseDialog dialog = new BaseDialog();
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View viewLayout = inflater.inflate(R.layout.dialog_custom, container, false);
        LinearLayout layout = viewLayout.findViewById(R.id.layout);

        if (dialogView != null) {
            if (dialogView.getViewHeader(viewLayout.getContext()) != null) {
                layout.addView(dialogView.getViewHeader(viewLayout.getContext()), 0);
            }
            if (dialogView.getBodyLayout(viewLayout.getContext()) != null) {
                layout.addView(dialogView.getBodyLayout(viewLayout.getContext()), 1);
            }
            if (dialogView.getFooterLayout(viewLayout.getContext()) != null) {
                layout.addView(dialogView.getFooterLayout(viewLayout.getContext()), 2);
            }
        }
        return viewLayout;
    }

    public BaseDialog setDialogView(IDialogView dialogView) {
        this.dialogView = dialogView;
        return this;
    }

}
