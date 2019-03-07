package com.nasduck.dialoglib.dialog.footer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;

public class TwoButtonFooter extends RelativeLayout {

    private static DialogConfig mConfig;

    public static TwoButtonFooter create(Context context, DialogConfig config) {
        mConfig = config;
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

        btnNegative.setText(mConfig.getNegativeButtonText());
        btnNegative.setTextColor(mConfig.getNegativeButtonTextColor());
        btnNegative.setTextSize(mConfig.getNegativeButtonTextSize());
        btnNegative.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConfig.getNegativeClickListener() != null) {
                    mConfig.getNegativeClickListener().onNegativeClick();
                }
                // todo hide
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
                // todo hide
            }
        });
    }
}
