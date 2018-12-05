package com.nasduck.dialoglib.Base;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.ImageToastConfigBean;
import com.nasduck.dialoglib.config.TextAndImageToastConfigBean;
import com.nasduck.dialoglib.config.TextToastConfigBean;

/**
 * 默认参数设置
 */
public class DuckDialog {

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
                .setHasShade(true);
//                .setImage(R.mipmap.ic_launcher);
        return configBean;
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
//                .setImage(R.mipmap.ic_launcher)
                .setContentText(contentText)
                .setContentTextSize(16)
                .setContentTextColor(R.color.colorDefaultContentText);
        return configBean;
    }
}
