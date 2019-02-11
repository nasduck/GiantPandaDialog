package com.nasduck.dialoglib.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.builder.ToastBuilder;
import com.nasduck.dialoglib.config.DialogSelectNoTitleConfigBean;
import com.nasduck.dialoglib.config.DialogSelectTitleConfigBean;
import com.nasduck.dialoglib.config.DialogTipNoTitleConfigBean;
import com.nasduck.dialoglib.config.ToastTextAndImageConfig;
import com.nasduck.dialoglib.config.DialogTipTitleConfigBean;
import com.nasduck.dialoglib.dialog.NoTitleSelectDialog;
import com.nasduck.dialoglib.dialog.NoTitleTipDialog;
import com.nasduck.dialoglib.dialog.TitleSelectDialog;
import com.nasduck.dialoglib.dialog.TitleTipDialog;
import com.nasduck.dialoglib.interfaces.ToastType;

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

    public static void showToast(final FragmentActivity activity, String contentText) {
        ToastBuilder.create(activity)
                .setText(contentText)
                .show();
    }

    public static void showSuccessToast(FragmentActivity activity) {
        ToastBuilder.create(activity, ToastType.IMAGE_TOAST)
                .setImageId(R.drawable.ic_toast_success)
                .show();
    }

    public static void showWarningToast(FragmentActivity activity) {
        ToastBuilder.create(activity, ToastType.IMAGE_TOAST)
                .setImageId(R.drawable.ic_toast_warning)
                .show();
    }

    public static void showFailureToast(FragmentActivity activity) {
        ToastBuilder.create(activity, ToastType.IMAGE_TOAST)
                .setImageId(R.drawable.ic_toast_failure)
                .show();
    }

    public static void showSuccessTextToast(FragmentActivity activity) {
        ToastBuilder.create(activity, ToastType.TEXT_AND_IMAGE_TOAST)
                .setImageId(R.drawable.ic_toast_success)
                .setText("Success")
                .show();
    }

    public static void showWarningTextToast(FragmentActivity activity) {
        ToastBuilder.create(activity, ToastType.TEXT_AND_IMAGE_TOAST)
                .setImageId(R.drawable.ic_toast_warning)
                .setText("Warning")
                .show();
    }

    public static void showFailureTextToast(FragmentActivity activity) {
        ToastBuilder.create(activity, ToastType.TEXT_AND_IMAGE_TOAST)
                .setImageId(R.drawable.ic_toast_failure)
                .setText("Failure")
                .show();
    }

    /**
     * NoTitleTipDialog config
     * @param contentText
     * @return
     */
    public static DialogTipNoTitleConfigBean assignNoTitleTipDialog(String contentText
            , NoTitleTipDialog.onSureClickListener listener) {
        DialogTipNoTitleConfigBean configBean = new DialogTipNoTitleConfigBean();
        configBean.setBackground(R.drawable.bg_dialog_white)
                .setCancelable(false)
                .setHasShade(true)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.text_black_light)
                .setButtonText("确定")
                .setButtonTextSize(18)
                .setButtonTextColor(R.color.text_blue)
                .setListener(listener);
        return configBean;
    }

    /**
     * TitleTipDialog config
     * @param contentText
     * @return
     */
    public static DialogTipTitleConfigBean assignTitleTipDialog(String titleText
            , String contentText, TitleTipDialog.onSureClickListener listener) {
        DialogTipTitleConfigBean configBean = new DialogTipTitleConfigBean();
        configBean.setBackground(R.drawable.bg_dialog_white)
                .setCancelable(false)
                .setHasShade(true)
                .setTitleText(titleText)
                .setTitleTextSize(18)
                .setTitleTextColor(R.color.text_black)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.text_black_light)
                .setButtonText("确定")
                .setButtonTextSize(18)
                .setButtonTextColor(R.color.text_blue)
                .setListener(listener);
        return configBean;
    }

    /**
     * NoTitleSelectDialog config
     * @param contentText
     * @return
     */
    public static DialogSelectNoTitleConfigBean assignNoTitleSelectDialog(String contentText
            , NoTitleSelectDialog.onSelectClickListener listener) {
        DialogSelectNoTitleConfigBean configBean = new DialogSelectNoTitleConfigBean();
        configBean.setBackground(R.drawable.bg_dialog_white)
                .setCancelable(false)
                .setHasShade(true)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.text_black_light)
                .setPositiveButtonText("确定")
                .setPositiveButtonTextSize(18)
                .setPositiveButtonTextColor(R.color.text_blue)
                .setNegativeButtonText("取消")
                .setNegativeButtonTextSize(18)
                .setNegativeButtonTextColor(R.color.text_black)
                .setListener(listener);
        return configBean;
    }

    /**
     * TitleSelectDialog config
     * @param contentText
     * @return
     */
    public static DialogSelectTitleConfigBean assignTitleSelectDialog(String titleText
            , String contentText, TitleSelectDialog.onSelectClickListener listener) {
        DialogSelectTitleConfigBean configBean = new DialogSelectTitleConfigBean();
        configBean.setBackground(R.drawable.bg_dialog_white)
                .setCancelable(false)
                .setHasShade(true)
                .setTitleText(titleText)
                .setTitleTextSize(18)
                .setTitleTextColor(R.color.text_black)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.text_black_light)
                .setPositiveButtonText("确定")
                .setPositiveButtonTextSize(18)
                .setPositiveButtonTextColor(R.color.text_blue)
                .setNegativeButtonText("取消")
                .setNegativeButtonTextSize(18)
                .setNegativeButtonTextColor(R.color.text_black)
                .setListener(listener);
        return configBean;
    }
}