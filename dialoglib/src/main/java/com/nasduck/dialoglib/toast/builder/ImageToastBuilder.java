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
    private Integer animation;

    public ImageToastBuilder(FragmentActivity activity) {
        mHandler.set(this);

        mActivity = activity;
        
        image = 0;
        bgColor = R.color.black_alpha_50;
        cornerRadius = 4;
        paddingHorizontal = 15;
        paddingVertical = 12;
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

    public ImageToastBuilder setAnimation(Integer animation) {
        this.animation = animation;
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

    public Integer getAnimation() {
        return animation;
    }
}
