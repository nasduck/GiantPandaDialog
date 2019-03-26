package com.nasduck.dialoglib.toast.builder;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.toast.base.BaseToastBuilder;
import com.nasduck.dialoglib.toast.config.ToastConfig;
import com.nasduck.dialoglib.base.enums.ToastType;

public class ImageToastBuilder extends BaseToastBuilder {

    private FragmentActivity mActivity;

    private Integer image;
    private Integer bgColor;
    private Integer cornerRadius;
    private Integer paddingHorizontal;
    private Integer paddingVertical;

    public ImageToastBuilder(FragmentActivity activity) {
        mHandler.set(this);
        delay = 1500;
        mActivity = activity;
        
        image = 0;
        bgColor = R.color.black_alpha_60;
        cornerRadius = 3;
        paddingHorizontal = 32;
        paddingVertical = 20;
    }

    @Override
    public FragmentActivity getActivity() {
        return mActivity;
    }

    @Override
    public ToastConfig build() {
        return new ToastConfig(ImageToastBuilder.this);
    }

    @Override
    public ToastType getType() {
        return ToastType.IMAGE_TOAST;
    }

    /**********************************************************************************************/

    public ImageToastBuilder setImage(Integer image) {
        this.image = image;
        return this;
    }

    public ImageToastBuilder setBgColor(Integer bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public ImageToastBuilder setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public ImageToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public ImageToastBuilder setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    /**********************************************************************************************/

    public Integer getImage() {
        return image;
    }

    public Integer getBgColor() {
        return bgColor;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public Integer getPaddingHorizontal() {
        return paddingHorizontal;
    }

    public Integer getPaddingVertical() {
        return paddingVertical;
    }
}
