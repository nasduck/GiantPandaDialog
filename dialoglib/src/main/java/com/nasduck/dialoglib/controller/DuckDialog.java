package com.nasduck.dialoglib.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.builder.dialog.footer.OneButtonFooterBuilder;
import com.nasduck.dialoglib.builder.dialog.body.TextBodyBuilder;
import com.nasduck.dialoglib.builder.dialog.header.TextHeaderBuilder;
import com.nasduck.dialoglib.enums.DialogType;
import com.nasduck.dialoglib.enums.GravityWay;
import com.nasduck.dialoglib.interfaces.OnNormalClickListener;

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

    public static void showTitleTipDialog(FragmentActivity activity, String title, String content, OnNormalClickListener listener) {
        TextHeaderBuilder headerBuilder = new TextHeaderBuilder();
        headerBuilder.setTitle(title)
                .setTitleSize(16)
                .setTitleColor(R.color.text_black)
                .setGravityWay(GravityWay.CENTER_HORIZONTAL)
                .setPaddingTop(30)
                .setPaddingBottom(20);

        TextBodyBuilder bodyBuilder = new TextBodyBuilder();
        bodyBuilder.setContentText(content)
                .setContentTextSize(14)
                .setContentTextColor(R.color.text_black_light)
                .setGravityWay(GravityWay.CENTER_HORIZONTAL)
                .setPaddingLeft(43)
                .setPaddingRight(43)
                .setPaddingBottom(30);

        OneButtonFooterBuilder footerBuilder = new OneButtonFooterBuilder();
        footerBuilder.setNormalButtonText("我知道了")
                .setNormalButtonTextSize(16)
                .setNormalButtonTextColor(R.color.text_blue)
                .setNormalClickListener(listener);

        DialogController.create(activity)
                .setHeader(headerBuilder)
                .setBody(bodyBuilder)
                .setFooter(footerBuilder)
                .setDialogTag(DialogType.TITLE_TIP_DIALOG.getDialogTag())
                .setCornerRadius(20)
                .show();
    }
}
