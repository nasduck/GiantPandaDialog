package com.nasduck.duckandroiddialog;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.nasduck.dialoglib.Base.DuckDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_toast_text)
    public void onTextToast() {
        DuckDialog.assignTextToast("hello world!!")
                .setCancelable(true)
                .show(this);
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
                .show(this);

    }
}
