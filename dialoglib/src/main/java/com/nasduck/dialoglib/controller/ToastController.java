package com.nasduck.dialoglib.controller;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.builder.toast.ImageAndTextToastBuilder;
import com.nasduck.dialoglib.builder.toast.ImageToastBuilder;
import com.nasduck.dialoglib.builder.toast.TextToastBuilder;

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
