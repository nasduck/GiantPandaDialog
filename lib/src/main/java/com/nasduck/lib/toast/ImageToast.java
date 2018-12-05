package com.nasduck.lib.toast;

import com.nasduck.lib.Base.ConfigName;
import com.nasduck.lib.config.ImageToastConfigBean;
import com.nasduck.lib.interfaces.BaseDialogFragment;
import com.sun.istack.internal.Nullable;

import javax.swing.text.html.ImageView;

import butterknife.BindView;

public class ImageToast extends BaseDialogFragment {

    @BindView(R.id.background) FrameLayout mLayoutBackground;
    @BindView(R.id.iv_image) ImageView mIvImage;

    private int mImage;

    public ImageToast() {

    }

    public static ImageToast newImageToast(ImageToastConfigBean configBean){
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
