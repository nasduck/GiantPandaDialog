package com.zoopark.dialog.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.zoopark.dialog.R;
import com.zoopark.dialog.config.BodyConfig;
import com.zoopark.dialog.utils.DensityUtils;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public class DialogBody extends FrameLayout {

    private BodyConfig mConfig;
    private Context mContext;

    public static DialogBody create(Context context, BodyConfig config) {
        return new DialogBody(context, config);
    }

    public DialogBody(Context context, BodyConfig config) {
        super(context);
        mConfig = config;
        mContext = context;
        init(context);
    }

    private void init(Context context) {

        this.setBackgroundResource(mConfig.getBgColor());

        TextView tv = new TextView(context);
        tv.setText(mConfig.getContent());
        tv.setTextSize(mConfig.getContentTextSize());
        tv.setTextColor(getResources().getColor(mConfig.getContentTextColor()));
        tv.setGravity(mConfig.getGravity());

        // LayoutGravity
        LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        lp.gravity = mConfig.getLayoutGravity();
        tv.setLayoutParams(lp);

        // Padding
        tv.setPadding(DensityUtils.dp2px(context, mConfig.getPaddingLeft()),
                DensityUtils.dp2px(context, mConfig.getPaddingTop()),
                DensityUtils.dp2px(context, mConfig.getPaddingRight()),
                DensityUtils.dp2px(context, mConfig.getPaddingBottom()));

        this.addView(tv);

        this.addBottomDivider();
    }

    public void setCornerRadius(int cornerRadius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadii(new float[]{
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius),
                DensityUtils.dp2px(mContext, cornerRadius), DensityUtils.dp2px(mContext, cornerRadius),
                0, 0,
                0, 0});
        drawable.setColor(getResources().getColor(mConfig.getBgColor()));
        this.setBackground(drawable);
    }

    public void addBottomDivider() {
        View divider = new View(mContext);
        divider.setBackgroundColor(getResources().getColor(R.color.gray_line));
        LayoutParams lp =
                new LayoutParams(MATCH_PARENT, DensityUtils.dp2px(mContext, 0.5f));
        lp.gravity = Gravity.BOTTOM;
        divider.setLayoutParams(lp);
        this.addView(divider);
    }
}
