package com.nasduck.dialoglib.interfaces;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public abstract class BaseDialogFragment extends DialogFragment {

    protected Context mContext;
    protected View view;

    protected int mBackground;
    protected boolean isCancelable;
    protected boolean hasShade;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // 绑定View
        view = inflater.inflate(getLayoutId(), container);

        // 去除对话框默认标题栏
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 初始化事件和获取数据
        initEventAndData();
    }

    @Override
    public void onAttach(Context context) {
        this.mContext = context;
        super.onAttach(context);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    /**
     * 设置阴影
     * @param hasShade
     */
    public void setShade(boolean hasShade) {
        if (hasShade) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        } else {
            getDialog().getWindow().setDimAmount(0f);
        }
    }

    /**
     * 获取Dialog页面视图
     * @return
     */
    protected abstract int getLayoutId();

    /**
     * 初始化Dialog事件和数据
     */
    protected abstract void initEventAndData();

    /**
     * 隐藏Dialog
     */
    protected abstract void hide();

}
