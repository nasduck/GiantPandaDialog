package com.zoopark.dialog;

import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.zoopark.dialog.config.ButtonStyle;
import com.zoopark.dialog.builder.DialogBuilder;
import com.zoopark.dialog.builder.DialogBodyBuilder;
import com.zoopark.dialog.builder.DialogHeaderBuilder;
import com.zoopark.dialog.utils.DensityUtils;
import com.zoopark.dialog.view.DialogBody;
import com.zoopark.dialog.view.DialogButton;
import com.zoopark.dialog.view.DialogHtmlBody;
import com.zoopark.dialog.view.DialogTextBody;

public class GiantPandaDialog {

    public static void showDialog(FragmentActivity activity, String htmlContent, int imageId, DialogButton...buttons) {
        DialogBuilder builder = DialogBuilder.create(activity);

        DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
                .setDialogBody(DialogHtmlBody.create(activity)
                        .setHtmlContent(htmlContent)
                        .setTopImage(imageId)
                        .setTextPadding(26, 16, 26, 16)
                        .setTextBackgroundColor(R.color.white));
        builder.setBody(bodyBuilder);

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
                .setBodyBackgroundColor(R.color.white_alpha_0)
                .show();
    }


    public static void showDialog(FragmentActivity activity, String content) {
        DialogButton btn = new DialogButton(activity);
        btn.setText(R.string.positive_button_text);

        DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
                .setDialogBody(DialogTextBody.create(activity)
                        .setContent(content));

        DialogBuilder.getInstance(activity)
                .setBody(bodyBuilder)
                .addButton(btn)
                .setCancelOnTouchBack(false)
                .setTouchOutsideCancelable(false)
                .show();
    }

    public static void showDialog(FragmentActivity activity, String title, String content) {
        DialogButton btn = new DialogButton(activity);
        btn.setText(R.string.positive_button_text);

        DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
                .setDialogBody(DialogTextBody.create(activity).setContent(content));

        DialogBuilder.getInstance(activity)
                .setHeader(DialogHeaderBuilder.getInstance().setTitle(title))
                .setBody(bodyBuilder)
                .addButton(btn)
                .setCancelOnTouchBack(false)
                .setTouchOutsideCancelable(false)
                .show();
    }

    public static void showDialog(FragmentActivity activity, String title, String content, DialogButton...buttons) {
        DialogBuilder builder = DialogBuilder.create(activity);
        builder.setHeader(DialogHeaderBuilder.getInstance().setTitle(title));

        DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
                .setDialogBody(DialogTextBody.create(activity).setContent(content));
        builder.setBody(bodyBuilder);

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

        DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
                .setDialogBody(DialogTextBody.create(activity).setContent(content));
        builder.setBody(bodyBuilder);

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
