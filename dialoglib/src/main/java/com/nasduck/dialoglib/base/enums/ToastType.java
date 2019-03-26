package com.nasduck.dialoglib.base.enums;

public enum ToastType {

    TEXT_TOAST(0, "TEXT_TOAST"), IMAGE_TOAST(1, "IMAGE_TOAST"), TEXT_AND_IMAGE_TOAST(2, "TEXT_AND_IMAGE_TOAST");

    private int type;
    private String toastTag;

    ToastType(int type, String toastTag) {
        this.type = type;
        this.toastTag = toastTag;
    }

    public int getType() {
        return type;
    }

    public String getToastTag() {
        return toastTag;
    }

    public static ToastType getType(int toastType) {
        for (ToastType enums : ToastType.values()) {
            if (enums.type == toastType) {
                return enums;
            }
        }
        return null;
    }
}
