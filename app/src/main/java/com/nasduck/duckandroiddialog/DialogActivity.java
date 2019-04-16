package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.DuckDialog;
import com.nasduck.dialoglib.dialog.interfaces.OnNegativeClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnNormalClickListener;
import com.nasduck.dialoglib.dialog.interfaces.OnPositiveClickListener;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onDialogClick(View view) {
        DuckDialog.showDialog(this, "Title Test", "Content Test");
        /**
        DuckDialog.showNoTitleTipDialog(this, "content", "确定",
                new OnNormalClickListener() {
                    @Override
                    public void onNormalClick() {
                        DuckDialog.showDialog(DialogActivity.this, "我被点击了");
                    }
                });
         **/
    }

    public void onDialogNoTitleClick(View view) {
        DuckDialog.showDialog(this, "Only content without title");
    }

    public void onSelectDialog(View view) {
        DuckDialog.showNoTitleSelectDialog(this,
                "content", "确定", "取消"
                , new OnPositiveClickListener() {
                    @Override
                    public void onPositiveClick() {
                        DuckDialog.show(DialogActivity.this, "确定");
                    }
                }, new OnNegativeClickListener() {
                    @Override
                    public void onNegativeClick() {
                        DuckDialog.show(DialogActivity.this, "取消");
                    }
                });
    }

    public void onTitleSelectDialog(View view) {

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
