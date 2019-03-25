package com.nasduck.dialoglib.interfaces;

import android.content.Context;
import android.view.View;

public interface IDialogHeader {

    /**
     * get dialog header view
     * @param context
     * @return
     */
    View getView(Context context);

    /**
     * get dialog background radius
     * @param cornerRadius
     */
    void getCornerRadius(float cornerRadius);
}
