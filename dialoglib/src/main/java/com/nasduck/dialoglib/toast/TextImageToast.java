package com.nasduck.dialoglib.toast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.Base.ConfigName;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.ToastTextAndImageConfigBean;
import com.nasduck.dialoglib.interfaces.BaseDialogFragment;

public class TextImageToast extends BaseDialogFragment {

    private LinearLayout mLayoutBackground;
    private ImageView mIvImage;
    private TextView mTvContent;

    private int mImage;
    private String mContentText;
    private int mContentTextColor;
    private int mContentTextSize;

    public TextImageToast(){

    }

    public static TextImageToast newTextToast(ToastTextAndImageConfigBean configBean){
        TextImageToast fragment = new TextImageToast();
        Bundle args = new Bundle();
        args.putInt(ConfigName.BACKGROUND, configBean.getBackground());
        args.putBoolean(ConfigName.IS_CANCELABLE, configBean.isCancelable());
        args.putBoolean(ConfigName.HAS_SHADE, configBean.isHasShade());
        args.putInt(ConfigName.IMAGE, configBean.getImage());
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
            mImage = getArguments().getInt(ConfigName.IMAGE);
            mContentText = getArguments().getString(ConfigName.CONTENT_TEXT);
            mContentTextColor = getArguments().getInt(ConfigName.CONTENT_TEXT_COLOR);
            mContentTextSize = getArguments().getInt(ConfigName.CONTENT_TEXT_SIZE);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.toast_text_image;
    }

    @Override
    protected void initEventAndData() {
        mLayoutBackground = view.findViewById(R.id.background);
        mIvImage = view.findViewById(R.id.iv_image);
        mTvContent = view.findViewById(R.id.tv_content);

        mLayoutBackground.setBackgroundResource(mBackground);
        setCancelable(isCancelable);
        setShade(hasShade);
        mTvContent.setText(mContentText);
        mTvContent.setTextColor(getResources().getColor(mContentTextColor));
        mTvContent.setTextSize(mContentTextSize);
        mIvImage.setImageDrawable(getResources().getDrawable(mImage));
    }

    @Override
    protected void hide() {
        this.dismiss();
    }
}
