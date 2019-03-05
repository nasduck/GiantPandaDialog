package com.nasduck.dialoglib.base;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.config.ToastConfig;
import com.nasduck.dialoglib.interfaces.ToastType;

public interface IToastBuilder {

    FragmentActivity getActivity();

    ToastConfig build();

    void hide();

    ToastType getType();
}
