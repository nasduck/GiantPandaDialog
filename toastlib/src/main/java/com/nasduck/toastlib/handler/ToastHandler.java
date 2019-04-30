package com.nasduck.toastlib.handler;

import android.os.Handler;
import android.os.Message;

import com.nasduck.toastlib.builder.IToastBuilder;

import java.lang.ref.WeakReference;

public class ToastHandler extends Handler {

    public static final int MSG_HIDE = 999;

    private WeakReference<IToastBuilder> mBuilderRef;

    public ToastHandler() {}

    public void set(IToastBuilder builder) {
        this.mBuilderRef = new WeakReference<>(builder);
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case MSG_HIDE:
                this.removeMessages(MSG_HIDE);
                if (mBuilderRef.get() != null) mBuilderRef.get().hide();
                break;
        }
    }
}
