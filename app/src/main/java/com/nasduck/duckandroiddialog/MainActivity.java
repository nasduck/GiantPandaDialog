package com.nasduck.duckandroiddialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

//    @OnClick(R.id.btn_toast_text)
//    public void onTextToast() {
//        DuckDialog.assignTextToast("hello world!!")
//                .setCancelable(true)
//                .buildTextToast()
//                .show(getSupportFragmentManager(), "");
//    }
//
//    @OnClick(R.id.btn_toast_image)
//    public void onImageToast() {
//        DuckDialog.assignImageToast()
//                .setCancelable(true)
//                .buildImageToast()
//                .show(getSupportFragmentManager(), "");
//    }
//
//    @OnClick(R.id.btn_toast_text_image)
//    public void onTextImageToast() {
//        DuckDialog.assignTextAndImageToast("hello world!!")
//                .setCancelable(true)
//                .buildTextImageToast()
//                .show(getSupportFragmentManager(), "");
//    }
}
