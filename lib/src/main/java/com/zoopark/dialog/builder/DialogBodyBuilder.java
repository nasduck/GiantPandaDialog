package com.zoopark.dialog.builder;

import android.content.Context;
import android.view.View;

import com.zoopark.dialog.R;
import com.zoopark.dialog.view.DialogBody;
import com.zoopark.dialog.view.DialogTextBody;

public class DialogBodyBuilder implements IBuilder {

    private DialogBody mDialogBody;

    private DialogBodyBuilder() {

    }

    public static DialogBodyBuilder getInstance() {
        return new DialogBodyBuilder();
    }

    @Override
    public View getView(Context context) {
        return mDialogBody == null ? DialogTextBody.create(context)
                .setContent(context.getResources().getString(R.string.forget_body_hint)) : mDialogBody;
    }

    public DialogBodyBuilder setDialogBody(DialogBody body) {
        this.mDialogBody = body;
        return this;
    }


}
