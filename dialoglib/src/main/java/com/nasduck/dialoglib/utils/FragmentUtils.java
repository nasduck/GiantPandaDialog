package com.nasduck.dialoglib.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentUtils {

    public static void hide(FragmentActivity activity, String tag) {
        FragmentManager manager = activity.getSupportFragmentManager();
        Fragment frag = manager.findFragmentByTag(tag);
        if (frag != null) {
            FragmentTransaction t = manager.beginTransaction();
            t.remove(frag);
            t.commitAllowingStateLoss();
        }
    }

}
