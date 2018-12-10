package com.nasduck.dialoglib.Base;

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
 * 默认参数设置
 */
public class DuckDialog {

    public static final int SUCCESS = 0;
    public static final int WARNING = 1;
    public static final int FAILURE = 2;

    /**
     * 控制 dialog 消失，根据fragment的tag
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
     * 设置 TextToast 参数
     * @param contentText
     * @return
     */
    public static ToastTextConfigBean assignTextToast(String contentText) {
        ToastTextConfigBean configBean = new ToastTextConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.colorDefaultContentText);
        return configBean;
    }

    /**
     * 设置 ImageToast 参数
     * @return
     * todo 不同的样式选择：提示、警告……
     */
    public static ToastImageConfigBean assignImageToast() {
        ToastImageConfigBean configBean = new ToastImageConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setImage(R.drawable.ic_launcher);
        return configBean;
    }

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
     * 设置 TextAndImageToast 参数
     * @param contentText
     * @return
     * todo 不同的样式选择：提示、警告……
     */
    public static ToastTextAndImageConfigBean assignTextAndImageToast(String contentText) {
        ToastTextAndImageConfigBean configBean = new ToastTextAndImageConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setImage(R.drawable.ic_launcher)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.colorDefaultContentText);
        return configBean;
    }

    /**
     * 设置 NoTitleTipDialog 参数
     * @param contentText
     * @return
     */
    public static DialogTipNoTitleConfigBean assignNoTitleTipDialog(String contentText
            , NoTitleTipDialog.onSureClickListener listener) {
        DialogTipNoTitleConfigBean configBean = new DialogTipNoTitleConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.colorDefaultContentText)
                .setButtonText("确定")
                .setButtonTextSize(18)
                .setButtonTextColor(R.color.colorDefaultContentText)
                .setListener(listener);
        return configBean;
    }

    /**
     * 设置 TitleTipDialog 参数
     * @param contentText
     * @return
     */
    public static DialogTipTitleConfigBean assignTitleTipDialog(String titleText
            , String contentText, TitleTipDialog.onSureClickListener listener) {
        DialogTipTitleConfigBean configBean = new DialogTipTitleConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.colorDefaultContentText)
                .setButtonText("确定")
                .setButtonTextSize(18)
                .setButtonTextColor(R.color.colorDefaultContentText)
                .setTitleText(titleText)
                .setTitleTextSize(18)
                .setTitleTextColor(R.color.colorDefaultContentText)
                .setListener(listener);
        return configBean;
    }

    /**
     * 设置 NoTitleSelectDialog 参数
     * @param contentText
     * @return
     */
    public static DialogSelectNoTitleConfigBean assignNoTitleSelectDialog(String contentText
            , NoTitleSelectDialog.onSelectClickListener listener) {
        DialogSelectNoTitleConfigBean configBean = new DialogSelectNoTitleConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.colorDefaultContentText)
                .setPositiveButtonText("确定")
                .setPositiveButtonTextSize(18)
                .setPositiveButtonTextColor(R.color.colorDefaultContentText)
                .setNegativeButtonText("取消")
                .setNegativeButtonTextSize(18)
                .setNegativeButtonTextColor(R.color.colorDefaultContentText)
                .setListener(listener);
        return configBean;
    }

    /**
     * 设置 TitleSelectDialog 参数
     * @param contentText
     * @return
     */
    public static DialogSelectTitleConfigBean assignTitleSelectDialog(String titletext
            , String contentText, TitleSelectDialog.onSelectClickListener listener) {
        DialogSelectTitleConfigBean configBean = new DialogSelectTitleConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setTitleText(titletext)
                .setTitleTextSize(18)
                .setTitleTextColor(R.color.colorDefaultContentText)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.colorDefaultContentText)
                .setPositiveButtonText("确定")
                .setPositiveButtonTextSize(18)
                .setPositiveButtonTextColor(R.color.colorDefaultContentText)
                .setNegativeButtonText("取消")
                .setNegativeButtonTextSize(18)
                .setNegativeButtonTextColor(R.color.colorDefaultContentText)
                .setListener(listener);
        return configBean;
    }
}
