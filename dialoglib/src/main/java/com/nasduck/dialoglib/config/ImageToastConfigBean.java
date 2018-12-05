package com.nasduck.dialoglib.config;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.toast.ImageToast;

public class ImageToastConfigBean extends BaseConfigBean {

    private int image;

    /**  set方法  *******************************************************************************/

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

    /**  创建实例  *******************************************************************************/

    public void show(FragmentActivity activity, String tag) {
        ImageToast.newImageToast(this).show(activity.getSupportFragmentManager(), tag);
    }

    /**  get方法  ********************************************************************************/

    public int getImage() {
        return image;
    }
}
