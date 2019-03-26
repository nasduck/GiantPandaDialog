package com.nasduck.dialoglib.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.dialog.controller.DialogController;
import com.nasduck.dialoglib.base.enums.DialogButtonNumber;
import com.nasduck.dialoglib.base.enums.DialogType;
import com.nasduck.dialoglib.base.enums.GravityWay;
import com.nasduck.dialoglib.base.enums.TextStyle;
import com.nasduck.dialoglib.dialog.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnPositiveClickListener;
import com.nasduck.dialoglib.toast.controller.ToastController;

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
                .setImage(R.drawable.ic_success)
                .show();
    }

    public static void showWarningToast(FragmentActivity activity) {
        ToastController.createImageToast(activity)
                .setImage(R.drawable.ic_warning)
                .show();
    }

    public static void showFailureToast(FragmentActivity activity) {
        ToastController.createImageToast(activity)
                .setImage(R.drawable.ic_failure)
                .show();
    }

    public static void showSuccessTextToast(FragmentActivity activity, String text) {
        ToastController.createImageAndTextToast(activity)
                .setImage(R.drawable.ic_success)
                .setText(text)
                .show();
    }

    public static void showWarningTextToast(FragmentActivity activity, String text) {
        ToastController.createImageAndTextToast(activity)
                .setImage(R.drawable.ic_warning)
                .setText(text)
                .show();
    }

    public static void showFailureTextToast(FragmentActivity activity, String text) {
        ToastController.createImageAndTextToast(activity)
                .setImage(R.drawable.ic_failure)
                .setText(text)
                .show();
    }

    /** dialog ************************************************************************************/

    public static void showTitleTipDialog(FragmentActivity activity, String title, String content,
                                          String buttonText, OnNormalClickListener listener) {
        DialogController.createTextDialog(activity)
                .setTextStyle(TextStyle.BOLD)
                .setTitle(title)
                .setTitleSize(16)
                .setTitleColor(R.color.text_black_light)
                .setTitlePadding(0, 20, 0, 0)
                .setTitleGravity(GravityWay.CENTER_HORIZONTAL)
                .setContent(content)
                .setContentSize(14)
                .setContentColor(R.color.text_black_light)
                .setContentPadding(26, 20, 26, 20)
                .setButtonNumber(DialogButtonNumber.ONE)
                .setNormalButtonText(buttonText)
                .setNormalButtonTextColor(R.color.text_blue)
                .setNormalButtonTextSize(16)
                .setNormalClickListener(listener)
                .setTag(DialogType.TITLE_TIP_DIALOG.getDialogTag())
                .setCornerRadius(10)
                .show();
    }

    public static void showTitleSelectDialog(FragmentActivity activity, String title, String content,
                                             String positiveButtonText, String negativeButtonText,
                                             OnPositiveClickListener positiveClickListener,
                                             OnNegativeClickListener negativeClickListener) {
        DialogController.createTextDialog(activity)
                .setTextStyle(TextStyle.BOLD)
                .setTitle(title)
                .setTitleSize(16)
                .setTitleColor(R.color.text_black_light)
                .setTitlePadding(0, 20, 0, 0)
                .setTitleGravity(GravityWay.CENTER_HORIZONTAL)
                .setContent(content)
                .setContentSize(14)
                .setContentColor(R.color.text_black_light)
                .setContentPadding(26, 20, 26, 20)
                .setButtonNumber(DialogButtonNumber.TWO)
                .setPositiveButtonText(positiveButtonText)
                .setPositiveButtonTextSize(16)
                .setPositiveButtonTextColor(R.color.text_blue)
                .setPositiveClickListener(positiveClickListener)
                .setNegativeButtonText(negativeButtonText)
                .setNegativeButtonTextSize(16)
                .setNegativeButtonTextColor(R.color.text_gray)
                .setNegativeClickListener(negativeClickListener)
                .setTag(DialogType.TITLE_SELECT_DIALOG.getDialogTag())
                .setCornerRadius(10)
                .show();
    }

    public static void showNoTitleTipDialog(FragmentActivity activity, String content,
                                            String buttonText, OnNormalClickListener listener) {
        DialogController.createTextDialog(activity)
                .setContent(content)
                .setContentSize(14)
                .setContentColor(R.color.text_black_light)
                .setContentPadding(26, 20, 26, 20)
                .setButtonNumber(DialogButtonNumber.ONE)
                .setNormalButtonText(buttonText)
                .setNormalButtonTextColor(R.color.text_blue)
                .setNormalButtonTextSize(16)
                .setNormalClickListener(listener)
                .setTag(DialogType.NO_TITLE_TIP_DIALOG.getDialogTag())
                .setCornerRadius(10)
                .show();
    }

    public static void showNoTitleSelectDialog(FragmentActivity activity, String content,
                                               String positiveButtonText, String negativeButtonText,
                                               OnPositiveClickListener positiveClickListener,
                                               OnNegativeClickListener negativeClickListener) {
        DialogController.createTextDialog(activity)
                .setContent(content)
                .setContentSize(14)
                .setContentColor(R.color.text_black_light)
                .setContentPadding(26, 20, 26, 20)
                .setButtonNumber(DialogButtonNumber.TWO)
                .setPositiveButtonText(positiveButtonText)
                .setPositiveButtonTextSize(16)
                .setPositiveButtonTextColor(R.color.text_blue)
                .setPositiveClickListener(positiveClickListener)
                .setNegativeButtonText(negativeButtonText)
                .setNegativeButtonTextSize(16)
                .setNegativeButtonTextColor(R.color.text_gray)
                .setNegativeClickListener(negativeClickListener)
                .setTag(DialogType.NO_TITLE_SELECT_DIALOG.getDialogTag())
                .setCornerRadius(10)
                .show();
    }
}
