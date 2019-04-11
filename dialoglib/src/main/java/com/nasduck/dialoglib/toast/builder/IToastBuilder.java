package com.nasduck.dialoglib.toast.builder;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.toast.config.ToastConfig;

public interface IToastBuilder {

    FragmentActivity getActivity();

    ToastConfig getConfig();

    void hide();

}
