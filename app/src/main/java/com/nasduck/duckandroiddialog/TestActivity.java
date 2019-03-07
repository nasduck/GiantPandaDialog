package com.nasduck.duckandroiddialog;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.builder.dialog.OneButtonFooterBuilder;
import com.nasduck.dialoglib.builder.dialog.TextBodyBuilder;
import com.nasduck.dialoglib.controller.DuckDialog;
import com.nasduck.dialoglib.dialog.BaseDialog;
import com.nasduck.dialoglib.base.IDialogView;
import com.nasduck.dialoglib.builder.dialog.TextHeaderBuilder;

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
        DuckDialog.showTitleTipDialog(this);
    }

    @OnClick(R.id.btn_title_tip_dialog)
    public void onTitleTipDialog() {

    }

    @OnClick(R.id.btn_select_dialog)
    public void onSelectDialog() {

    }

    @OnClick(R.id.btn_title_select_dialog)
    public void onTitleSelectDialog() {

    }
}
