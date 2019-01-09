package com.nasduck.dialoglib.config;

import android.os.Parcel;
import android.os.Parcelable;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.utils.DensityUtils;

public class ToastConfig implements Parcelable {

    private String text;       // content no set
    private Integer textColor; // 1A1A1A
    private Integer textSize;  // 16
    private Integer bgColor ;  // 99000000
    private Integer cornerRadius; // 3

    private static ToastConfig DEFAULT;

    public static ToastConfig getConfig() {
        if (DEFAULT == null) {
            DEFAULT = new ToastConfig();
        }
        return DEFAULT;
    }

    public ToastConfig setBackgroundColor(int backgroundColor) {
        this.bgColor = backgroundColor;
        return this;
    }

    public ToastConfig setText(String text) {
        this.text = text;
        return this;
    }

    public ToastConfig setTextSize(int textSize) {
        this.textSize = textSize;
        return this;
    }

    public ToastConfig setTextColor(int textColor) {
        this.textColor = textColor;
        return this;
    }


    public ToastConfig setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    /**  get way *********************************************************************************/

    public String getText() {
        if (text == null || text.equals("")) {
            text = "content no set";
        }
        return text;
    }

    public int getTextColor() {
        if (textColor == null) {
            textColor = R.color.white;
        }
        return textColor;
    }

    public int getTextSize() {
        if (textSize == null) {
            textSize = 14;
        }
        return textSize;
    }

    public int getBackgroundColor() {
        if (bgColor == null) {
            bgColor = R.color.black_alpha_60;
        }
        return bgColor;
    }

    public Integer getCornerRadius() {
        if (cornerRadius == null) {
            cornerRadius = 3;
        }
        return cornerRadius;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeValue(this.textColor);
        dest.writeValue(this.textSize);
        dest.writeValue(this.bgColor);
        dest.writeValue(this.cornerRadius);
    }

    public ToastConfig() {
    }

    protected ToastConfig(Parcel in) {
        this.text = in.readString();
        this.textColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.textSize = (Integer) in.readValue(Integer.class.getClassLoader());
        this.bgColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.cornerRadius = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<ToastConfig> CREATOR = new Creator<ToastConfig>() {
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
