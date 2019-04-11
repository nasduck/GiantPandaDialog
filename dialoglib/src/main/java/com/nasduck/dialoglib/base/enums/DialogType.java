package com.nasduck.dialoglib.base.enums;

public enum DialogType {

    NO_TITLE_TIP_DIALOG("noTitleTipDialog"),
    TITLE_TIP_DIALOG("titleTipDialog"),
    NO_TITLE_SELECT_DIALOG("noTitleSelectDialog"),
    TITLE_SELECT_DIALOG("titleSelectDialog");

    private String dialogTag;

    DialogType(String dialogTag) {
        this.dialogTag = dialogTag;
    }

    public String getDialogTag() {
        return dialogTag;
    }
}
