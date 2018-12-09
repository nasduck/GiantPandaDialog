package com.nasduck.dialoglib.config;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.nasduck.dialoglib.Base.DuckDialog;
import com.nasduck.dialoglib.toast.ImageToast;

public class ImageToastConfigBean extends BaseConfigBean {

    private int image;

    /**
     * set方法
     *******************************************************************************/

    public ImageToastConfigBean setBackground(int background) {
        this.background = background;
        return this;
    }

    public ImageToastConfigBean setCancelable(boolean cancelable) {
        isCancelable = cancelable;
        return this;
    }

    public ImageToastConfigBean setHasShade(boolean hasShade) {
        this.hasShade = hasShade;
        return this;
    }

    public ImageToastConfigBean setImage(int image) {
        this.image = image;
        return this;
    }

    /** 创建实例 *********************************************************************************/

    public void show(FragmentActivity activity, String tag) {
        ImageToast.newImageToast(this).show(activity.getSupportFragmentManager(), tag);
    }

    public void show(final FragmentActivity activity) {
        ImageToast.newImageToast(this).show(activity.getSupportFragmentManager(), "default");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DuckDialog.hide(activity, "default");
            }
        }, 1000);

    }

    /** get方法 **********************************************************************************/

    public int getImage() {
        return image;
    }
}
