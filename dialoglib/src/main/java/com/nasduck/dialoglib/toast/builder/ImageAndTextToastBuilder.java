package com.nasduck.dialoglib.toast.builder;

import android.support.v4.app.FragmentActivity;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.toast.base.BaseToastBuilder;
import com.nasduck.dialoglib.toast.config.ToastConfig;
import com.nasduck.dialoglib.base.enums.ToastType;

public class ImageAndTextToastBuilder extends BaseToastBuilder {

    private FragmentActivity mActivity;

    private Integer image;
    private String text;
    private Integer textColor;
    private Integer textSize;
    private Integer bgColor ;
    private Integer cornerRadius;
    private Integer paddingHorizontal;
    private Integer paddingVertical;

    public ImageAndTextToastBuilder(FragmentActivity activity) {
        mHandler.set(this);
        delay = 2000;
        mActivity = activity;

        image = 0;
        text = "";
        textColor = R.color.text_white;
        textSize = 14;
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
        return new ToastConfig(ImageAndTextToastBuilder.this);
    }

    @Override
    public ToastType getType() {
        return ToastType.TEXT_AND_IMAGE_TOAST;
    }

    /**********************************************************************************************/

    public ImageAndTextToastBuilder setImage(Integer image) {
        this.image = image;
        return this;
    }

    public ImageAndTextToastBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public ImageAndTextToastBuilder setTextColor(Integer textColor) {
        this.textColor = textColor;
        return this;
    }

    public ImageAndTextToastBuilder setTextSize(Integer textSize) {
        this.textSize = textSize;
        return this;
    }

    public ImageAndTextToastBuilder setBgColor(Integer bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public ImageAndTextToastBuilder setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public ImageAndTextToastBuilder setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public ImageAndTextToastBuilder setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    /**********************************************************************************************/

    public Integer getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public Integer getTextColor() {
        return textColor;
    }

    public Integer getTextSize() {
        return textSize;
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
