package com.zoopark.dialog.view;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.zoopark.dialog.R;
import com.zoopark.dialog.utils.DensityUtils;

public class DialogTextBody extends DialogBody {

    private TextView tvContent;

    private DialogTextBody(Context context) {
        super(context);

    }

    public static DialogTextBody create(Context context) {
        return new DialogTextBody(context);
    }

    @Override
    public int initLayout() {
        return R.layout.layout_content_text;
    }

    @Override
    public void initUI(View view) {
        tvContent = view.findViewById(R.id.text_content);
        tvContent.setText("");
        tvContent.setTextSize(14);
        tvContent.setTextColor(getResources().getColor(R.color.text_black_light));
        tvContent.setGravity(Gravity.CENTER);

        // Padding
        tvContent.setPadding(DensityUtils.dp2px(getContext(), 26),
                DensityUtils.dp2px(getContext(), 16),
                DensityUtils.dp2px(getContext(), 26),
                DensityUtils.dp2px(getContext(), 16));

    }

    public DialogTextBody setContent(String content) {
        tvContent.setText(content);
        return this;
    }

    public DialogTextBody setContentSize(int contentSize) {
        tvContent.setTextSize(contentSize);
        return this;
    }

    public DialogTextBody setContentColor(int contentColor) {
        tvContent.setTextColor(getResources().getColor(contentColor));
        return this;
    }

}
