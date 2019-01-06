package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nasduck.dialoglib.Base.DuckDialog;
import com.nasduck.dialoglib.Base.DuckDialogType;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class ToastActivity extends AppCompatActivity {

    private Unbinder mUnBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        mUnBinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnBinder != null && mUnBinder != Unbinder.EMPTY) {
            mUnBinder.unbind();
        }
    }

    @OnClick(R.id.btn_toast_black)
    public void onBlackToastClick() {
        DuckDialog.assignTextToast(DuckDialogType.TOAST_BLACK, "Hello world!!!")
                .show(this);
    }
}
