package com.zoopark.demo;

import android.content.Context;
import android.view.View;

import com.zoopark.dialog.view.DialogBody;

public class CustomDialogBody extends DialogBody {

    public CustomDialogBody(Context context) {
        super(context);
    }

    @Override
    public int initLayout() {
        return R.layout.layout_custom;
    }

    @Override
    public void initUI(View view) {

    }
}
