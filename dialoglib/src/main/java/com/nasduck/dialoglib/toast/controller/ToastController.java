package com.nasduck.dialoglib.toast.controller;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.toast.builder.ImageAndTextToastBuilder;
import com.nasduck.dialoglib.toast.builder.ImageToastBuilder;
import com.nasduck.dialoglib.toast.builder.TextToastBuilder;

public class ToastController {

    public static TextToastBuilder createTextToast(FragmentActivity activity) {
        return new TextToastBuilder(activity);
    }

    public static ImageToastBuilder createImageToast(FragmentActivity activity) {
        return new ImageToastBuilder(activity);
    }

    public static ImageAndTextToastBuilder createImageAndTextToast(FragmentActivity activity) {
        return new ImageAndTextToastBuilder(activity);
    }
}
