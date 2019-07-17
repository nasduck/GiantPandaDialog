package com.zoopark.dialog.view;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.zoopark.dialog.R;
import com.zoopark.dialog.utils.DensityUtils;

public class DialogHtmlBody extends DialogBody {

    private ImageView mIvTop;
    private FrameLayout mBackgroundText;
    private TextView mTvContentHtml;

    private DialogHtmlBody(Context context) {
        super(context);
    }

    public static DialogHtmlBody create(Context context) {
        return new DialogHtmlBody(context);
    }

    @Override
    public int initLayout() {
        return R.layout.layout_content_html;
    }

    @Override
    public void initUI(View view) {
        mIvTop = view.findViewById(R.id.image_top);
        mBackgroundText = view.findViewById(R.id.background_text);
        mTvContentHtml = view.findViewById(R.id.tv_content_html);
    }

    public DialogHtmlBody setTopImage(int imageId) {
        mIvTop.setImageResource(imageId);
        return this;
    }

    public DialogHtmlBody setHtmlContent(String html) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            mTvContentHtml.setText(Html.fromHtml(html, Html.FROM_HTML_MODE_COMPACT));
        } else {
            mTvContentHtml.setText(Html.fromHtml(html));
        }
        return this;
    }

    public DialogHtmlBody setTextPadding(int left, int top, int right, int bottom) {
        mTvContentHtml.setPadding(DensityUtils.dp2px(getContext(), left),
                DensityUtils.dp2px(getContext(), top),
                DensityUtils.dp2px(getContext(), right),
                DensityUtils.dp2px(getContext(), bottom));
        return this;
    }

    public DialogHtmlBody setTextBackgroundColor(int color) {
        mBackgroundText.setBackgroundColor(getResources().getColor(color));
        return this;
    }
}
