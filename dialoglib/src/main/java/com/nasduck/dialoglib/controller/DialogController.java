package com.nasduck.dialoglib.controller;

import com.nasduck.dialoglib.builder.dialog.TextHeaderBuilder;

public class DialogController {

    public static TextHeaderBuilder createHeader() {
        return new TextHeaderBuilder();
    }

}
