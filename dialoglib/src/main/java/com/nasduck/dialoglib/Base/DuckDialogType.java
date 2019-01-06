package com.nasduck.dialoglib.Base;

public enum DuckDialogType {

    TOAST_BLACK(1);

    private int mDialogType;

    DuckDialogType(int dialogType) {
        this.mDialogType = dialogType;
    }

    public int getDialogType() {
        return mDialogType;
    }

    public int getmDialogType() {
        return mDialogType;
    }

    public static DuckDialogType getType(int dialogType) {
        for (DuckDialogType enums : DuckDialogType.values()) {
            if (enums.mDialogType == dialogType) {
                return enums;
            }
        }
        return null;
    }
}
