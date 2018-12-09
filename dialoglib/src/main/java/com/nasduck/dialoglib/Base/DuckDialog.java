package com.nasduck.dialoglib.Base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.ImageToastConfigBean;
import com.nasduck.dialoglib.config.TextAndImageToastConfigBean;
import com.nasduck.dialoglib.config.TextToastConfigBean;
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
    public static TextToastConfigBean assignTextToast(String contentText) {
        TextToastConfigBean configBean = new TextToastConfigBean();
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
    public static ImageToastConfigBean assignImageToast() {
        ImageToastConfigBean configBean = new ImageToastConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setImage(R.drawable.ic_launcher);
        return configBean;
    }

    public static ImageToastConfigBean assignImageToast(int type) {
        ToastType toastType = ToastType.getType(type);
        ImageToastConfigBean configBean = new ImageToastConfigBean();
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
     * @return
     * todo 不同的样式选择：提示、警告……
     */
    public static TextAndImageToastConfigBean assignTextAndImageToast(String contentText) {
        TextAndImageToastConfigBean configBean = new TextAndImageToastConfigBean();
        configBean.setBackground(R.drawable.bg_default)
                .setCancelable(false)
                .setHasShade(true)
                .setImage(R.drawable.ic_launcher)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.colorDefaultContentText);
        return configBean;
    }
}
