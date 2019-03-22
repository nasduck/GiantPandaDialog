package com.nasduck.dialoglib.dialog.header;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.enums.GravityWay;
import com.nasduck.dialoglib.utils.DensityUtils;

public class TextHeader extends RelativeLayout {

    private static DialogConfig mConfig;

    public static TextHeader create(Context context, DialogConfig config) {
        mConfig = config;
        return new TextHeader(context);
    }

    public TextHeader(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_header_text, this);
        TextView TvTitle = view.findViewById(R.id.tv_title);
        FrameLayout layoutBackground = view.findViewById(R.id.layout);

        // set text style
        TvTitle.setText(mConfig.getTitleText());
        TvTitle.setTextSize(mConfig.getTitleTextSize());
        TvTitle.setTextColor(getResources().getColor(mConfig.getTitleTextColor()));
        TvTitle.setLayoutParams(setLayoutGravity(mConfig.getGravityWay()));

        // set background
        float radius = mConfig.getCornerRadius();
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadii(new float[]{DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius), 0, 0, 0, 0});
        drawable.setColor(getResources().getColor(mConfig.getBackgroundColor()));
        layoutBackground.setBackground(drawable);

        // set text location
        layoutBackground.setPadding(DensityUtils.dp2px(context, mConfig.getPaddingLeft()),
                DensityUtils.dp2px(context, mConfig.getPaddingTop()),
                DensityUtils.dp2px(context, mConfig.getPaddingRight()),
                DensityUtils.dp2px(context, mConfig.getPaddingBottom()));

    }

    private FrameLayout.LayoutParams setLayoutGravity(GravityWay way) {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        switch (way) {
            case LEFT:
                params.gravity = Gravity.LEFT;
                return params;
            case RIGHT:
                params.gravity = Gravity.RIGHT;
                return params;
            case CENTER:
                params.gravity = Gravity.CENTER;
                return params;
            case CENTER_VERTICAL:
                params.gravity = Gravity.CENTER_VERTICAL;
                return params;
            case CENTER_HORIZONTAL:
                params.gravity = Gravity.CENTER_HORIZONTAL;
                return params;
            default:
                params.gravity = Gravity.CENTER;
                return params;
        }
    }

}
