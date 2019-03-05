package com.nasduck.duckandroiddialog;

import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.controller.DuckDialog;
import com.nasduck.dialoglib.controller.DuckToast;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                ;
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
        DuckDialog.showLoadingTextToast(this, "loading");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DuckDialog.hideLoadingTextToast(ToastActivity.this);
            }
        }, 2000);
    }

    public void onToastCustomClick(View view) {
//        ToastBuilder.create(this)
//                .setText("Toast Customized")
//                .setTextSize(16)
//                .setTextColor(android.R.color.holo_orange_dark)
//                .setBackgroundColor(android.R.color.holo_green_light)
//                .setCornerRadius(10)
//                .setPaddingHorizontal(64)
//                .setPaddingVertical(32)
//                .setDelay(3000)
//                .show(true);

//        ToastConfig config = new TextToastBuilder().build();
//        TextToast.create(config).show(this.getSupportFragmentManager(), "");

        DuckToast.createTextToast(this)
                .setText("hello world!")
                .show(5000);

    }
}
