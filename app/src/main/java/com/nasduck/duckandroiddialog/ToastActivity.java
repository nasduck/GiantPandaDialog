package com.nasduck.duckandroiddialog;

import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.toast.controller.ToastController;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void onToastDefaultClick(View view) {
        DuckDialog.showToast(this, "Toast Default");
    }

    public void onImageToastSuccessClick(View view) {
        DuckDialog.showSuccessToast(this);
    }

    public void onImageToastFailureClick(View view) {
        DuckDialog.showFailureToast(this);
    }

    public void onImageToastWarningClick(View view) {
        DuckDialog.showWarningToast(this);
    }

    public void onTextAndImageToastSuccessClick(View view) {
        DuckDialog.showSuccessTextToast(this, "success");
    }

    public void onTextAndImageToastFailureClick(View view) {
        DuckDialog.showFailureTextToast(this, "failure");
    }

    public void onTextAndImageToastWarningClick(View view) {
        DuckDialog.showWarningTextToast(this, "warning");
    }

    public void onTextAndImageToastLoadingClick(View view) {
        DuckDialog.showLoadingToast(this);
    }

    public void onHideLoadingToastClick(View view) {
        DuckDialog.hideLoadingToast(ToastActivity.this);
    }

    public void onToastCustomClick(View view) {
        ToastController.createTextToast(this)
                .setText("hello world!")
                .show(5000);

    }
}
