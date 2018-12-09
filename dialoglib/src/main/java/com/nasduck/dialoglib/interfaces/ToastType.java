package com.nasduck.dialoglib.interfaces;

public enum ToastType {

    SUCCESS(0), WARNING(1), FAILURE(2);

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
