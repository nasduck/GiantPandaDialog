package com.nasduck.dialoglib.dialog.footer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.controller.DuckDialog;
import com.nasduck.dialoglib.utils.DensityUtils;

public class OneButtonFooter extends RelativeLayout {

    private static FragmentActivity mActivity;
    private static DialogConfig mConfig;
    private static String mTag;

    public static OneButtonFooter create(FragmentActivity activity, Context context, DialogConfig config, String tag) {
        mActivity = activity;
        mConfig = config;
        mTag = tag;
        return new OneButtonFooter(context);
    }

    public OneButtonFooter(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_footer_button_one, this);
        Button btnNormal = view.findViewById(R.id.btn_normal);

        // todo 点击效果
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadii(new float[]{0f, 0f, 0f, 0f, 40f, 40f, 40f, 40f});
        btnNormal.setBackground(drawable);

        btnNormal.setText(mConfig.getNormalButtonText());
        btnNormal.setTextColor(getResources().getColor(mConfig.getNormalButtonTextColor()));
        btnNormal.setTextSize(mConfig.getNormalButtonTextSize());
        btnNormal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConfig.getNormalClickListener() != null) {
                    mConfig.getNormalClickListener().onNormalClick();
                }
                DuckDialog.hide(mActivity, mTag);
            }
        });
    }
}
