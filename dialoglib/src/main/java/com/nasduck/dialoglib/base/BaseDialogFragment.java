package com.nasduck.dialoglib.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public abstract class BaseDialogFragment extends DialogFragment implements IDialogFragment {

    protected Context mContext;
    protected View view;

    protected int mBackground;
    protected boolean isCancelable;
    protected boolean hasShade;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // bind view
        view = inflater.inflate(initView(savedInstanceState), container);

        // Removes the dialog box's default title bar
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initData(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        this.mContext = context;
        super.onAttach(context);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    /**
     * set shade
     * @param hasShade
     */
    public void setShade(boolean hasShade) {
        if (hasShade) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        } else {
            getDialog().getWindow().setDimAmount(0f);
        }
    }

}
