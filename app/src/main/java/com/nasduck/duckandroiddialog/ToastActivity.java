package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.DuckDialog;
import com.nasduck.dialoglib.toast.builder.ToastBuilder;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void onToastDefaultClick(View view) {
        DuckDialog.show(this, "Toast Default");
    }

    public void onImageToastSuccessClick(View view) {
        DuckDialog.showSuccess(this);
    }

    public void onImageToastFailureClick(View view) {
        DuckDialog.showFailure(this);
    }

    public void onImageToastWarningClick(View view) {
        DuckDialog.showWarning(this);
    }

    public void onTextAndImageToastSuccessClick(View view) {
        DuckDialog.showSuccess(this, "success");
    }

    public void onTextAndImageToastFailureClick(View view) {
        DuckDialog.showFailure(this, "failure");
    }

    public void onTextAndImageToastWarningClick(View view) {
        DuckDialog.showWarning(this, "warning");
    }

    public void onTextAndImageToastLoadingClick(View view) {
        DuckDialog.showLoading(this);
    }

    public void onHideLoadingToastClick(View view) {
        // todo
    }

    public void onToastCustomClick(View view) {
        ToastBuilder.getInstance(this)
                .setText("hello world!")
                .show(3000);
    }
}
