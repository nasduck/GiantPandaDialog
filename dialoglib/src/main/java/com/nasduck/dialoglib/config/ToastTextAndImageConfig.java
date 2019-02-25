package com.nasduck.dialoglib.config;

import android.os.Parcel;
import android.os.Parcelable;

import com.nasduck.dialoglib.R;

public class ToastTextAndImageConfig implements Parcelable {
    
    private Integer image;   // R.drawable.ic_launcher
    private Integer anim;
    private String text;       // content no set
    private Integer textColor; // 1A1A1A
    private Integer textSize;  // 16
    private Integer bgColor ;  // 99000000
    private Integer cornerRadius; // 3
    private Integer delay;     // 1500
    private Integer paddingHorizontal; // 32
    private Integer paddingVertical;   // 32

    public static ToastTextAndImageConfig getInstance() {
        return new ToastTextAndImageConfig();
    }

    //** Setter **********************************************************************************//

    public ToastTextAndImageConfig setText(String text) {
        this.text = text;
        return this;
    }

    public ToastTextAndImageConfig setTextSize(int textSize) {
        this.textSize = textSize;
        return this;
    }

    public ToastTextAndImageConfig setTextColor(int textColor) {
        this.textColor = textColor;
        return this;
    }

    public ToastTextAndImageConfig setImage(int image) {
        this.image = image;
        return this;
    }

    public ToastTextAndImageConfig setAnimation(int animId) {
        this.anim = animId;
        return this;
    }

    public ToastTextAndImageConfig setBackgroundColor(int backgroundColor) {
        this.bgColor = backgroundColor;
        return this;
    }

    public ToastTextAndImageConfig setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return this;
    }

    public ToastTextAndImageConfig setDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    public ToastTextAndImageConfig setPaddingHorizontal(Integer paddingHorizontal) {
        this.paddingHorizontal = paddingHorizontal;
        return this;
    }

    public ToastTextAndImageConfig setPaddingVertical(Integer paddingVertical) {
        this.paddingVertical = paddingVertical;
        return this;
    }

    //** Getter **********************************************************************************//

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

    public Integer getImage() {
        if (image == null || image.equals("")) {
            image = R.drawable.ic_launcher;
        }
        return image;
    }

    public Integer getAnim() {
        if (anim == null || anim.equals("")) {
            anim = 0;
        }
        return anim;
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
        dest.writeString(this.text);
        dest.writeValue(this.textColor);
        dest.writeValue(this.textSize);
        dest.writeValue(this.image);
        dest.writeValue(this.anim);
        dest.writeValue(this.bgColor);
        dest.writeValue(this.cornerRadius);
        dest.writeValue(this.delay);
        dest.writeValue(this.paddingVertical);
        dest.writeValue(this.paddingHorizontal);
    }

    public ToastTextAndImageConfig() {
    }

    protected ToastTextAndImageConfig(Parcel in) {
        this.text = in.readString();
        this.textColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.textSize = (Integer) in.readValue(Integer.class.getClassLoader());
        this.image = (Integer) in.readValue(Integer.class.getClassLoader());
        this.anim = (Integer) in.readValue(Integer.class.getClassLoader());
        this.bgColor = (Integer) in.readValue(Integer.class.getClassLoader());
        this.cornerRadius = (Integer) in.readValue(Integer.class.getClassLoader());
        this.delay = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingHorizontal = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paddingVertical = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<ToastTextAndImageConfig> CREATOR = new Parcelable.Creator<ToastTextAndImageConfig>() {
        @Override
        public ToastTextAndImageConfig createFromParcel(Parcel source) {
            return new ToastTextAndImageConfig(source);
        }

        @Override
        public ToastTextAndImageConfig[] newArray(int size) {
            return new ToastTextAndImageConfig[size];
        }
    };
}
