package com.nasduck.dialoglib.dialog.composition.body;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.dialog.config.BodyConfig;
import com.nasduck.dialoglib.base.enums.GravityWay;
import com.nasduck.dialoglib.utils.DensityUtils;

public class DialogBody extends RelativeLayout {

    private BodyConfig mConfig;

    public static DialogBody create(Context context, BodyConfig config) {
        return new DialogBody(context, config);
    }

    public DialogBody(Context context, BodyConfig config) {
        super(context);
        mConfig = config;
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_body_text, this);
        TextView tvContent = view.findViewById(R.id.tv_title);
        FrameLayout layoutBackground = view.findViewById(R.id.container);

        tvContent.setText(mConfig.getContent());
        tvContent.setTextSize(mConfig.getContentTextSize());
        tvContent.setTextColor(getResources().getColor(mConfig.getContentColor()));
        tvContent.setLayoutParams(setLayoutGravity(mConfig.getGravity()));
        layoutBackground.setPadding(DensityUtils.dp2px(context, mConfig.getPaddingLeft()),
                DensityUtils.dp2px(context, mConfig.getPaddingTop()),
                DensityUtils.dp2px(context, mConfig.getPaddingRight()),
                DensityUtils.dp2px(context, mConfig.getPaddingBottom()));

    }

    private FrameLayout.LayoutParams setLayoutGravity(GravityWay way) {
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        switch (way) {
            case START:
                params.gravity = Gravity.START;
                return params;
            case END:
                params.gravity = Gravity.END;
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
