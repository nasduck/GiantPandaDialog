package com.nasduck.dialoglib.controller;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.base.IDialogView;
import com.nasduck.dialoglib.builder.dialog.OneButtonFooterBuilder;
import com.nasduck.dialoglib.builder.dialog.TextBodyBuilder;
import com.nasduck.dialoglib.builder.dialog.TextHeaderBuilder;
import com.nasduck.dialoglib.builder.dialog.ThreeButtonFooterBuilder;
import com.nasduck.dialoglib.builder.dialog.TwoButtonFooterBuilder;
import com.nasduck.dialoglib.dialog.BaseDialog;

/**
 * default config
 */
public class DuckDialog {

    /**
     * Fragment tag to control dialog disappear.
     * @param activity
     * @param tag
     */
    public static void hide(FragmentActivity activity, String tag) {
        FragmentManager manager = activity.getSupportFragmentManager();
        Fragment fragment = manager.findFragmentByTag(tag);
        if (fragment != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragment);
            transaction.commitAllowingStateLoss();
        }
    }

    public static void showToast(FragmentActivity activity, String contentText) {
        ToastController.createTextToast(activity)
                .setText(contentText)
                .show();
    }

    public static void showSuccessToast(FragmentActivity activity) {
        ToastController.createImageToast(activity)
                .setImage(R.drawable.ic_toast_success)
                .show();
    }

    public static void showWarningToast(FragmentActivity activity) {
        ToastController.createImageToast(activity)
                .setImage(R.drawable.ic_toast_warning)
                .show();
    }

    public static void showFailureToast(FragmentActivity activity) {
        ToastController.createImageToast(activity)
                .setImage(R.drawable.ic_toast_failure)
                .show();
    }

    public static void showSuccessTextToast(FragmentActivity activity, String text) {
        ToastController.createImageAndTextToast(activity)
                .setImage(R.drawable.ic_toast_success)
                .setText(text)
                .show();
    }

    public static void showWarningTextToast(FragmentActivity activity, String text) {
        ToastController.createImageAndTextToast(activity)
                .setImage(R.drawable.ic_toast_warning)
                .setText(text)
                .show();
    }

    public static void showFailureTextToast(FragmentActivity activity, String text) {
        ToastController.createImageAndTextToast(activity)
                .setImage(R.drawable.ic_toast_failure)
                .setText(text)
                .show();
    }

    public static void showTitleTipDialog(FragmentActivity activity) {
        BaseDialog.create()
                .setDialogView(new IDialogView() {
                    @Override
                    public View getViewHeader(Context context) {
                        return TextHeaderBuilder.create()
                                .getView(context);
                    }

                    @Override
                    public View getBodyLayout(Context context) {
                        return TextBodyBuilder.create()
                                .getView(context);
                    }

                    @Override
                    public View getFooterLayout(Context context) {
                        return ThreeButtonFooterBuilder.create()
                                .getView(context);
                    }
                })
                .show(activity.getSupportFragmentManager(), "");
    }
}
