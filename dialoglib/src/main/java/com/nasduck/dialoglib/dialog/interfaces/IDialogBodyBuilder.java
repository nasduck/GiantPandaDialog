package com.nasduck.dialoglib.dialog.interfaces;

import android.content.Context;
import android.view.View;

public interface IDialogBodyBuilder {

    /**
     * get dialog body mView
     * @param context
     * @return
     */
    View getView(Context context);
}
