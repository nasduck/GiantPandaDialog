package com.nasduck.dialoglib.dialog.composition.footer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.AppCompatTextView;

import com.nasduck.dialoglib.dialog.config.DialogBtnConfig;

public class DialogButton extends AppCompatTextView {

    private DialogBtnConfig config;

    public DialogButton(Context context) {
        super(context);
        config = DialogBtnConfig.newInstance();
        init();
    }

    private void init() {

        this.setText(config.getText());
        this.setTextColor(getResources().getColor(config.getTextColor()));
        this.setTextSize(config.getTextSize());
        this.setClickable(true);
        this.setGravity(config.getGravity());

        GradientDrawable drawablePressed = new GradientDrawable();
        drawablePressed.setColor(getResources().getColor(config.getBgColorPressed()));

        GradientDrawable drawableNormal = new GradientDrawable();
        drawableNormal.setColor(getResources().getColor(config.getBgColor()));

        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawablePressed);
        stateListDrawable.addState(new int[]{}, drawableNormal);

        this.setBackground(stateListDrawable);
    }
}
