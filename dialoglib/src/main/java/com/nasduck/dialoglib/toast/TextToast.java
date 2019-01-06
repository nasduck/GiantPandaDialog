package com.nasduck.dialoglib.toast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.Base.ConfigName;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.ToastTextConfigBean;
import com.nasduck.dialoglib.interfaces.BaseDialogFragment;

public class TextToast extends BaseDialogFragment {

    private TextView mTvContent;
    private FrameLayout mLayoutBackground;

    private String mContentText;
    private int mContentTextColor;
    private int mContentTextSize;

    public TextToast(){

    }

    public static TextToast newTextToast(ToastTextConfigBean configBean){
        TextToast fragment = new TextToast();
        Bundle args = new Bundle();
        args.putInt(ConfigName.BACKGROUND, configBean.getBackground());
        args.putString(ConfigName.CONTENT_TEXT, configBean.getContentText());
        args.putInt(ConfigName.CONTENT_TEXT_COLOR, configBean.getContentTextColor());
        args.putInt(ConfigName.CONTENT_TEXT_SIZE, configBean.getContentTextSize());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.Fragment_dialog_style);
        if (getArguments() != null) {
            mBackground = getArguments().getInt(ConfigName.BACKGROUND);
            mContentText = getArguments().getString(ConfigName.CONTENT_TEXT);
            mContentTextColor = getArguments().getInt(ConfigName.CONTENT_TEXT_COLOR);
            mContentTextSize = getArguments().getInt(ConfigName.CONTENT_TEXT_SIZE);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.toast_text;
    }

    @Override
    protected void initEventAndData() {
        mTvContent = view.findViewById(R.id.tv_content);
        mLayoutBackground = view.findViewById(R.id.background);

        mLayoutBackground.setBackgroundResource(mBackground);
        mTvContent.setText(mContentText);
        mTvContent.setTextColor(getResources().getColor(mContentTextColor));
        mTvContent.setTextSize(mContentTextSize);
    }

    @Override
    protected void hide() {
        this.dismiss();
    }


}
