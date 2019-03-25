package com.nasduck.dialoglib.controller;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.classification.TextDialog;

public class DialogController {

    public static TextDialog createTextDialog(FragmentActivity activity) {
        return new TextDialog(activity);
    }

}
