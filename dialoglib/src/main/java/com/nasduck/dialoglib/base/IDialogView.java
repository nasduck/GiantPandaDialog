package com.nasduck.dialoglib.base;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public interface IDialogView {

    View getViewHeader(Context context);

    View getBodyLayout(Context context);

    View getFooterLayout(Context context);
}
