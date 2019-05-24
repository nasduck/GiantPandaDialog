package com.nasduck.duckandroiddialog;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.nasduck.dialoglib.GiantPandaDialog;
import com.nasduck.dialoglib.dialog.builder.DialogBodyBuilder;
import com.nasduck.dialoglib.dialog.builder.DialogBuilder;
import com.nasduck.dialoglib.dialog.builder.DialogHeaderBuilder;
import com.nasduck.dialoglib.dialog.config.ButtonStyle;
import com.nasduck.dialoglib.dialog.config.DialogBtnConfig;
import com.nasduck.dialoglib.dialog.view.DialogButton;

import java.time.format.TextStyle;


public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onTipDialogClick(View view) {
        GiantPandaDialog.showDialog(this, "Title Test", "Content Test");
    }

    public void onTitleTipDialogClick(View view) {
        GiantPandaDialog.showDialog(this, "Only content without title");
    }

    public void onSelectDialogClick(View view) {
        DialogButton btnNegative = new DialogButton(this,
                getResources().getString(R.string.negative_button_text),
                ButtonStyle.CANCEL,
                new DialogBtnConfig.OnButtonClickListener() {
                    @Override
                    public void onClick() {
                        Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_SHORT).show();
                    }
        });
        DialogButton btnPositive = new DialogButton(this,
                getResources().getString(R.string.positive_button_text),
                new DialogBtnConfig.OnButtonClickListener() {
                    @Override
                    public void onClick() {
                        Toast.makeText(getApplicationContext(), "sure", Toast.LENGTH_SHORT).show();
                    }
                });
        GiantPandaDialog.showDialog(this, "Button Test Content", btnNegative, btnPositive);
    }

    public void onTitleSelectDialogClick(View view) {
        DialogButton btnNegative = new DialogButton(this);
        btnNegative.setText(R.string.negative_button_text);
        btnNegative.setStyle(ButtonStyle.CANCEL);
        btnNegative.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(DialogActivity.this, "cancel", Toast.LENGTH_SHORT).show();
            }
        });
        DialogButton btnPositive = new DialogButton(this);
        btnPositive.setText(R.string.positive_button_text);
        btnPositive.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(DialogActivity.this, "cancel", Toast.LENGTH_SHORT).show();
            }
        });
        GiantPandaDialog.showDialog(this, "Title Test", "Button Test Content", btnNegative, btnPositive);
    }

    public void onCustomDialogClick(View view) {
        DialogHeaderBuilder headerBuilder = DialogHeaderBuilder.getInstance()
                .setBgColor(android.R.color.holo_red_dark)
        .setPaddingTop(16)
        .setPaddingBottom(16)
        .setPaddingLeft(16)
        .setPaddingRight(16)
        .setTitle("custom title")
        .setTitleColor(android.R.color.white)
        .setTitleSize(18)
        .setTitleTypeface(Typeface.BOLD);

        DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
                .setBgColor(android.R.color.holo_blue_light)
        .setLayoutGravity(Gravity.CENTER)
        .setPaddingTop(48)
        .setPaddingBottom(48)
        .setPaddingLeft(16)
        .setPaddingRight(16)
        .setContent("custom content")
        .setContentColor(android.R.color.black)
        .setContentSize(14)
        .setGravity(Gravity.LEFT);

        DialogButton btnLeft = new DialogButton(this);
        btnLeft.setText("left");
        btnLeft.setStyle(ButtonStyle.CANCEL);
        btnLeft.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(DialogActivity.this, "left button", Toast.LENGTH_SHORT).show();
            }
        });

        DialogButton btnMiddle = new DialogButton(this);
        btnMiddle.setText("middle");
        btnMiddle.setStyle(ButtonStyle.DEFAULT);
        btnMiddle.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(DialogActivity.this, "middle button", Toast.LENGTH_SHORT).show();
            }
        });

        DialogButton btnRight = new DialogButton(this);
        btnRight.setText("right");
        btnRight.setStyle(ButtonStyle.DESTRUCTIVE);
        btnRight.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(DialogActivity.this, "right button", Toast.LENGTH_SHORT).show();
            }
        });

        DialogBuilder.getInstance(this)
                .setHeader(headerBuilder)
                .setBody(bodyBuilder)
                .addButton(btnLeft)
                .addButton(btnMiddle)
                .addButton(btnRight)
                .setCancelOnTouchBack(false)
                .setCornerRadius(24)
                .setDialogTag("custom dialog")
                .setDialogWidth(300)
                .setHasShade(true)
                .setTouchOutsideCancelable(false)
                .show();
    }
}
