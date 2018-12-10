package com.nasduck.dialoglib.toast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.nasduck.dialoglib.Base.ConfigName;
import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.config.ToastImageConfigBean;
import com.nasduck.dialoglib.interfaces.BaseDialogFragment;

public class ImageToast extends BaseDialogFragment {

    private FrameLayout mLayoutBackground;
    private ImageView mIvImage;

    private int mImage;

    public ImageToast() {

    }

    public static ImageToast newImageToast(ToastImageConfigBean configBean){
        ImageToast fragment = new ImageToast();
        Bundle args = new Bundle();
        args.putInt(ConfigName.BACKGROUND, configBean.getBackground());
        args.putBoolean(ConfigName.IS_CANCELABLE, configBean.isCancelable());
        args.putBoolean(ConfigName.HAS_SHADE, configBean.isHasShade());
        args.putInt(ConfigName.IMAGE, configBean.getImage());
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
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.toast_image;
    }

    @Override
    protected void initEventAndData() {
        mLayoutBackground = view.findViewById(R.id.background);
        mIvImage = view.findViewById(R.id.iv_image);

        mLayoutBackground.setBackgroundResource(mBackground);
        setShade(hasShade);
        setCancelable(isCancelable);
        mIvImage.setImageDrawable(getResources().getDrawable(mImage));
    }

    @Override
    protected void hide() {
        this.dismiss();
    }
}
