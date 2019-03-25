package com.nasduck.dialoglib.dialog.composition.footer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;
import com.nasduck.dialoglib.controller.DuckDialog;
import com.nasduck.dialoglib.utils.DensityUtils;

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

        float radius = mConfig.getCornerRadius();

        /** btnNegative ***************************************************************************/
        // button click effect
        GradientDrawable drawablePressedNegative = new GradientDrawable();
        drawablePressedNegative.setCornerRadii(new float[]{0f, 0f, 0f, 0f,
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius), 0, 0});
        drawablePressedNegative.setColor(getResources().getColor(mConfig.getClickBackgroundColor()));

        GradientDrawable drawableNormalNegative = new GradientDrawable();
        drawableNormalNegative.setCornerRadii(new float[]{0f, 0f, 0f, 0f,
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius), 0, 0});
        drawableNormalNegative.setColor(getResources().getColor(mConfig.getBackgroundColor()));

        StateListDrawable drawableListNegative = new StateListDrawable();
        drawableListNegative.addState(new int[]{android.R.attr.state_pressed}, drawablePressedNegative);
        drawableListNegative.addState(new int[]{}, drawableNormalNegative);

        btnNegative.setBackground(drawableListNegative);

        // button text style
        btnNegative.setText(mConfig.getNegativeButtonText());
        btnNegative.setTextColor(getResources().getColor(mConfig.getNegativeButtonTextColor()));
        btnNegative.setTextSize(mConfig.getNegativeButtonTextSize());

        // button click
        btnNegative.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConfig.getNegativeClickListener() != null) {
                    mConfig.getNegativeClickListener().onNegativeClick();
                }
                DuckDialog.hide(mActivity, mTag);
            }
        });

        /** btnNormal ***************************************************************************/
        // button click effect
        GradientDrawable drawablePressedNormal = new GradientDrawable();
        drawablePressedNormal.setColor(getResources().getColor(mConfig.getClickBackgroundColor()));

        GradientDrawable drawableNormalNormal = new GradientDrawable();
        drawableNormalNormal.setColor(getResources().getColor(mConfig.getBackgroundColor()));

        StateListDrawable drawableListNormal= new StateListDrawable();
        drawableListNormal.addState(new int[]{android.R.attr.state_pressed}, drawablePressedNormal);
        drawableListNormal.addState(new int[]{}, drawableNormalNormal);

        btnNormal.setBackground(drawableListNormal);

        // button text style
        btnNormal.setText(mConfig.getNormalButtonText());
        btnNormal.setTextColor(getResources().getColor(mConfig.getNormalButtonTextColor()));
        btnNormal.setTextSize(mConfig.getNormalButtonTextSize());

        // button click
        btnNormal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConfig.getNormalClickListener() != null) {
                    mConfig.getNormalClickListener().onNormalClick();
                }
                DuckDialog.hide(mActivity, mTag);
            }
        });

        /** btnPositive ***************************************************************************/
        // button click effect
        GradientDrawable drawablePressedPositive = new GradientDrawable();
        drawablePressedPositive.setCornerRadii(new float[]{0f, 0f, 0f, 0f, 0f, 0f,
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius)});
        drawablePressedPositive.setColor(getResources().getColor(mConfig.getClickBackgroundColor()));

        GradientDrawable drawableNormalPositive = new GradientDrawable();
        drawableNormalPositive.setCornerRadii(new float[]{0f, 0f, 0f, 0f, 0f, 0f,
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius)});
        drawableNormalPositive.setColor(getResources().getColor(mConfig.getBackgroundColor()));

        StateListDrawable drawableListPositive = new StateListDrawable();
        drawableListPositive.addState(new int[]{android.R.attr.state_pressed}, drawablePressedPositive);
        drawableListPositive.addState(new int[]{}, drawableNormalPositive);

        btnPositive.setBackground(drawableListPositive);

        // button text style
        btnPositive.setText(mConfig.getPositiveButtonText());
        btnPositive.setTextColor(getResources().getColor(mConfig.getPositiveButtonTextColor()));
        btnPositive.setTextSize(mConfig.getPositiveButtonTextSize());

        // button click
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
