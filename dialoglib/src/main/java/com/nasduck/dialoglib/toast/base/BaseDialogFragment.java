package com.nasduck.dialoglib.toast.base;

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

import com.nasduck.dialoglib.dialog.base.IDialogFragment;

public abstract class BaseDialogFragment extends DialogFragment implements IDialogFragment {

    protected Context mContext;
    protected View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // bind view
        mView = inflater.inflate(initView(savedInstanceState), container);

        // Removes the dialog box's default title bar
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);

        return mView;
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

    /**
     * set shade
     * @param dim
     */
    public void setDim(float dim) {
        getDialog().getWindow().setDimAmount(dim);
    }

}
