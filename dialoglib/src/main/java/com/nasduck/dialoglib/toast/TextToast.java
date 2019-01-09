package com.nasduck.dialoglib.toast;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.base.BaseToast;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.ToastConfig;

public class TextToast extends BaseToast {

    private TextView mTvContent;
    private FrameLayout mLayoutBackground;

    private ToastConfig mConfig;

    public TextToast() {}

    public static TextToast create(ToastConfig config) {
        TextToast fragment = new TextToast();
        Bundle args = new Bundle();
        args.putParcelable("config", config);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mConfig = getArguments().getParcelable("config");
        }
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.toast_text;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

        mTvContent = view.findViewById(R.id.tv_content);
        mLayoutBackground = view.findViewById(R.id.background);

        // Corner Radius && Background Color
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(mConfig.getCornerRadius());
        drawable.setColor(mContext.getResources().getColor(mBackground));
        mLayoutBackground.setBackground(drawable);

        // Text
        mTvContent.setText(mConfig.getText());

        // Text Size
        mTvContent.setTextSize(mConfig.getTextSize());

        // Text Color
        mTvContent.setTextColor(getResources().getColor(mConfig.getTextColor()));
    }

}
