package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.DuckDialog;
import com.nasduck.dialoglib.base.enums.ButtonStyle;
import com.nasduck.dialoglib.dialog.config.DialogBtnConfig;
import com.nasduck.dialoglib.dialog.view.DialogButton;
import com.nasduck.dialoglib.toast.builder.impl.ToastBuilder;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onDialogClick(View view) {
        DuckDialog.showDialog(this, "Title Test", "Content Test", ButtonStyle.DEFAULT);
    }

    public void onDialogNoTitleClick(View view) {
        DuckDialog.showDialog(this, "Only content without title", ButtonStyle.DEFAULT);
    }

    public void onSelectDialog(View view) {
        DialogButton btnNegative = new DialogButton(this, getResources().getString(R.string.negative_button_text), ButtonStyle.CANCEL);
        btnNegative.setListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onButtonClick() {
                ToastBuilder.getInstance(DialogActivity.this).setText("cancel").show();
                ToastBuilder.dismiss(1500);
            }
        });
        DialogButton btnPositive = new DialogButton(this);
        btnPositive.setText(R.string.positive_button_text);
        btnPositive.setListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onButtonClick() {
                ToastBuilder.getInstance(DialogActivity.this).setText("sure").show();
                ToastBuilder.dismiss(1500);
            }
        });
        DuckDialog.showDialog(this, "Button Test Content", btnNegative, btnPositive);
    }

    public void onTitleSelectDialog(View view) {
        DialogButton btnNegative = new DialogButton(this);
        btnNegative.setText(R.string.negative_button_text);
        btnNegative.setStyle(ButtonStyle.CANCEL);
        btnNegative.setListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onButtonClick() {
                ToastBuilder.getInstance(DialogActivity.this).setText("cancel").show();
                ToastBuilder.dismiss(1500);
            }
        });
        DialogButton btnPositive = new DialogButton(this);
        btnPositive.setText(R.string.positive_button_text);
        btnPositive.setListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onButtonClick() {
                ToastBuilder.getInstance(DialogActivity.this).setText("sure").show();
                ToastBuilder.dismiss(1500);
            }
        });
        DuckDialog.showDialog(this, "Title Test", "Button Test Content", btnNegative, btnPositive);
    }

    public void onCustomDialog(View view) {

    }
}
