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
import com.nasduck.dialoglib.dialog.config.DialogConfig;
import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.base.utils.DensityUtils;

public class TwoButtonFooter extends RelativeLayout {

    private static FragmentActivity mActivity;
    private static DialogConfig mConfig;
    private static String mTag;

    public static TwoButtonFooter create(FragmentActivity activity, Context context, DialogConfig config, String tag) {
        mActivity = activity;
        mConfig = config;
        mTag = tag;
        return new TwoButtonFooter(context);
    }

    public TwoButtonFooter(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_footer_button_two, this);
        Button btnNegative = view.findViewById(R.id.btn_negative);
        Button btnPositive = view.findViewById(R.id.btn_positive);
        float radius = mConfig.getCornerRadius();

        /** btnNegative ***************************************************************************/
        // button click effect
        GradientDrawable drawablePressedNegative = new GradientDrawable();
        drawablePressedNegative.setCornerRadii(new float[]{0f, 0f, 0f, 0f, 0f, 0f,
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius)});
        drawablePressedNegative.setColor(getResources().getColor(mConfig.getClickBackgroundColor()));

        GradientDrawable drawableNormalNegative = new GradientDrawable();
        drawableNormalNegative.setCornerRadii(new float[]{0f, 0f, 0f, 0f, 0f, 0f,
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius)});
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

        /** btnPositive ***************************************************************************/
        // button click effect
        GradientDrawable drawablePressedPositive = new GradientDrawable();
        drawablePressedPositive.setCornerRadii(new float[]{0f, 0f, 0f, 0f,
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius), 0f, 0f});
        drawablePressedPositive.setColor(getResources().getColor(mConfig.getClickBackgroundColor()));

        GradientDrawable drawableNormalPositive = new GradientDrawable();
        drawableNormalPositive.setCornerRadii(new float[]{0f, 0f, 0f, 0f,
                DensityUtils.dp2px(getContext(), radius),
                DensityUtils.dp2px(getContext(), radius), 0f, 0f});
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
