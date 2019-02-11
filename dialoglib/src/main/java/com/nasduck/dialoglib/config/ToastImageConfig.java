package com.nasduck.dialoglib.config;

import android.os.Parcel;
import android.os.Parcelable;

import com.nasduck.dialoglib.R;

public class ToastImageConfig implements Parcelable {

    private Integer image;   // R.drawable.ic_launcher
    private Integer bgColor ;  // 99000000
    private Integer cornerRadius; // 3
    private Integer delay;     // 1500
    private Integer paddingHorizontal; // 32
    private Integer paddingVertical;   // 20

    public static ToastImageConfig getInstance() {
        return new ToastImageConfig();
    }

    //** Setter **********************************************************************************//

    public ToastImageConfig setBackgroundColor(int backgroundColor) {
        this.bgColor = backgroundColor;
        return this;
    }

    public ToastImageConfig setImage(Integer image) {
        this.image = image;
        return this;
    }

    public ToastImageConfig setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public ToastImageConfig setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    public ToastImageConfig setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public ToastImageConfig setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    //** Getter **********************************************************************************//

    public Integer getImage() {
        if (image == null || image.equals("")) {
            image = R.drawable.ic_launcher;
        }
        return image;
    }

    public int getBackgroundColor() {
        if (bgColor == null) {
            bgColor = R.color.black_alpha_60;
        }
        return bgColor;
    }

    public Integer getCornerRadius() {
        if (cornerRadius == null) {
            cornerRadius = 6;
        }
        return cornerRadius;
    }

    public Integer getDelay() {
        if (delay == null) {
            delay = 1500;
        }
        return delay;
    }

    public Integer getPaddingHorizontal() {
        if (paddingHorizontal == null) {
            paddingHorizontal = 32;
        }
        return paddingHorizontal;
    }

    public Integer getPaddingVertical() {
        if (paddingVertical == null) {
            paddingVertical = 32;
        }
        return paddingVertical;
    }


    //** Parcelable ******************************************************************************//

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.image);
        dest.writeValue(this.bgColor);
        dest.writeValue(this.cornerRadius);
        dest.writeValue(this.delay);
        dest.writeValue(this.paddingVertical);
        dest.writeValue(this.paddingHorizontal);
    }

    public ToastImageConfig() {
    }

    protected ToastImageConfig(Parcel in) {
        this.image = (Integer) in.readValue(Integer.class.getClassLoader());
        this.bgColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.cornerRadius = (Integer) in.readValue(Integer.class.getClassLoader());
        this.delay = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingHorizontal = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingVertical = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<ToastImageConfig> CREATOR = new Creator<ToastImageConfig>() {
        @Override
        public ToastImageConfig createFromParcel(Parcel source) {
            return new ToastImageConfig(source);
        }

        @Override
        public ToastImageConfig[] newArray(int size) {
            return new ToastImageConfig[size];
        }
    };
}
