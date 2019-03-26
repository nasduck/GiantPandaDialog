package com.nasduck.dialoglib.toast.classification;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.base.utils.DensityUtils;
import com.nasduck.dialoglib.toast.base.BaseToast;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.toast.config.ToastConfig;

public class TextToast extends BaseToast {

    private TextView mTvContent;
    private FrameLayout mLayoutBackground;

    private ToastConfig mConfig;

    public TextToast() {}

    public static TextToast create(ToastConfig config) {
        TextToast fragment = new TextToast();
        Bundle args = new Bundle();
        args.putParcelable("textToastConfig", config);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mConfig = getArguments().getParcelable("textToastConfig");
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

        updateUI(this.mConfig);
    }

    public void updateUI(ToastConfig config) {
        // Corner Radius && Background Color
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(DensityUtils.dp2px(getContext(), config.getCornerRadius()));
        drawable.setColor(mContext.getResources().getColor(config.getBgColor()));
        mLayoutBackground.setBackground(drawable);

        // Text
        mTvContent.setText(config.getText());

        // Text Size
        mTvContent.setTextSize(config.getTextSize());

        // Text Color
        mTvContent.setTextColor(getResources().getColor(config.getTextColor()));

        // Padding
        mLayoutBackground.setPadding(DensityUtils.dp2px(getContext(), config.getPaddingHorizontal()),
                DensityUtils.dp2px(getContext(), config.getPaddingVertical()),
                DensityUtils.dp2px(getContext(), config.getPaddingHorizontal()),
                DensityUtils.dp2px(getContext(), config.getPaddingVertical()));
    }

}
