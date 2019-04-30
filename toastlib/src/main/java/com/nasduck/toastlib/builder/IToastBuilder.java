package com.nasduck.toastlib.builder;

import android.support.v4.app.FragmentActivity;

import com.nasduck.toastlib.config.ToastConfig;

public interface IToastBuilder {

    FragmentActivity getActivity();

    ToastConfig getConfig();

    void hide();

}
