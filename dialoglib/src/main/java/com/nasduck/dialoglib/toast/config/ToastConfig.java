package com.nasduck.dialoglib.toast.config;

import android.os.Parcel;
import android.os.Parcelable;

import com.nasduck.dialoglib.R;

public final class ToastConfig implements Parcelable {

    private String text;
    private Integer image;
    private Integer anim;
    private Integer textColor;
    private Integer textSize;
    private Integer bgColor;
    private Integer cornerRadius;
    private Integer paddingHorizontal;
    private Integer paddingVertical;
    private Long delay;

    private ToastConfig() {
        this.textColor = android.R.color.white;
        this.textSize = 14;
        this.bgColor = R.color.black_alpha_50;
        this.cornerRadius = 6;
        this.paddingHorizontal = 18;
        this.paddingVertical = 12;
    }

    public static ToastConfig newInstance() {
        return new ToastConfig();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getAnim() {
        return anim;
    }

    public void setAnim(Integer anim) {
        this.anim = anim;
    }

    public Integer getTextColor() {
        return textColor;
    }

    public void setTextColor(Integer textColor) {
        this.textColor = textColor;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    public Integer getBgColor() {
        return bgColor;
    }

    public void setBgColor(Integer bgColor) {
        this.bgColor = bgColor;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public Long getDelay() {
        return delay;
    }

    public void setDelay(Long delay) {
        this.delay = delay;
    }

    public Integer getPaddingHorizontal() {
        return paddingHorizontal;
    }

    public void setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
    }

    public Integer getPaddingVertical() {
        return paddingVertical;
    }

    public void setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeValue(this.image);
        dest.writeValue(this.anim);
        dest.writeValue(this.textColor);
        dest.writeValue(this.textSize);
        dest.writeValue(this.bgColor);
        dest.writeValue(this.cornerRadius);
        dest.writeValue(this.paddingHorizontal);
        dest.writeValue(this.paddingVertical);
        dest.writeValue(this.delay);
    }

    protected ToastConfig(Parcel in) {
        this.text = in.readString();
        this.image = (Integer) in.readValue(Integer.class.getClassLoader());
        this.anim = (Integer) in.readValue(Integer.class.getClassLoader());
        this.textColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.textSize = (Integer) in.readValue(Integer.class.getClassLoader());
        this.bgColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.cornerRadius = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingHorizontal = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingVertical = (Integer) in.readValue(Integer.class.getClassLoader());
        this.delay = (Long) in.readValue(Long.class.getClassLoader());
    }

    public static final Parcelable.Creator<ToastConfig> CREATOR = new Parcelable.Creator<ToastConfig>() {
        @Override
        public ToastConfig createFromParcel(Parcel source) {
            return new ToastConfig(source);
        }

        @Override
        public ToastConfig[] newArray(int size) {
            return new ToastConfig[size];
        }
    };
}
