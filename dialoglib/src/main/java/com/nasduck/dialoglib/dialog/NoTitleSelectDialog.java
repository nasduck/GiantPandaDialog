package com.nasduck.dialoglib.dialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nasduck.dialoglib.base.ConfigName;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.DialogSelectNoTitleConfigBean;
import com.nasduck.dialoglib.base.BaseDialogFragment;
import com.nasduck.dialoglib.utils.DensityUtils;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class NoTitleSelectDialog extends BaseDialogFragment {

    private LinearLayout mLayoutBackground;
    private TextView mTvContent;
    private Button mBtnPositive;
    private Button mBtnNegative;

    private String mContentText;
    private int mContentTextColor;
    private int mContentTextSize;
    private String mPositiveButtonText;
    private int mPositiveButtonTextColor;
    private int mPositiveButtonTextSize;
    private String mNegativeButtonText;
    private int mNegativeButtonTextColor;
    private int mNegativeButtonTextSize;

    private onSelectClickListener listener;

    public interface onSelectClickListener{
        void onPositiveClick();
        void onNegativeClick();
    }

    public NoTitleSelectDialog() {
    }

    public static NoTitleSelectDialog newNoTitleTipDialog(DialogSelectNoTitleConfigBean configBean){
        NoTitleSelectDialog fragment = new NoTitleSelectDialog();
        Bundle args = new Bundle();
        args.putInt(ConfigName.BACKGROUND, configBean.getBackground());
        args.putBoolean(ConfigName.IS_CANCELABLE, configBean.isCancelable());
        args.putBoolean(ConfigName.HAS_SHADE, configBean.isHasShade());
        args.putString(ConfigName.CONTENT_TEXT, configBean.getContentText());
        args.putInt(ConfigName.CONTENT_TEXT_COLOR, configBean.getContentTextColor());
        args.putInt(ConfigName.CONTENT_TEXT_SIZE, configBean.getContentTextSize());
        args.putString(ConfigName.POSITIVE_BUTTON_TEXT, configBean.getPositiveButtonText());
        args.putInt(ConfigName.POSITIVE_BUTTON_TEXT_SIZE, configBean.getPositiveButtonTextSize());
        args.putInt(ConfigName.POSITIVE_BUTTON_TEXT_COLOR, configBean.getPositiveButtonTextColor());
        args.putString(ConfigName.NEGATIVE_BUTTON_TEXT, configBean.getNegativeButtonText());
        args.putInt(ConfigName.NEGATIVE_BUTTON_TEXT_COLOR, configBean.getNegativeButtonTextColor());
        args.putInt(ConfigName.NEGATIVE_BUTTON_TEXT_SIZE, configBean.getNegativeButtonTextSize());
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
            mPositiveButtonText = getArguments().getString(ConfigName.POSITIVE_BUTTON_TEXT);
            mPositiveButtonTextColor = getArguments().getInt(ConfigName.POSITIVE_BUTTON_TEXT_COLOR);
            mPositiveButtonTextSize = getArguments().getInt(ConfigName.POSITIVE_BUTTON_TEXT_SIZE);
            mNegativeButtonText = getArguments().getString(ConfigName.NEGATIVE_BUTTON_TEXT);
            mNegativeButtonTextColor = getArguments().getInt(ConfigName.NEGATIVE_BUTTON_TEXT_COLOR);
            mNegativeButtonTextSize = getArguments().getInt(ConfigName.NEGATIVE_BUTTON_TEXT_SIZE);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        getDialog().getWindow().setLayout(DensityUtils.dp2px(mContext, 280), WRAP_CONTENT);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.dialog_select_no_title;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mLayoutBackground = view.findViewById(R.id.background);
        mTvContent = view.findViewById(R.id.tv_content);
        mBtnPositive = view.findViewById(R.id.btn_positive);
        mBtnNegative = view.findViewById(R.id.btn_negative);

        mLayoutBackground.setBackgroundResource(mBackground);
        setCancelable(isCancelable);
        setShade(hasShade);
        mTvContent.setText(mContentText);
        mTvContent.setTextColor(getResources().getColor(mContentTextColor));
        mTvContent.setTextSize(mContentTextSize);
        mBtnPositive.setText(mPositiveButtonText);
        mBtnPositive.setTextColor(getResources().getColor(mPositiveButtonTextColor));
        mBtnPositive.setTextSize(mPositiveButtonTextSize);
        mBtnPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onPositiveClick();
                    hide();
                }
            }
        });
        mBtnNegative.setText(mNegativeButtonText);
        mBtnNegative.setTextColor(getResources().getColor(mNegativeButtonTextColor));
        mBtnNegative.setTextSize(mNegativeButtonTextSize);
        mBtnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onNegativeClick();
                    hide();
                }
            }
        });
    }

    @Override
    protected void hide() {
        this.dismiss();
    }

    public NoTitleSelectDialog setOnSelectClickListener(onSelectClickListener listener) {
        this.listener = listener;
        return this;
    }
}
