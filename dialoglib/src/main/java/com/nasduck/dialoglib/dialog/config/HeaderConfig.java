package com.nasduck.dialoglib.dialog.config;

import com.nasduck.dialoglib.R;
import com.nasduck.dialoglib.base.enums.TextStyle;

public class HeaderConfig {

    private TextStyle titleStyle;
    private String title;
    private int titleColor;
    private int titleTextSize;

    public static HeaderConfig newInstance() {
        return new HeaderConfig();
    }

    private HeaderConfig() {
        this.titleStyle = TextStyle.BOLD;
        this.title = "";
        this.titleColor = R.color.text_black_light;
        this.titleTextSize = 16;
    }

    //* Getter & Setter **************************************************************************//

    public TextStyle getTitleStyle() {
        return titleStyle;
    }

    public void setTitleStyle(TextStyle titleStyle) {
        this.titleStyle = titleStyle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(int titleColor) {
        this.titleColor = titleColor;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public void setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
    }

}
