package com.zoopark.dialog.utils;

import android.content.Context;

/**
 * dp/px/sp Utils
 */
public class DensityUtils {

    /**
     * dp -> px
     *
     * @param dp dp
     * @return px
     */
    public static int dp2px(Context context, final float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    /**
     * px -> dp
     *
     * @param px px
     * @return dp
     */
    public static int px2dp(Context context, final float px) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }

    /**
     * sp -> px
     *
     * @param sp sp
     * @return px
     */
    public static int sp2px(Context context, final float sp) {
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (sp * scale  + 0.5f);
    }

    /**
     * px -> sp
     *
     * @param px px
     * @return sp
     */
    public static int px2sp(Context context, final float px) {
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (px / scale + 0.5f);
    }
}
