package com.nasduck.dialoglib.controller;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.builder.dialog.DialogBuilder;
import com.nasduck.dialoglib.builder.dialog.footer.OneButtonFooterBuilder;
import com.nasduck.dialoglib.builder.dialog.body.TextBodyBuilder;
import com.nasduck.dialoglib.builder.dialog.header.TextHeaderBuilder;
import com.nasduck.dialoglib.enums.DialogButtonNumber;
import com.nasduck.dialoglib.enums.DialogType;
import com.nasduck.dialoglib.enums.GravityWay;
import com.nasduck.dialoglib.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.interfaces.OnPositiveClickListener;

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

    /** toast *************************************************************************************/

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

    /** dialog ************************************************************************************/

    public static void showTitleTipDialog(FragmentActivity activity, String title, String content,
                                          String buttonText, OnNormalClickListener listener) {
        DialogController.createTextDialog(activity)
                .setTitle(title)
                .setContent(content)
                .setButtonNumber(DialogButtonNumber.ONE)
                .setNormalButtonText(buttonText)
                .setNormalClickListener(listener)
                .setTag(DialogType.TITLE_TIP_DIALOG.getDialogTag())
                .show();
    }

    public static void showTitleSelectDialog(FragmentActivity activity, String title, String content,
                                             String positiveButtonText, String negativeButtonText,
                                             OnPositiveClickListener positiveClickListener,
                                             OnNegativeClickListener negativeClickListener) {
        DialogController.createTextDialog(activity)
                .setTitle(title)
                .setContent(content)
                .setButtonNumber(DialogButtonNumber.TWO)
                .setPositiveButtonText(positiveButtonText)
                .setPositiveClickListener(positiveClickListener)
                .setNegativeButtonText(negativeButtonText)
                .setNegativeClickListener(negativeClickListener)
                .setTag(DialogType.TITLE_SELECT_DIALOG.getDialogTag())
                .show();
    }

    public static void showNoTitleTipDialog(FragmentActivity activity, String content,
                                            String buttonText, OnNormalClickListener listener) {
        DialogController.createTextDialog(activity)
                .setContent(content)
                .setButtonNumber(DialogButtonNumber.ONE)
                .setNormalButtonText(buttonText)
                .setNormalClickListener(listener)
                .setTag(DialogType.NO_TITLE_TIP_DIALOG.getDialogTag())
                .show();
    }

    public static void showNoTitleSelectDialog(FragmentActivity activity, String content,
                                               String positiveButtonText, String negativeButtonText,
                                               OnPositiveClickListener positiveClickListener,
                                               OnNegativeClickListener negativeClickListener) {
        DialogController.createTextDialog(activity)
                .setContent(content)
                .setButtonNumber(DialogButtonNumber.TWO)
                .setPositiveButtonText(positiveButtonText)
                .setPositiveClickListener(positiveClickListener)
                .setNegativeButtonText(negativeButtonText)
                .setNegativeClickListener(negativeClickListener)
                .setTag(DialogType.NO_TITLE_SELECT_DIALOG.getDialogTag())
                .show();
    }
}
