package com.nasduck.dialoglib.dialog.composition;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class DialogFooter extends LinearLayout {

    private List<DialogButton> btnList;

    public static DialogFooter newInstance(Context context, List<DialogButton> btnList) {
        return new DialogFooter(context, btnList);
    }

    private DialogFooter(Context context, List<DialogButton> btnList) {
        super(context);

        this.btnList = btnList;

        LayoutParams lp = new LayoutParams(0, WRAP_CONTENT, 1);
        for (DialogButton btn : btnList) {
            ViewGroup parentViewGroup = (ViewGroup) btn.getParent();
            if (parentViewGroup != null ) {
                parentViewGroup.removeView(btn);
            }
            this.addView(btn, lp);
        }
    }

    public List<DialogButton> getBtnList() {
        return btnList;
    }

    public void setCornerRadius(int cornerRadius) {
        if (btnList.size() == 1) {
            btnList.get(0).setCornerRadiusOnly(cornerRadius);
        } else {
            btnList.get(0).setCornerRadiusFirst(cornerRadius);
            btnList.get(btnList.size() - 1).setCornerRadiusLast(cornerRadius);
        }
    }
}
