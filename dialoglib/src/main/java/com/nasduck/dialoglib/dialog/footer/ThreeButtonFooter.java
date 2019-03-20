package com.nasduck.dialoglib.dialog.footer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.controller.DuckDialog;

public class ThreeButtonFooter extends RelativeLayout {

    private static FragmentActivity mActivity;
    private static DialogConfig mConfig;
    private static String mTag;

    public static ThreeButtonFooter create(FragmentActivity activity, Context context, DialogConfig config, String tag) {
        mActivity = activity;
        mConfig = config;
        mTag = tag;
        return new ThreeButtonFooter(context);
    }

    public ThreeButtonFooter(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_footer_button_three, this);
        Button btnNormal = view.findViewById(R.id.btn_normal);
        Button btnNegative = view.findViewById(R.id.btn_negative);
        Button btnPositive = view.findViewById(R.id.btn_positive);

        btnNormal.setText(mConfig.getNormalButtonText());
        btnNormal.setTextColor(mConfig.getNormalButtonTextColor());
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

        btnNegative.setText(mConfig.getNegativeButtonText());
        btnNegative.setTextColor(mConfig.getNegativeButtonTextColor());
        btnNegative.setTextSize(mConfig.getNegativeButtonTextSize());
        btnNegative.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConfig.getNegativeClickListener() != null) {
                    mConfig.getNegativeClickListener().onNegativeClick();
                }
                DuckDialog.hide(mActivity, mTag);
            }
        });

        btnPositive.setText(mConfig.getPositiveButtonText());
        btnPositive.setTextColor(mConfig.getPositiveButtonTextColor());
        btnPositive.setTextSize(mConfig.getPositiveButtonTextSize());
        btnPositive.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConfig.getPositiveClickListener() != null) {
                    mConfig.getPositiveClickListener().onPositiveClick();
                }
                DuckDialog.hide(mActivity, mTag);
            }
        });
    }
}
