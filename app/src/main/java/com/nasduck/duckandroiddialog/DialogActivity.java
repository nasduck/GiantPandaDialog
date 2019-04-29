package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.DuckDialog;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onDialogClick(View view) {
        DuckDialog.showDialog(this, "Title Test", "Content Test");
    }

    public void onDialogNoTitleClick(View view) {
        DuckDialog.showDialog(this, "Only content without title");
    }

    public void onSelectDialog(View view) {
        DuckDialog.showClickDialog(this, "Button Test Content");
    }

    public void onTitleSelectDialog(View view) {
        DuckDialog.showClickDialog(this, "Button Test", "Button Test Content");


        /**
        DuckDialog.showDialog(title, content);
        DuckDialog.showDialog(content);

        DuckDialog.showTitleSelectDialog(this,
                "title", "content", "确定", "取消"
                , new OnPositiveClickListener() {
                    @Override
                    public void onPositiveClick() {
                        DuckDialog.showDialog(DialogActivity.this, "确定");
                    }
                }, new OnNegativeClickListener() {
                    @Override
                    public void onNegativeClick() {
                        DuckDialog.showDialog(DialogActivity.this, "取消");
                    }
                });
         **/
    }

    public void onCustomDialog(View view) {
        /**
        DialogController.createTextDialog(this)
                .setTitleTypeface(TextStyle.BOLD)
                .setTitle("1111")
                .showDialog();
         **/
    }
}
