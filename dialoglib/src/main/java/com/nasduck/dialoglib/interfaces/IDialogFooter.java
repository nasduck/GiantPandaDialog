package com.nasduck.dialoglib.interfaces;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public interface IDialogFooter {

    View getView(FragmentActivity activity, Context context, String tag);
}
