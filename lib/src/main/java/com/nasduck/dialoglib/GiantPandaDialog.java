package com.nasduck.dialoglib;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.config.ButtonStyle;
import com.nasduck.dialoglib.dialog.builder.DialogBuilder;
import com.nasduck.dialoglib.dialog.builder.DialogBodyBuilder;
import com.nasduck.dialoglib.dialog.builder.DialogHeaderBuilder;
import com.nasduck.dialoglib.dialog.config.DialogBtnConfig;
import com.nasduck.dialoglib.dialog.view.DialogButton;

/**
 * default config
 */
public class GiantPandaDialog {


    public static void showDialog(FragmentActivity activity, String content) {
        DialogButton btn = new DialogButton(activity);
        btn.setText(R.string.positive_button_text);

        DialogBuilder.getInstance(activity)
                .setBody(DialogBodyBuilder.getInstance().setContent(content))
                .addButton(btn)
                .setCancelOnTouchBack(false)
                .setTouchOutsideCancelable(false)
                .show();
    }

    public static void showDialog(FragmentActivity activity, String title, String content) {
        DialogButton btn = new DialogButton(activity);
        btn.setText(R.string.positive_button_text);

        DialogBuilder.getInstance(activity)
                .setHeader(DialogHeaderBuilder.getInstance().setTitle(title))
                .setBody(DialogBodyBuilder.getInstance().setContent(content))
                .addButton(btn)
                .setCancelOnTouchBack(false)
                .setTouchOutsideCancelable(false)
                .show();
    }

    public static void showDialog(FragmentActivity activity, String title, String content, DialogButton...buttons) {
        DialogBuilder builder = DialogBuilder.create(activity);
        builder.setHeader(DialogHeaderBuilder.getInstance().setTitle(title));
        builder.setBody(DialogBodyBuilder.getInstance().setContent(content));
        if (buttons.length == 0) {
            DialogButton btn = new DialogButton(activity);
            btn.setText(R.string.positive_button_text);
            btn.setStyle(ButtonStyle.DEFAULT);
            builder.addButton(btn);
        } else {
            for (DialogButton button : buttons) {
                builder.addButton(button);
            }
        }
        builder.setCancelOnTouchBack(false)
                .setTouchOutsideCancelable(false)
                .show();
    }

    public static void showDialog(FragmentActivity activity, String content, DialogButton...buttons) {
        DialogBuilder builder = DialogBuilder.create(activity);
        builder.setBody(DialogBodyBuilder.getInstance().setContent(content));
        if (buttons.length == 0) {
            DialogButton btn = new DialogButton(activity);
            btn.setText(R.string.positive_button_text);
            btn.setStyle(ButtonStyle.DEFAULT);
            builder.addButton(btn);
        } else {
            for (DialogButton button : buttons) {
                builder.addButton(button);
            }
        }
        builder.setCancelOnTouchBack(false)
                .setTouchOutsideCancelable(false)
                .show();
    }
}