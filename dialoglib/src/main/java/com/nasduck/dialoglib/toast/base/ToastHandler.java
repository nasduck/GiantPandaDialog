package com.nasduck.dialoglib.toast.base;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

public class ToastHandler extends Handler {

    public static final int MSG_SHOW = 999;

    private WeakReference<IToastBuilder> mBuilderRef;

    public ToastHandler() {}

    public void set(IToastBuilder builder) {
        this.mBuilderRef = new WeakReference<>(builder);
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case MSG_SHOW:
                this.removeMessages(MSG_SHOW);
                if (mBuilderRef.get() != null) mBuilderRef.get().hide();
                break;
        }
    }
}
