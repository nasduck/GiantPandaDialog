package com.zoopark.dialog.builder;

import android.content.Context;
import android.view.View;

import com.zoopark.dialog.view.DialogBody;

public class DialogBodyBuilder implements IBuilder {

    private DialogBody mDialogBody;

    private DialogBodyBuilder() {

    }

    public static DialogBodyBuilder getInstance() {
        return new DialogBodyBuilder();
    }

    @Override
    public View getView(Context context) {
        return mDialogBody;
    }

    public DialogBodyBuilder setDialogBody(DialogBody body) {
        this.mDialogBody = body;
        return this;
    }


}
