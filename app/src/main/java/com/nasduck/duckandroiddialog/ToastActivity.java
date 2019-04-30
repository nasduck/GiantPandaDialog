package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.toastlib.DuckToast;
import com.nasduck.toastlib.builder.impl.ToastBuilder;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void onDefaultClick(View view) {
        DuckToast.show(this, "Toast Default");
    }

    public void onSuccessClick(View view) {
        DuckToast.showSuccess(this);
    }

    public void onFailureClick(View view) {
        DuckToast.showFailure(this);
    }

    public void onWarningClick(View view) {
        DuckToast.showWarning(this);
    }

    public void onLoadingClick(View view) {
        DuckToast.showLoading(this);
    }

    public void onSuccessTextClick(View view) {
        DuckToast.showSuccess(this, "success");
    }

    public void onFailureTextClick(View view) {
        DuckToast.showFailure(this, "failure");
    }

    public void onWarningTextClick(View view) {
        DuckToast.showWarning(this, "warning");
    }

    public void onLoadingTextClick(View view) {
        DuckToast.showLoading(this, "loading");
    }

    public void onHideToastClick(View view) {
        ToastBuilder.dismiss();
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
