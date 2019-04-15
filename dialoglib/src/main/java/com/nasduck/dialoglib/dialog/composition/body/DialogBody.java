package com.nasduck.dialoglib.dialog.composition.body;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.dialog.config.BodyConfig;

public class DialogBody extends FrameLayout {

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

        this.setBackgroundResource(mConfig.getBgColor());

        TextView tv = new TextView(context);
        tv.setText(mConfig.getContent());
        tv.setTextSize(mConfig.getContentTextSize());
        tv.setTextColor(getResources().getColor(mConfig.getContentTextColor()));
        tv.setGravity(mConfig.getGravity());

        LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        lp.gravity = mConfig.getLayoutGravity();
        tv.setLayoutParams(lp);

        this.addView(tv);
    }
}
