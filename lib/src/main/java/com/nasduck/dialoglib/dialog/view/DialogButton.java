package com.nasduck.dialoglib.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.AppCompatTextView;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.dialog.config.ButtonStyle;
import com.nasduck.dialoglib.dialog.config.DialogBtnConfig;
import com.nasduck.dialoglib.utils.DensityUtils;

public class DialogButton extends AppCompatTextView {

    private DialogBtnConfig mConfig;
    private Context mContext;

    private GradientDrawable drawablePressed;
    private GradientDrawable drawableNormal;
    private StateListDrawable stateListDrawable;

    public DialogButton(Context context) {
        super(context);
        mConfig = DialogBtnConfig.newInstance();
        mContext = context;
        init(context);
    }

    public DialogButton(Context context, DialogBtnConfig config) {
        super(context);
        mConfig = config;
        mContext = context;
        init(context);
    }

    public DialogButton(Context context, String text) {
        super(context);
        mConfig = DialogBtnConfig.newInstance();
        mConfig.setText(text);
        mContext = context;
        init(context);
    }

    public DialogButton(Context context, String text, ButtonStyle style) {
        super(context);
        mConfig = DialogBtnConfig.newInstance();
        mConfig.setText(text);
        mConfig.setStyle(style);
        mContext = context;
        init(context);
    }

    public DialogButton(Context context, String text, DialogBtnConfig.OnButtonClickListener listener) {
        super(context);
        mConfig = DialogBtnConfig.newInstance();
        mConfig.setText(text);
        mConfig.setListener(listener);
        mContext = context;
        init(context);
    }

    public DialogButton(Context context, String text, ButtonStyle style, DialogBtnConfig.OnButtonClickListener listener) {
        super(context);
        mConfig = DialogBtnConfig.newInstance();
        mConfig.setText(text);
        mConfig.setStyle(style);
        mConfig.setListener(listener);
        mContext = context;
        init(context);
    }

    private void init(Context context) {

        this.setHeight(DensityUtils.dp2px(context, mConfig.getButtonHeight()));
        this.setText(mConfig.getText());
        this.setTextColor(getResources().getColor(mConfig.getTextColor()));
        this.setTextSize(mConfig.getTextSize());
        this.setClickable(true);
        this.setGravity(mConfig.getGravity());
        this.setStyle(mConfig.getStyle());

        drawablePressed = new GradientDrawable();
        drawablePressed.setColor(getResources().getColor(mConfig.getBgColorPressed()));

        drawableNormal = new GradientDrawable();
        drawableNormal.setColor(getResources().getColor(mConfig.getBgColor()));

        stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawablePressed);
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, drawablePressed);
        stateListDrawable.addState(new int[]{}, drawableNormal);

        this.setBackground(stateListDrawable);
    }

    /**
     * set last button corner radius
     * @param cornerRadius
     */
    private void setCornerRadiusLast(int cornerRadius) {
        float[] corners = new float[]{
                0, 0,
                0, 0,
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius),
                0, 0};
        drawableNormal.setCornerRadii(corners);
        drawablePressed.setCornerRadii(corners);
        this.setBackground(stateListDrawable);
    }

    /**
     * set normal button corner radius
     * @param cornerRadius
     */
    private void setCornerRadiusOnly(int cornerRadius) {
        float[] corners = new float[]{
                0, 0,
                0, 0,
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius),
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius)};
        drawableNormal.setCornerRadii(corners);
        drawablePressed.setCornerRadii(corners);
        this.setBackground(stateListDrawable);
    }

    /**
     * set first button corner radius
     * @param cornerRadius
     */
    private void setCornerRadiusFirst(int cornerRadius) {
        float[] corners = new float[]{
                0, 0,
                0, 0,
                0, 0,
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius)};
        drawableNormal.setCornerRadii(corners);
        drawablePressed.setCornerRadii(corners);
        this.setBackground(stateListDrawable);
    }

    /**
     * set button click listener
     * @param listener
     */
    public void setClickListener(DialogBtnConfig.OnButtonClickListener listener) {
        mConfig.setListener(listener);
    }

    /**
     * set button text style
     * @param style
     */
    public void setStyle(ButtonStyle style) {
        switch (style) {
            case DEFAULT:
                this.setTextColor(getResources().getColor(mConfig.getTextColor()));
                this.setTypeface(Typeface.DEFAULT);
                break;
            case DESTRUCTIVE:
                this.setTextColor(getResources().getColor(R.color.text_red));
                this.setTypeface(Typeface.DEFAULT);
                break;
            case CANCEL:
                this.setTextColor(getResources().getColor(R.color.text_gray));
                this.setTypeface(Typeface.DEFAULT);
                break;
        }
    }

    public DialogBtnConfig getConfig() {
        return mConfig;
    }
}
