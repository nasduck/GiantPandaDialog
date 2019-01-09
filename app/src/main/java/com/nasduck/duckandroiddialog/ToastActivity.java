package com.nasduck.duckandroiddialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nasduck.dialoglib.base.DuckDialog;
import com.nasduck.dialoglib.base.DuckDialogType;
import com.nasduck.dialoglib.builder.ToastBuilder;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
    }

    public void onToastDefaultClick(View view) {
        DuckDialog.showToast(this, "Toast Default");
    }
}
