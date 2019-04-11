package com.nasduck.dialoglib.toast.builder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nasduck.dialoglib.toast.handler.ToastHandler;
import com.nasduck.dialoglib.toast.toast.impl.Toast;

public abstract class BaseToastBuilder implements IToastBuilder {

    private final static String TOAST_TAG = "toast_tag";

    protected static ToastHandler mHandler = new ToastHandler();

    public void show() {
        mHandler.removeMessages(ToastHandler.MSG_HIDE);
        FragmentManager manager = getActivity().getSupportFragmentManager();
        Fragment frag = manager.findFragmentByTag(TOAST_TAG);
        if (frag != null) {
            ((Toast) frag).updateUI(getConfig());
        } else {
            // Show Toast
            Toast.newInstance(getConfig())
                    .show(manager, TOAST_TAG);
        }
    }

    public static void dismiss() {
        mHandler.removeMessages(ToastHandler.MSG_HIDE);
        mHandler.sendEmptyMessage(ToastHandler.MSG_HIDE);
    }

    public static void dismiss(long delay) {
        mHandler.removeMessages(ToastHandler.MSG_HIDE);
        mHandler.sendEmptyMessageDelayed(ToastHandler.MSG_HIDE, delay);
    }

    public void hide() {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        Fragment frag = manager.findFragmentByTag(TOAST_TAG);
        if (frag != null) {
            FragmentTransaction t = manager.beginTransaction();
            t.remove(frag);
            t.commitAllowingStateLoss();
        }
    }

}
