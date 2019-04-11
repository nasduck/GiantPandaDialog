package com.nasduck.dialoglib.dialog.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

public interface IDialogFragment {

    /**
     * Init mView with dialog layout
     *
     * @param savedInstanceState
     * @return
     */
    int initView(@Nullable Bundle savedInstanceState);

    /**
     * Init data
     *
     * @param savedInstanceState
     */
    void initData(@Nullable Bundle savedInstanceState);
}
