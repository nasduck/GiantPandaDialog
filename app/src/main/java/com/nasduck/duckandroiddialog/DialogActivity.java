package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nasduck.dialoglib.DuckDialog;
import com.nasduck.dialoglib.base.enums.ButtonStyle;
import com.nasduck.dialoglib.dialog.config.DialogBtnConfig;
import com.nasduck.dialoglib.dialog.view.DialogButton;


public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onTipDialogClick(View view) {
        DuckDialog.showDialog(this, "Title Test", "Content Test", ButtonStyle.DEFAULT);
    }

    public void onTitleTipDialogClick(View view) {
        DuckDialog.showDialog(this, "Only content without title", ButtonStyle.DEFAULT);
    }

    public void onSelectDialogClick(View view) {
        DialogButton btnNegative = new DialogButton(this,
                getResources().getString(R.string.negative_button_text),
                ButtonStyle.CANCEL,
                new DialogBtnConfig.OnButtonClickListener() {
                    @Override
                    public void onButtonClick() {
                        Toast.makeText(DialogActivity.this, "cancel", Toast.LENGTH_SHORT).show();
                    }
        });
        DialogButton btnPositive = new DialogButton(this,
                getResources().getString(R.string.positive_button_text),
                new DialogBtnConfig.OnButtonClickListener() {
                    @Override
                    public void onButtonClick() {
                        Toast.makeText(DialogActivity.this, "sure", Toast.LENGTH_SHORT).show();
                    }
                });
        DuckDialog.showDialog(this, "Button Test Content", btnNegative, btnPositive);
    }

    public void onTitleSelectDialogClick(View view) {
        DialogButton btnNegative = new DialogButton(this);
        btnNegative.setText(R.string.negative_button_text);
        btnNegative.setStyle(ButtonStyle.CANCEL);
        btnNegative.setListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onButtonClick() {
                Toast.makeText(DialogActivity.this, "cancel", Toast.LENGTH_SHORT).show();
            }
        });
        DialogButton btnPositive = new DialogButton(this);
        btnPositive.setText(R.string.positive_button_text);
        btnPositive.setListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onButtonClick() {
                Toast.makeText(DialogActivity.this, "cancel", Toast.LENGTH_SHORT).show();
            }
        });
        DuckDialog.showDialog(this, "Title Test", "Button Test Content", btnNegative, btnPositive);
    }

    public void onCustomDialogClick(View view) {

    }
}
