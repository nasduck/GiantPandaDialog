package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.base.DuckDialogType;
import com.nasduck.dialoglib.builder.ToastBuilder;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

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

    public void onToastCustomClick(View view) {
        ToastBuilder.create(this)
                .setText("Toast Customized")
                .setTextSize(16)
                .setTextColor(android.R.color.holo_orange_dark)
                .setBackgroundColor(android.R.color.holo_green_light)
                .setCornerRadius(10)
                .setPaddingHorizontal(64)
                .setPaddingVertical(32)
                .setDelay(3000)
                .show();
    }
}
