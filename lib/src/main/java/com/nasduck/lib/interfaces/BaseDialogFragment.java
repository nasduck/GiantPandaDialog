package com.nasduck.lib.interfaces;



public abstract class BaseDialogFragment extends DialogFragment {

    protected Context mContext;
    private Unbinder mUnbinder;

    protected int mBackground;
    protected boolean isCancelable;
    protected boolean hasShade;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // 绑定View
        View view = inflater.inflate(getLayoutId(), container);

        // 去除对话框默认标题栏
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);

        // 激活 ButterKnife
        mUnbinder = ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 初始化事件和获取数据
        initEventAndData();
    }

    @Override
    public void onAttach(Context context) {
        this.mContext = context;
        super.onAttach(context);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // fragment 必须解绑
        mUnbinder.unbind();
    }

    /**
     * 设置阴影
     * @param hasShade
     */
    public void setShade(boolean hasShade) {
        if (hasShade) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        } else {
            getDialog().getWindow().setDimAmount(0f);
        }
    }

    /**
     * 获取Dialog页面视图
     * @return
     */
    protected abstract int getLayoutId();

    /**
     * 初始化Dialog事件和数据
     */
    protected abstract void initEventAndData();

    /**
     * 隐藏Dialog
     */
    protected abstract void hide();

}
