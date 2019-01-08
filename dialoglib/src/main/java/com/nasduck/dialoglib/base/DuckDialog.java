package com.nasduck.dialoglib.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogSelectNoTitleConfigBean;
import com.nasduck.dialoglib.config.DialogSelectTitleConfigBean;
import com.nasduck.dialoglib.config.ToastImageConfigBean;
import com.nasduck.dialoglib.config.DialogTipNoTitleConfigBean;
import com.nasduck.dialoglib.config.ToastTextAndImageConfigBean;
import com.nasduck.dialoglib.config.ToastTextConfigBean;
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

    public static final int SUCCESS = 0;
    public static final int WARNING = 1;
    public static final int FAILURE = 2;

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

    /**
     * TextToast config
     * @param contentText
     * @return
     */
    public static ToastTextConfigBean assignTextToast(String contentText) {
        ToastTextConfigBean configBean = new ToastTextConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.text_black);
        return configBean;
    }

    public static ToastTextConfigBean assignTextToast(DuckDialogType toastType, String contentText) {
        ToastTextConfigBean configBean = new ToastTextConfigBean();
        DuckDialogType type = DuckDialogType.getType(toastType.getDialogType());
        switch (type) {
            case TOAST_BLACK:
                configBean.setBackground(R.drawable.bg_toast_black)
                        .setContentText(contentText)
                        .setContentTextSize(14)
                        .setContentTextColor(R.color.text_white);
                break;
        }
        return configBean;
    }

    /**
     * ImageToast config
     * @return
     */
    public static ToastImageConfigBean assignImageToast() {
        ToastImageConfigBean configBean = new ToastImageConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setImage(R.drawable.ic_launcher);
        return configBean;
    }

    /**
     * special image toast(SUCCESS\WARNING\FAILURE)
     * @param type
     * @return
     * todo more types
     */
    public static ToastImageConfigBean assignImageToast(int type) {
        ToastType toastType = ToastType.getType(type);
        ToastImageConfigBean configBean = new ToastImageConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true);
        switch (toastType) {
            case SUCCESS:
                configBean.setImage(R.drawable.ic_toast_success);
                return configBean;
            case WARNING:
                configBean.setImage(R.drawable.ic_toast_warning);
                return configBean;
            case FAILURE:
                configBean.setImage(R.drawable.ic_toast_failure);
                return configBean;
            default:
                configBean.setImage(R.drawable.ic_launcher);
                return configBean;
        }
    }

    /**
     * TextAndImageToast config
     * @param contentText
     * @return
     * todo special toast
     */
    public static ToastTextAndImageConfigBean assignTextAndImageToast(String contentText) {
        ToastTextAndImageConfigBean configBean = new ToastTextAndImageConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setImage(R.drawable.ic_launcher)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.text_black);
        return configBean;
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
