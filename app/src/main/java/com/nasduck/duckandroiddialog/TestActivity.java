package com.nasduck.duckandroiddialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.dialog.NoTitleSelectDialog;
import com.nasduck.dialoglib.dialog.NoTitleTipDialog;
import com.nasduck.dialoglib.dialog.TitleSelectDialog;
import com.nasduck.dialoglib.dialog.TitleTipDialog;

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

    @OnClick(R.id.btn_toast_image)
    public void onImageToast() {
        DuckDialog.assignImageToast()
                .setCancelable(true)
                .setHasShade(true)
                .show(this, "image");
    }

    @OnClick(R.id.btn_toast_image_success)
    public void onImageToastSuccess() {
        DuckDialog.assignImageToast(DuckDialog.SUCCESS).show(this);
    }

    @OnClick(R.id.btn_toast_image_warning)
    public void onImageToastWarning() {
        DuckDialog.assignImageToast(DuckDialog.WARNING).show(this);
    }

    @OnClick(R.id.btn_toast_image_failure)
    public void onImageToastFailure() {
        DuckDialog.assignImageToast(DuckDialog.FAILURE).show(this);
    }

    @OnClick(R.id.btn_toast_text_image)
    public void onTextImageToast() {
        DuckDialog.assignTextAndImageToast("hello world!!")
                .setCancelable(true)
                .show(this, "");
    }

    @OnClick(R.id.btn_tip_dialog)
    public void onTipDialog() {
        DuckDialog.assignNoTitleTipDialog("hello world!!",
                new NoTitleTipDialog.onSureClickListener() {
                    @Override
                    public void onSureClick() {
                        Log.d("111111", "确定了！！！");
                    }
                })
                .show(this, "");
    }

    @OnClick(R.id.btn_title_tip_dialog)
    public void onTitleTipDialog() {
        DuckDialog.assignTitleTipDialog("title", "hello world!!",
                new TitleTipDialog.onSureClickListener() {
                    @Override
                    public void onSureClick() {
                        Log.d("111111", "确定了！！！");
                    }
                })
                .show(this, "");
    }

    @OnClick(R.id.btn_select_dialog)
    public void onSelectDialog() {
        DuckDialog.assignNoTitleSelectDialog("hello world!!",
                new NoTitleSelectDialog.onSelectClickListener() {
                    @Override
                    public void onPositiveClick() {
                        Log.d("111111", "确定了！！！");
                    }

                    @Override
                    public void onNegativeClick() {
                        Log.d("111111", "取消了！！！");
                    }
                })
                .show(this, "");
    }

    @OnClick(R.id.btn_title_select_dialog)
    public void onTitleSelectDialog() {
        DuckDialog.assignTitleSelectDialog("title", "hello world!!"
                , new TitleSelectDialog.onSelectClickListener() {
                    @Override
                    public void onPositiveClick() {
                        Log.d("111111", "确定了！！！");
                    }

                    @Override
                    public void onNegativeClick() {
                        Log.d("111111", "取消了！！！");
                    }
                })
                .show(this, "");
    }
}
