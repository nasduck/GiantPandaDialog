package com.nasduck.dialoglib.dialog.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public interface IDialogView {

    /**
     * get dialog header mView
     * @param context
     * @return
     */
    View getHeaderLayout(Context context);

    /**
     * get dialog body mView
     * @param context
     * @return
     */
    View getBodyLayout(Context context);

    /**
     * get dialog footer mView
     * @param context
     * @return
     */
    View getFooterLayout(Context context);
}
