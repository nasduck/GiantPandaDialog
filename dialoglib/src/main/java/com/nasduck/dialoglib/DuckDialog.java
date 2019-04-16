package com.nasduck.dialoglib;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.dialog.builder.DialogBuilder;
import com.nasduck.dialoglib.dialog.builder.DialogBodyBuilder;
import com.nasduck.dialoglib.dialog.builder.DialogHeaderBuilder;
import com.nasduck.dialoglib.dialog.view.DialogButton;
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

    public static void showDialog(FragmentActivity activity, String title, String content) {
        DialogButton btn = new DialogButton(activity);
        btn.setText("OK");

        DialogBuilder.getInstance(activity)
                .setHeader(DialogHeaderBuilder.getInstance().setTitle(title))
                .setBody(DialogBodyBuilder.getInstance().setContent(content))
                .addButton(btn)
                .show();
    }

    public static void showDialog(FragmentActivity activity, String content) {
        DialogButton btn = new DialogButton(activity);
        btn.setText("OK");

        DialogBuilder.getInstance(activity)
                .setBody(DialogBodyBuilder.getInstance().setContent(content))
                .addButton(btn)
                .show();
    }

    public static void showClickDialog(FragmentActivity activity, String title, String content) {
        DialogButton btnSetting = new DialogButton(activity);
        btnSetting.setText("Setting");
        DialogButton btnCancel = new DialogButton(activity);
        btnCancel.setText("Cancel");

        DialogBuilder.getInstance(activity)
                .setHeader(DialogHeaderBuilder.getInstance().setTitle(title))
                .setBody(DialogBodyBuilder.getInstance().setContent(content))
                .addButton(btnSetting)
                .addButton(btnCancel)
                .show();
    }
}
