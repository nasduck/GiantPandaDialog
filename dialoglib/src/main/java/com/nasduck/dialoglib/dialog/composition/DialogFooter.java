package com.nasduck.dialoglib.dialog.composition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.utils.DensityUtils;

import java.util.List;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class DialogFooter extends LinearLayout {

    private List<DialogButton> mBtnList;
    private Context mContext;

    public static DialogFooter newInstance(Context context, List<DialogButton> btnList) {
        return new DialogFooter(context, btnList);
    }

    private DialogFooter(Context context, List<DialogButton> mBtnList) {
        super(context);

        this.mBtnList = mBtnList;
        this.mContext = context;

        LayoutParams lp = new LayoutParams(0, WRAP_CONTENT, 1);

        int index = 0;
        for (DialogButton btn : mBtnList) {
            ViewGroup parentViewGroup = (ViewGroup) btn.getParent();
            if (parentViewGroup != null ) {
                parentViewGroup.removeView(btn);
            }
            if (index > 0) {
                addDivider();
            }
            this.addView(btn, lp);
            index++;
        }
    }

    public List<DialogButton> getBtnList() {
        return mBtnList;
    }

    public void setCornerRadius(int cornerRadius) {
        if (mBtnList.size() == 1) {
            mBtnList.get(0).setCornerRadiusOnly(cornerRadius);
        } else {
            mBtnList.get(0).setCornerRadiusFirst(cornerRadius);
            mBtnList.get(mBtnList.size() - 1).setCornerRadiusLast(cornerRadius);
        }
    }

    public void addDivider() {
        View divider = new View(mContext);
        divider.setBackgroundColor(getResources().getColor(R.color.gray_line));
        ViewGroup.LayoutParams lp =
                new ViewGroup.LayoutParams(DensityUtils.dp2px(mContext, 0.5f), MATCH_PARENT);
        divider.setLayoutParams(lp);
        this.addView(divider);
    }
}
