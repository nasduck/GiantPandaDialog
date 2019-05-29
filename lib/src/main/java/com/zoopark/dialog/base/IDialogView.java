package com.zoopark.dialog.base;

import android.content.Context;
import android.view.View;

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
