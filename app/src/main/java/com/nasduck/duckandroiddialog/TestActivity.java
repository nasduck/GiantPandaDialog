package com.nasduck.duckandroiddialog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void onToastClick(View view) {
        Intent intentToToast = new Intent(this, ToastActivity.class);
        startActivity(intentToToast);
    }

    public void onDialogClick(View view) {
        Intent intentToDialog = new Intent(this, DialogActivity.class);
        startActivity(intentToDialog);
    }



}
