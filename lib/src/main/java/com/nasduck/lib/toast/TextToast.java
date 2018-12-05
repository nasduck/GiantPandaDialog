package com.nasduck.lib.toast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.redrain.dialogapplication.Base.ConfigName;
import com.example.redrain.dialogapplication.R;
import com.example.redrain.dialogapplication.config.TextToastConfigBean;
import com.example.redrain.dialogapplication.interfaces.BaseDialogFragment;

import butterknife.BindView;

public class TextToast extends BaseDialogFragment{

    @BindView(R.id.tv_content) TextView mTvContent;
    @BindView(R.id.background) FrameLayout mLayoutBackground;

    private String mContentText;
    private int mContentTextColor;
    private int mContentTextSize;

    public TextToast(){

    }

    public static TextToast newTextToast(TextToastConfigBean configBean){
        TextToast fragment = new TextToast();
        Bundle args = new Bundle();
        args.putInt(ConfigName.BACKGROUND, configBean.getBackground());
        args.putBoolean(ConfigName.IS_CANCELABLE, configBean.isCancelable());
        args.putBoolean(ConfigName.HAS_SHADE, configBean.isHasShade());
        args.putString(ConfigName.CONTENT_TEXT, configBean.getContentText());
        args.putInt(ConfigName.CONTENT_TEXT_COLOR, configBean.getContentTextColor());
        args.putInt(ConfigName.CONTENT_TEXT_SIZE, configBean.getContentTextSize());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mBackground = getArguments().getInt(ConfigName.BACKGROUND);
            isCancelable = getArguments().getBoolean(ConfigName.IS_CANCELABLE);
            hasShade = getArguments().getBoolean(ConfigName.HAS_SHADE);
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
        mLayoutBackground.setBackgroundResource(mBackground);
        setCancelable(isCancelable);
        setShade(hasShade);
        mTvContent.setText(mContentText);
        mTvContent.setTextColor(getResources().getColor(mContentTextColor));
        mTvContent.setTextSize(mContentTextSize);
    }

    @Override
    protected void hide() {
        this.dismiss();
    }


}
