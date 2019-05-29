package com.zoopark.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.zoopark.dialog.config.HeaderConfig;
import com.zoopark.dialog.utils.DensityUtils;

public class DialogHeader extends FrameLayout {

    private static HeaderConfig mConfig;
    private Context mContext;

    public static DialogHeader create(Context context, HeaderConfig config) {
        mConfig = config;
        return new DialogHeader(context);
    }

    public DialogHeader(Context context) {
        super(context);
        mContext = context;
        init(context);
    }

    private void init(Context context) {
        TextView tv = new TextView(context);
        tv.setText(mConfig.getTitle());
        tv.setTextSize(mConfig.getTitleTextSize());
        tv.setTextColor(getResources().getColor(mConfig.getTitleColor()));
        tv.setTypeface(Typeface.DEFAULT, mConfig.getTypeface());

        // Gravity
        LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        lp.gravity = mConfig.getGravity();
        tv.setLayoutParams(lp);

        // Padding
        tv.setPadding(DensityUtils.dp2px(context, mConfig.getPaddingLeft()),
                DensityUtils.dp2px(context, mConfig.getPaddingTop()),
                DensityUtils.dp2px(context, mConfig.getPaddingRight()),
                DensityUtils.dp2px(context, mConfig.getPaddingBottom()));

        this.addView(tv);

        this.setBackgroundResource(mConfig.getBgColor());
    }

    public void setCornerRadius(int cornerRadius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadii(new float[]{
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius),
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius),
                0, 0,
                0, 0});
        drawable.setColor(getResources().getColor(mConfig.getBgColor()));
        this.setBackground(drawable);
    }
}
