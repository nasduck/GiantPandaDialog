package com.nasduck.dialoglib.builder;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

public class ToastHandler extends Handler {

    public static final int MSG_SHOW = 999;

    private WeakReference<ToastBuilder> mBuilderRef;

    public ToastHandler() {}

    public void set(ToastBuilder builder) {
        this.mBuilderRef = new WeakReference<>(builder);
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case MSG_SHOW:
                this.removeMessages(MSG_SHOW);
                ToastBuilder builder = mBuilderRef.get();
                if (builder != null) builder.hide();
                break;
        }
    }
}
