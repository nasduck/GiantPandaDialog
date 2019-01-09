package com.nasduck.dialoglib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nasduck.dialoglib.R;

public abstract class BaseToast extends BaseDialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setStyle(DialogFragment.STYLE_NO_INPUT, R.style.fragment_dialog_toast_style);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void hide() {
        this.dismiss();
    }
}
