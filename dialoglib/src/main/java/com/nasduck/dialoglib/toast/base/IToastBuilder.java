package com.nasduck.dialoglib.toast.base;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.toast.config.ToastConfig;
import com.nasduck.dialoglib.base.enums.ToastType;

public interface IToastBuilder {

    FragmentActivity getActivity();

    ToastConfig build();

    void hide();

    /**
     * get toast type
     * @return
     */
    ToastType getType();
}
