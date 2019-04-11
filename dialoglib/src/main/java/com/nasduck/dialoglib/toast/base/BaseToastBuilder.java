package com.nasduck.dialoglib.toast.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.nasduck.dialoglib.base.enums.ToastType;
import com.nasduck.dialoglib.toast.classification.ImageAndTextToast;
import com.nasduck.dialoglib.toast.classification.ImageToast;
import com.nasduck.dialoglib.toast.classification.TextToast;
import com.nasduck.dialoglib.utils.FragmentUtils;

public abstract class BaseToastBuilder implements IToastBuilder {

    protected static ToastHandler mHandler = new ToastHandler();

    public void show(long delay) {
        show();
        mHandler.sendEmptyMessageDelayed(ToastHandler.MSG_HIDE, delay);
    }

    public void show() {
        mHandler.removeMessages(ToastHandler.MSG_HIDE);
        FragmentManager manager = getActivity().getSupportFragmentManager();
        Fragment frag = manager.findFragmentByTag(getType().getToastTag());
        switch (getType()) {
            case TEXT_TOAST:
                if (frag != null) { // Update Toast existing
                    ((TextToast) frag).updateUI(getConfig());
                } else {
                    // hide other toast
                    hideOtherFragment(getType(), manager);
                    // Show Toast
                    TextToast.newInstance(getConfig())
                            .show(getActivity().getSupportFragmentManager(), getType().getToastTag());
                }
                break;
            case IMAGE_TOAST:
                if (frag != null) {
                    // Update Toast existing
                    ((ImageToast) frag).updateUI(getConfig());
                } else {
                    // hide other toast
                    hideOtherFragment(getType(), manager);
                    // Show Toast
                    ImageToast.newInstance(getConfig()).show(getActivity().getSupportFragmentManager(), getType().getToastTag());
                }
                break;
            case TEXT_AND_IMAGE_TOAST:
                if (frag != null) {
                    // Update Toast existing
                    ((ImageAndTextToast) frag).updateUI(getConfig());
                } else {
                    // hide other toast
                    hideOtherFragment(getType(), manager);
                    // Show Toast
                    ImageAndTextToast.newInstance(getConfig()).show(getActivity().getSupportFragmentManager(), getType().getToastTag());
                }
                break;
        }
    }

    @Override
    public void hide() {
        FragmentUtils.hide(getActivity(), getType().getToastTag());
    }

    /**
     * Hide other toast
     *
     * @param type
     * @param manager
     */
    private void hideOtherFragment(ToastType type, FragmentManager manager) {
        for (ToastType toastType : ToastType.values()) {
            if (type.getType() != toastType.getType()) {
                if (manager.findFragmentByTag(toastType.getToastTag()) != null) {
                    FragmentUtils.hide(getActivity(), toastType.getToastTag());
                }
            }
        }
    }
}
