package com.nasduck.dialoglib.interfaces;

public enum ToastType {

    TEXT_TOAST(0), IMAGE_TOAST(1), TEXT_AND_IMAGE_TOAST(2);

    private int type;

    ToastType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
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
