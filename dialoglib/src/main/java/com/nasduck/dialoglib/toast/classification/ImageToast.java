package com.nasduck.dialoglib.toast.classification;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.nasduck.dialoglib.toast.base.BaseToast;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.toast.config.ToastConfig;

public class ImageToast extends BaseToast {

    private FrameLayout mLayoutBackground;
    private ImageView mIvImage;

    private ToastConfig mConfig;

    public ImageToast() {

    }

    public static ImageToast create(ToastConfig config){
        ImageToast fragment = new ImageToast();
        Bundle args = new Bundle();
        args.putParcelable("imageToastConfig", config);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mConfig = getArguments().getParcelable("imageToastConfig");
        }
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.toast_image;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mLayoutBackground = view.findViewById(R.id.background);
        mIvImage = view.findViewById(R.id.iv_image);

        updateUI(this.mConfig);
    }

    public void updateUI(ToastConfig config) {
        // Corner Radius && Background Color
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(config.getCornerRadius());
        drawable.setColor(mContext.getResources().getColor(config.getBgColor()));
        mLayoutBackground.setBackground(drawable);

        // Image
        mIvImage.setImageResource(config.getImage());

        // Padding
        mLayoutBackground.setPadding(config.getPaddingHorizontal(), config.getPaddingVertical(),
                config.getPaddingHorizontal(), config.getPaddingVertical());
    }
}
