package com.nasduck.duckandroiddialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nasduck.dialoglib.controller.DialogController;
import com.nasduck.dialoglib.controller.DuckDialog;
import com.nasduck.dialoglib.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.interfaces.OnPositiveClickListener;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class TestActivity extends AppCompatActivity {

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUnbinder = ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null && mUnbinder != Unbinder.EMPTY) {
            mUnbinder.unbind();
        }
    }

    @OnClick(R.id.btn_toast_default_type)
    public void onToastDefaultTypeClick() {
        Intent intentToToastDefaultType = new Intent(this, ToastActivity.class);
        startActivity(intentToToastDefaultType);
    }

    @OnClick(R.id.btn_tip_dialog)
    public void onTipDialog() {
        DuckDialog.showNoTitleTipDialog(this, "content", "确定",
                new OnNormalClickListener() {
                    @Override
                    public void onNormalClick() {
                        DuckDialog.showToast(TestActivity.this, "我被点击了");
                    }
                });
    }

    @OnClick(R.id.btn_title_tip_dialog)
    public void onTitleTipDialog() {
        DuckDialog.showTitleTipDialog(this, "title", "content", "确定",
                new OnNormalClickListener() {
                    @Override
                    public void onNormalClick() {
                        DuckDialog.showToast(TestActivity.this, "我被点击了");
                    }
                });
    }

    @OnClick(R.id.btn_select_dialog)
    public void onSelectDialog() {
        DuckDialog.showNoTitleSelectDialog(this,
                "content", "确定", "取消"
                , new OnPositiveClickListener() {
                    @Override
                    public void onPositiveClick() {
                        DuckDialog.showToast(TestActivity.this, "确定");
                    }
                }, new OnNegativeClickListener() {
                    @Override
                    public void onNegativeClick() {
                        DuckDialog.showToast(TestActivity.this, "取消");
                    }
                });
    }

    @OnClick(R.id.btn_title_select_dialog)
    public void onTitleSelectDialog() {
        DuckDialog.showTitleSelectDialog(this,
                "title", "content", "确定", "取消"
                , new OnPositiveClickListener() {
                    @Override
                    public void onPositiveClick() {
                        DuckDialog.showToast(TestActivity.this, "确定");
                    }
                }, new OnNegativeClickListener() {
                    @Override
                    public void onNegativeClick() {
                        DuckDialog.showToast(TestActivity.this, "取消");
                    }
                });
    }

    @OnClick(R.id.btn_custom_dialog)
    public void onCustomDialog() {
        DialogController.createTextDialog(this)
                .setTitle("1111")
                .show();
    }

}
