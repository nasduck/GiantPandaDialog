package com.nasduck.dialoglib.dialog.body;

import android.content.Context;
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

public class TextBody extends RelativeLayout {

    private static DialogConfig mConfig;

    public static TextBody create(Context context, DialogConfig config) {
        mConfig = config;
        return new TextBody(context);
    }

    public TextBody(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_body_text, this);
        TextView tvContent = view.findViewById(R.id.tv_content);
        FrameLayout layoutBackground = view.findViewById(R.id.layout);

        tvContent.setText(mConfig.getContentText());
        tvContent.setTextSize(mConfig.getContentTextSize());
        tvContent.setTextColor(getResources().getColor(mConfig.getContentTextColor()));
        tvContent.setLayoutParams(setLayoutGravity(mConfig.getGravityWay()));
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
