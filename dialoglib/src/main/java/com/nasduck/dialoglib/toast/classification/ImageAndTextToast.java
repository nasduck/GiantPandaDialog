package com.nasduck.dialoglib.toast.classification;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.utils.DensityUtils;
import com.nasduck.dialoglib.toast.base.BaseToast;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.toast.config.ToastConfig;

public class ImageAndTextToast extends BaseToast {

    private LinearLayout mLayoutContainer;
    private ImageView mIvImage;
    private TextView mTvTitle;

    private ToastConfig mConfig;

    public ImageAndTextToast() {}

    public static ImageAndTextToast create(ToastConfig config){
        ImageAndTextToast toast = new ImageAndTextToast();
        Bundle args = new Bundle();
        args.putParcelable("textAndImageToastConfig", config);
        toast.setArguments(args);
        return toast;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mConfig = getArguments().getParcelable("textAndImageToastConfig");
        }
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.toast_text_image;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mLayoutContainer = mView.findViewById(R.id.container);
        mIvImage = mView.findViewById(R.id.iv_image);
        mTvTitle = mView.findViewById(R.id.tv_title);

        updateUI(mConfig);
    }

    public void updateUI(ToastConfig config) {

        // Title
        mTvTitle.setText(config.getText());
        mTvTitle.setTextSize(config.getTextSize());
        mTvTitle.setTextColor(getResources().getColor(config.getTextColor()));

        // Image
        mIvImage.clearAnimation();
        mIvImage.setImageResource(config.getImage());
        if (config.getAnim() != null) { // Set Animation
            Animation animation = AnimationUtils.loadAnimation(getContext(), config.getAnim());
            mIvImage.setAnimation(animation);
        }

        // Padding
        mLayoutContainer.setPadding(DensityUtils.dp2px(mContext, config.getPaddingHorizontal()),
                DensityUtils.dp2px(mContext, config.getPaddingVertical()),
                DensityUtils.dp2px(mContext, config.getPaddingHorizontal()),
                DensityUtils.dp2px(mContext, config.getPaddingVertical()));

        // Corner Radius && Background Color
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(DensityUtils.dp2px(mContext, config.getCornerRadius()));
        drawable.setColor(mContext.getResources().getColor(config.getBgColor()));
        mLayoutContainer.setBackground(drawable);
    }
}
