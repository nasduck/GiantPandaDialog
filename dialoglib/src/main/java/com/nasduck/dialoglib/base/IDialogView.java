package com.nasduck.dialoglib.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public interface IDialogView {

    /**
     * get dialog header view
     * @param context
     * @return
     */
    View getHeaderLayout(Context context);

    /**
     * get dialog body view
     * @param context
     * @return
     */
    View getBodyLayout(Context context);

    /**
     * get dialog footer view
     * @param context
     * @return
     */
    View getFooterLayout(Context context);
}
