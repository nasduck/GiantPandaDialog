package com.nasduck.dialoglib.config;

import android.os.Parcel;
import android.os.Parcelable;

import com.nasduck.dialoglib.builder.ImageAndTextToastBuilder;
import com.nasduck.dialoglib.builder.ImageToastBuilder;
import com.nasduck.dialoglib.builder.TextToastBuilder;

public class ToastConfig implements Parcelable {

    private Integer image;
    private Integer anim;
    private String text;
    private Integer textColor;
    private Integer textSize;
    private Integer bgColor;
    private Integer cornerRadius;
    private Integer delay;
    private Integer paddingHorizontal;
    private Integer paddingVertical;

    public ToastConfig(TextToastBuilder builder) {
        this.text = builder.getText();
        this.textColor = builder.getTextColor();
        this.textSize = builder.getTextSize();
        this.bgColor = builder.getBgColor();
        this.cornerRadius = builder.getCornerRadius();
        this.paddingHorizontal = builder.getPaddingHorizontal();
        this.paddingVertical = builder.getPaddingVertical();
    }

    public ToastConfig(ImageToastBuilder builder) {
        this.image = builder.getImage();
        this.bgColor = builder.getBgColor();
        this.cornerRadius = builder.getCornerRadius();
        this.paddingHorizontal = builder.getPaddingHorizontal();
        this.paddingVertical = builder.getPaddingVertical();
    }

    public ToastConfig(ImageAndTextToastBuilder builder) {
        this.image = builder.getImage();
        this.text = builder.getText();
        this.textColor = builder.getTextColor();
        this.textSize = builder.getTextSize();
        this.bgColor = builder.getBgColor();
        this.cornerRadius = builder.getCornerRadius();
        this.paddingHorizontal = builder.getPaddingHorizontal();
        this.paddingVertical = builder.getPaddingVertical();
    }

    /*********************************************************************************************/

    public Integer getImage() {
        return image;
    }

    public Integer getAnim() {
        return anim;
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

    public Integer getDelay() {
        return delay;
    }

    public Integer getPaddingHorizontal() {
        return paddingHorizontal;
    }

    public Integer getPaddingVertical() {
        return paddingVertical;
    }

    /****************************************************************************************/

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

    public ToastConfig() {
    }

    protected ToastConfig(Parcel in) {
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
