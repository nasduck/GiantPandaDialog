package com.zoopark.demo;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zoopark.dialog.GiantPandaDialog;
import com.zoopark.dialog.builder.DialogBodyBuilder;
import com.zoopark.dialog.builder.DialogBuilder;
import com.zoopark.dialog.builder.DialogHeaderBuilder;
import com.zoopark.dialog.config.ButtonStyle;
import com.zoopark.dialog.config.DialogBtnConfig;
import com.zoopark.dialog.view.DialogBody;
import com.zoopark.dialog.view.DialogButton;


public class DialogActivity extends AppCompatActivity {

    private static final String DIALOG_TAG = "custom dialog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onTipDialogClick(View view) {
        GiantPandaDialog.showDialog(this, getResources().getString(R.string.dialog_content));
    }

    public void onTitleTipDialogClick(View view) {
        GiantPandaDialog.showDialog(this, getResources().getString(R.string.dialog_title),
                getResources().getString(R.string.dialog_content));
    }

    public void onSelectDialogClick(View view) {
        DialogButton btnNegative = new DialogButton(this,
                getResources().getString(R.string.negative_button_text),
                ButtonStyle.CANCEL,
                new DialogBtnConfig.OnButtonClickListener() {
                    @Override
                    public void onClick() {
                        Toast.makeText(getApplicationContext(),
                                getResources().getText(R.string.negative_button_text),
                                Toast.LENGTH_SHORT).show();
                    }
        });
        DialogButton btnPositive = new DialogButton(this,
                getResources().getString(R.string.positive_button_text),
                new DialogBtnConfig.OnButtonClickListener() {
                    @Override
                    public void onClick() {
                        Toast.makeText(getApplicationContext(),
                                getResources().getText(R.string.positive_button_text),
                                Toast.LENGTH_SHORT).show();
                    }
                });
        GiantPandaDialog.showDialog(this, getResources().getString(R.string.dialog_content),
                btnNegative, btnPositive);
    }

    public void onTitleSelectDialogClick(View view) {
        DialogButton btnNegative = new DialogButton(this);
        btnNegative.setText(R.string.negative_button_text);
        btnNegative.setStyle(ButtonStyle.CANCEL);
        btnNegative.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(getApplicationContext(),
                        getResources().getText(R.string.negative_button_text),
                        Toast.LENGTH_SHORT).show();
            }
        });
        DialogButton btnPositive = new DialogButton(this);
        btnPositive.setText(R.string.positive_button_text);
        btnPositive.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(getApplicationContext(),
                        getResources().getText(R.string.positive_button_text),
                        Toast.LENGTH_SHORT).show();
            }
        });
        GiantPandaDialog.showDialog(this, getResources().getString(R.string.dialog_title),
                getResources().getString(R.string.dialog_content), btnNegative, btnPositive);
    }

    public void onCustomDialogClick(View view) {
        DialogHeaderBuilder headerBuilder = DialogHeaderBuilder.getInstance()
                .setBgColor(android.R.color.holo_red_dark)
        .setPaddingTop(16)
        .setPaddingBottom(16)
        .setPaddingLeft(16)
        .setPaddingRight(16)
        .setTitle(String.valueOf(getResources().getText(R.string.dialog_custom_title)))
        .setTitleColor(android.R.color.white)
        .setTitleSize(18)
        .setTitleTypeface(Typeface.BOLD);

        DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
                .setDialogBody(new DialogBody(DialogActivity.this) {
                    @Override
                    public int initLayout() {
                        return R.layout.layout_custom;
                    }

                    @Override
                    public void initUI(View view) {

                    }
                });

        DialogButton btnLeft = new DialogButton(this);
        btnLeft.setText(getResources().getText(R.string.dialog_button_left));
        btnLeft.setStyle(ButtonStyle.CANCEL);
        btnLeft.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(DialogActivity.this,
                        getResources().getText(R.string.dialog_button_left), Toast.LENGTH_SHORT).show();
            }
        });

        DialogButton btnMiddle = new DialogButton(this);
        btnMiddle.setText(getResources().getText(R.string.dialog_button_middle));
        btnMiddle.setStyle(ButtonStyle.DEFAULT);
        btnMiddle.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(DialogActivity.this,
                        getResources().getText(R.string.dialog_button_middle), Toast.LENGTH_SHORT).show();
            }
        });

        DialogButton btnRight = new DialogButton(this);
        btnRight.setText(getResources().getText(R.string.dialog_button_right));
        btnRight.setStyle(ButtonStyle.DESTRUCTIVE);
        btnRight.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(DialogActivity.this,
                        getResources().getText(R.string.dialog_button_right), Toast.LENGTH_SHORT).show();
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
                .setDialogTag(DIALOG_TAG)
                .setBodyBackgroundColor(R.color.text_black)
                .setDialogWidth(300)
                .setHasShade(true)
                .setTouchOutsideCancelable(false)
                .show();
    }
}
