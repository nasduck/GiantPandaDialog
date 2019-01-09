package com.nasduck.dialoglib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

import com.nasduck.dialoglib.R;

public abstract class BaseToast extends BaseDialogFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setStyle(DialogFragment.STYLE_NO_INPUT, R.style.fragment_dialog_toast_style);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void hide() {
        this.dismiss();
    }
}
