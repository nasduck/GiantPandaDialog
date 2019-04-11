package com.nasduck.dialoglib.toast.builder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nasduck.dialoglib.toast.handler.ToastHandler;
import com.nasduck.dialoglib.toast.Toast.impl.Toast;

public abstract class BaseToastBuilder implements IToastBuilder {

    protected static ToastHandler mHandler = new ToastHandler();
    protected final static String ToastTag = "toast_tag";

    @Override
    public void show() {
        mHandler.removeMessages(ToastHandler.MSG_HIDE);
        FragmentManager manager = getActivity().getSupportFragmentManager();
        Fragment frag = manager.findFragmentByTag(ToastTag);
        if (frag != null) {
            ((Toast) frag).updateUI(getConfig());
        } else {
            // Show Toast
            Toast.newInstance(getConfig())
                    .show(manager, ToastTag);
        }
    }

    public void show(long delay) {
        show();
        mHandler.sendEmptyMessageDelayed(ToastHandler.MSG_HIDE, delay);
    }

    @Override
    public void hide() {
        hide(getActivity(), ToastTag);
    }

    private void hide(FragmentActivity activity, String tag) {
        FragmentManager manager = activity.getSupportFragmentManager();
        Fragment frag = manager.findFragmentByTag(tag);
        if (frag != null) {
            FragmentTransaction t = manager.beginTransaction();
            t.remove(frag);
            t.commitAllowingStateLoss();
        }
    }
}
