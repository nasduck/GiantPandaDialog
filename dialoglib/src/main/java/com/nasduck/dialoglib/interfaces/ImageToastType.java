package com.nasduck.dialoglib.interfaces;

public enum ImageToastType {

    SUCCESS(0), WARNING(1), FAILURE(2);

    private int type;

    ImageToastType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static ImageToastType getType(int toastType) {
        for (ImageToastType enums : ImageToastType.values()) {
            if (enums.type == toastType) {
                return enums;
            }
        }
        return null;
    }
}
