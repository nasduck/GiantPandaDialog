package com.nasduck.dialoglib.dialog.footer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogConfig;

public class OneButtonFooter extends RelativeLayout {

    private static DialogConfig mConfig;

    public static OneButtonFooter create(Context context, DialogConfig config) {
        mConfig = config;
        return new OneButtonFooter(context);
    }

    public OneButtonFooter(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_footer_button_one, this);
        Button btnNormal = view.findViewById(R.id.btn_normal);

        btnNormal.setText(mConfig.getNormalButtonText());
        btnNormal.setTextColor(mConfig.getNormalButtonTextColor());
        btnNormal.setTextSize(mConfig.getNormalButtonTextSize());
        btnNormal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mConfig.getNormalClickListener() != null) {
                    mConfig.getNormalClickListener().onNormalClick();
                }
                // todo hide
            }
        });
    }
}
