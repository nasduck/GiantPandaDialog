package com.nasduck.dialoglib.toast.classification;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.nasduck.dialoglib.utils.DensityUtils;
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
        ImageToast toast = new ImageToast();
        Bundle args = new Bundle();
        args.putParcelable("imageToastConfig", config);
        toast.setArguments(args);
        return toast;
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
        mLayoutBackground = mView.findViewById(R.id.container);
        mIvImage = mView.findViewById(R.id.iv_image);

        updateUI(this.mConfig);
    }

    public void updateUI(ToastConfig config) {
        // Corner Radius && Background Color
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(DensityUtils.dp2px(getContext(), config.getCornerRadius()));
        drawable.setColor(mContext.getResources().getColor(config.getBgColor()));
        mLayoutBackground.setBackground(drawable);

        // Image
        mIvImage.clearAnimation();
        mIvImage.setImageResource(config.getImage());
        if (config.getAnim() != null) { // Set Animation
            Animation animation = AnimationUtils.loadAnimation(getContext(), config.getAnim());
            mIvImage.setAnimation(animation);
        }

        // Padding
        mLayoutBackground.setPadding(DensityUtils.dp2px(getContext(), config.getPaddingHorizontal()),
                DensityUtils.dp2px(getContext(), config.getPaddingVertical()),
                DensityUtils.dp2px(getContext(), config.getPaddingHorizontal()),
                DensityUtils.dp2px(getContext(), config.getPaddingVertical()));
    }
}
