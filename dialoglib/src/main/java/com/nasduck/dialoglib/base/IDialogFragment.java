package com.nasduck.dialoglib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

public interface IDialogFragment {

    /**
     * Init view with dialog layout
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
