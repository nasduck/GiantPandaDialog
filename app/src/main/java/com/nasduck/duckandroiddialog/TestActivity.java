package com.nasduck.duckandroiddialog;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
                .setCancelable(false)
                .setHasShade(true)
                .show(this, "image");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("111111", "11");
                DuckDialog.hide(TestActivity.this, "image");
            }
        }, 5000);
    }

    @OnClick(R.id.btn_toast_text_image)
    public void onTextImageToast() {
        DuckDialog.assignTextAndImageToast("hello world!!")
                .setCancelable(true)
                .show(this);

    }
}
