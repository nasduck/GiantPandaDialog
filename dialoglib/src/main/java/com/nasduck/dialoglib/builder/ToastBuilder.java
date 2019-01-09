package com.nasduck.dialoglib.builder;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.config.ToastConfig;
import com.nasduck.dialoglib.toast.TextToast;

public class ToastBuilder {

    private ToastConfig mConfig;

    private ToastBuilder(ToastConfig config) {
        this.mConfig = config;
    }

    public static ToastBuilder create() { return create(ToastConfig.getConfig()); }

    public static ToastBuilder create(ToastConfig config) {
        return new ToastBuilder(config);
    }

    public void show(final FragmentActivity activity) {
        show(activity, 1000);
    }

    public void show(final FragmentActivity activity, int delayMillis) {
        TextToast.create(mConfig).show(activity.getSupportFragmentManager(), "toast");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DuckDialog.hide(activity, "toast");
            }
        }, delayMillis);
    }

    //* Getter & Setter **************************************************************************//

    public String getText() {
        return mConfig.getText();
    }

    public ToastBuilder setText(String text) {
        mConfig.setText(text);
        return this;
    }

    public ToastConfig getConfig() {
        return mConfig;
    }

    public ToastBuilder setConfig(ToastConfig config) {
        this.mConfig = config;
        return this;
    }
}
