package com.nasduck.dialoglib.dialog.interfaces;

import android.content.Context;
import android.view.View;

public interface IDialogHeader {

    /**
     * get dialog header mView
     * @param context
     * @return
     */
    View getView(Context context);

    /**
     * get dialog background radius
     * @param cornerRadius
     */
    void getCornerRadius(int cornerRadius);
}
