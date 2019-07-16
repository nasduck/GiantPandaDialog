package com.zoopark.dialog.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.zoopark.dialog.R;
import com.zoopark.dialog.base.IDialogBody;
import com.zoopark.dialog.utils.DensityUtils;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public abstract class DialogBody extends FrameLayout implements IDialogBody {

    private Context mContext;

    public DialogBody(Context context) {
        super(context);
        mContext = context;
        init(context);
    }

    private void init(Context context) {

        View view = LayoutInflater.from(context).inflate(initLayout(), this, false);

        initUI(view);

        this.addView(view);

    }

    public void setCornerRadius(int bgColor, int cornerRadius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadii(new float[]{
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius),
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius),
                0, 0,
                0, 0});
        drawable.setColor(getResources().getColor(bgColor));
        this.setBackground(drawable);
    }

    public void addBottomDivider(boolean isVisible) {
        if (isVisible) {
            View divider = new View(mContext);
            divider.setBackgroundColor(getResources().getColor(R.color.gray_line));
            LayoutParams lp =
                    new LayoutParams(MATCH_PARENT, DensityUtils.dp2px(mContext, 0.5f));
            lp.gravity = Gravity.BOTTOM;
            divider.setLayoutParams(lp);
            this.addView(divider);
        }
    }

}
