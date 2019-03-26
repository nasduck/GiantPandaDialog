package com.nasduck.dialoglib.interfaces;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public interface IDialogFooter {

    /**
     * get dialog footer view
     * @param activity
     * @param context
     * @param tag
     * @return
     */
    View getView(FragmentActivity activity, Context context, String tag);

    /**
     * get dialog background radius
     * @param cornerRadius
     */
    void getCornerRadius(int cornerRadius);

    /**
     * get button not click color
     * @param color
     */
    void getNormalStatusColor(int color);
}
