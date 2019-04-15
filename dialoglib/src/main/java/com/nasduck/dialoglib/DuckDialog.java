package com.nasduck.dialoglib;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.builder.DialogBuilder;
import com.nasduck.dialoglib.dialog.builder.body.DialogBodyBuilder;
import com.nasduck.dialoglib.dialog.builder.header.DialogHeaderBuilder;
import com.nasduck.dialoglib.dialog.classification.TextDialog;
import com.nasduck.dialoglib.base.enums.DialogButtonNumber;
import com.nasduck.dialoglib.base.enums.DialogType;
import com.nasduck.dialoglib.base.enums.GravityWay;
import com.nasduck.dialoglib.base.enums.TextStyle;
import com.nasduck.dialoglib.dialog.composition.footer.DialogButton;
import com.nasduck.dialoglib.dialog.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnPositiveClickListener;
import com.nasduck.dialoglib.toast.builder.impl.ToastBuilder;

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
        // todo
        //FragmentUtils.hide(activity, tag);
    }

    /** toast *************************************************************************************/

    public static void show(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setText(text)
                .show();
    }

    public static void showSuccess(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_success)
                .show();
    }

    public static void showSuccess(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_success)
                .setText(text)
                .show();
    }

    public static void showWarning(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_warning)
                .show();
    }

    public static void showWarning(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_warning)
                .setText(text)
                .show();
    }

    public static void showFailure(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_failure)
                .show();
    }

    public static void showFailure(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_failure)
                .setText(text)
                .show();
    }

    public static void showLoading(FragmentActivity activity) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_loading)
                .setAnimation(R.anim.anim_loading_rotate)
                .show();
    }

    public static void showLoading(FragmentActivity activity, String text) {
        ToastBuilder.getInstance(activity)
                .setImage(R.drawable.ic_loading)
                .setAnimation(R.anim.anim_loading_rotate)
                .setText(text)
                .show();
    }

    /** dialog ************************************************************************************/

    public static void show(FragmentActivity activity, String title, String content) {

        DialogButton btn = new DialogButton(activity);
        btn.setText("Test");

        DialogBuilder.getInstance(activity)
                .setHeader(DialogHeaderBuilder.getInstance().setTitle(title))
                .setBody(DialogBodyBuilder.getInstance().setContent(content))
                .addButton(btn)
                .show();
    }

    public static void showTitleTipDialog(FragmentActivity activity, String title, String content,
                                          String buttonText, OnNormalClickListener listener) {
        new TextDialog(activity)
                .setTitleTextStyle(TextStyle.BOLD)
                .setTitle(title)
                .setTitleSize(16)
                .setTitleColor(R.color.text_black_light)
                .setTitlePadding(0, 20, 0, 0)
                .setTitleGravity(GravityWay.CENTER_HORIZONTAL)
                .setContent(content)
                .setContentSize(14)
                .setContentColor(R.color.text_black_light)
                .setContentPadding(26, 20, 26, 20)
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
        new TextDialog(activity)
                .setTitleTextStyle(TextStyle.BOLD)
                .setTitle(title)
                .setTitleSize(16)
                .setTitleColor(R.color.text_black_light)
                .setTitlePadding(0, 20, 0, 0)
                .setTitleGravity(GravityWay.CENTER_HORIZONTAL)
                .setContent(content)
                .setContentSize(14)
                .setContentColor(R.color.text_black_light)
                .setContentPadding(26, 20, 26, 20)
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
        new TextDialog(activity)
                .setContent(content)
                .setContentSize(14)
                .setContentColor(R.color.text_black_light)
                .setContentPadding(26, 20, 26, 20)
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
        new TextDialog(activity)
                .setContent(content)
                .setContentSize(14)
                .setContentColor(R.color.text_black_light)
                .setContentPadding(26, 20, 26, 20)
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
