package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.DuckDialog;
import com.nasduck.dialoglib.toast.builder.impl.ToastBuilder;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void onDefaultClick(View view) {
        DuckDialog.show(this, "Toast Default");
    }

    public void onSuccessClick(View view) {
        DuckDialog.showSuccess(this);
    }

    public void onFailureClick(View view) {
        DuckDialog.showFailure(this);
    }

    public void onWarningClick(View view) {
        DuckDialog.showWarning(this);
    }

    public void onLoadingClick(View view) {
        DuckDialog.showLoading(this);
    }

    public void onSuccessTextClick(View view) {
        DuckDialog.showSuccess(this, "success");
    }

    public void onFailureTextClick(View view) {
        DuckDialog.showFailure(this, "failure");
    }

    public void onWarningTextClick(View view) {
        DuckDialog.showWarning(this, "warning");
    }

    public void onLoadingTextClick(View view) {
        DuckDialog.showLoading(this, "loading");
    }

    public void onHideToastClick(View view) {
        // todo
    }

    public void onToastCustomClick(View view) {
        ToastBuilder.getInstance(this)
                .setText("hello world!")
                .setTextSize(20)
                .setTextColor(android.R.color.holo_red_light)
                .setBgColor(android.R.color.holo_green_light)
                .setCornerRadius(10)
                .setPaddingHorizontal(22)
                .setPaddingVertical(22)
                .show();
        ToastBuilder.dismiss(1500);
    }
}
