package com.nasduck.dialoglib.dialog.composition;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.AppCompatTextView;

import com.nasduck.dialoglib.dialog.config.DialogBtnConfig;
import com.nasduck.dialoglib.utils.DensityUtils;

public class DialogButton extends AppCompatTextView {

    private DialogBtnConfig mConfig;

    public DialogButton(Context context) {
        super(context);
        mConfig = DialogBtnConfig.newInstance();
        init(context);
    }

    private void init(Context context) {

        this.setText(mConfig.getText());
        this.setTextColor(getResources().getColor(mConfig.getTextColor()));
        this.setTextSize(mConfig.getTextSize());
        this.setClickable(true);
        this.setGravity(mConfig.getGravity());

        GradientDrawable drawablePressed = new GradientDrawable();
        drawablePressed.setColor(getResources().getColor(mConfig.getBgColorPressed()));

        GradientDrawable drawableNormal = new GradientDrawable();
        drawableNormal.setColor(getResources().getColor(mConfig.getBgColor()));

        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawablePressed);
        stateListDrawable.addState(new int[]{}, drawableNormal);

        this.setBackground(stateListDrawable);

        // Padding
        this.setPadding(DensityUtils.dp2px(context, mConfig.getPaddingLeft()),
                DensityUtils.dp2px(context, mConfig.getPaddingTop()),
                DensityUtils.dp2px(context, mConfig.getPaddingRight()),
                DensityUtils.dp2px(context, mConfig.getPaddingBottom()));
    }
}
