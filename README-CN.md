[![API](https://img.shields.io/badge/GiantPandaDialog-v1.2.3-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
[![API](https://img.shields.io/badge/License-Apche2.0-brightgreen.svg?style=flat)](https://github.com/nasduck/GiantPandaDialog/blob/master/LICENSE)

GiantPandaDialog 是为了简化 Android Dialog 的调用, 同时借鉴 iOS Dialog/Alert 的创建模式来提供简洁直观的弹窗创建方式. 整个基类完全继承自 DialogFragment 来代替 Dialog 以及 AlertDialog. 如果你对 Toast 或者说是 Hud 感兴趣. 欢迎移步另外一个配套的开源项目 [LesserPandaToast](https://github.com/nasduck/LesserPandaToast). 大熊猫和小熊猫总是搭配使用 :D

## 依赖

步骤一：在项目的build.gradle中添加jitpack

```
allprojects {
    repositories {
        ...
        maven { url 'https://www.jitpack.io' }
    }
}
```

步骤二：添加依赖项

```
dependencies {
    implementation 'com.github.nasduck:GiantPandaDialog:1.2.3'
}
```

## 使用方式

有两种使用方式:

1. 直接使用 GiantPandaDialog.showDialog() 方法, 一行命令即可.
2. 完全自定义 Dialog 的 Header, Body 和 Footer (按钮组)

## GiantPandaDialog.showDialog()

提供了三种快捷的构造方法

```
// 不带标题, 默认底部一个确定按钮
GiantPandaDialog.showDialog(activity, content)

// 带标题和内容, 默认底部一个确定按钮
GiantPandaDialog.showDialog(activity, title, content)

// 带标题和内容, 自定义底部按钮组
GiantPandaDialog.showDialog(activity, title, content, ...buttons)
```

// todo 三张图

#### 自定义按钮

```java
DialogButton btn = new DialogButton(activity);

// 设置按钮文本.
btn.setText("取消");

// 设置样式, 同 iOS , 默认提供了三种样式 DEFAULT、CANCEL、DESTRUCTIVE 
btn.setStyle(ButtonStyle.CANCEL); 

// 设置点击事件
btn.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
    @Override
    public void onClick() {
        // todo
    }
});

// DialogButton 继承于 AppCompatTextView, 其余设置方法同 AppCompatTextView. setTextColor, setTextSize 等.

// 设置按钮 (理论上, 未设按钮上限, 但正常不要超过三个按钮)
GiantPandaDialog.showDialog(activity, "title", "content", btn, secondBtn, anotherBtn)
```

> 如未设置按钮的点击事件. 默认点击关闭 Dialog.

#### 按钮默认样式

// todo 三张图

## 自定义 Dialog

在结构上 Dialog 被分为三个可以独立自定义的部分:

* Header — 顶部内容，与标题相关
* Body — 主体部分，与弹窗内容相关
* Footer — 底部按钮组(依次添加按钮)

```
// 自定义 Header
DialogHeaderBuilder headerBuilder = DialogHeaderBuilder.getInstance()
        .setBgColor(int color)                  // 设置背景颜色, 默认白色
        .setPaddingTop(int paddingTop)          // 设置与顶部间距, 默认18dp
        .setPaddingBottom(int paddingBottom)    // 设置与底部间距, 默认0dp
        .setPaddingLeft(int paddingLeft)        // 设置与左侧间距, 默认0dp
        .setPaddingRight(int paddingRight)      // 设置与右侧间距, 默认0dp
        .setTitle(String title)                 // 设置标题文字内容, 默认空字符
        .setTitleColor(int titleColor)          // 设置标题文字颜色, 默认#4D4D4D
        .setTitleSize(int titleSize)            // 设置标题文字大小, 默认16sp
        .setTitleTypeface(int typeface);        // 设置标题文字样式, 默认粗体

// 自定义 Body
DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
        .setBgColor(int color)                  // 设置背景颜色, 默认白色
        .setLayoutGravity(int gravity)          // 设置内容的位置, 默认居中
        .setPaddingTop(int paddingTop)          // 设置与顶部间距, 默认16dp
        .setPaddingBottom(int paddingBottom)    // 设置与底部间距, 默认16dp
        .setPaddingLeft(int paddingLeft)        // 设置与左侧间距, 默认26dp
        .setPaddingRight(int paddingRight)      // 设置与右侧间距, 默认26dp
        .setContent(String content)             // 设置内容文字内容, 默认空字符
        .setContentColor(int contentColor)      // 设置内容文字颜色, 默认#4D4D4D
        .setContentSize(int contentSize)        // 设置内容文字大小, 默认14sp
        .setGravity(int gravity);               // 设置内容文字位置, 默认居中
        
DialogBuilder.getInstance(this)
        .setHeader(headerBuilder)                       // 设置header
        .setBody(bodyBuilder)                           // 设置body
        .addButton(DialogButton btn)                    // 添加底部按钮，可多次添加
        .setCornerRadius(int radius)                    // 设置对话框圆角, 默认10dp
        .setDialogTag(String tag)                       // 设置对话框标签, 默认giant_panda_dialog
        .setDialogWidth(int width)                      // 设置对话框宽度, 默认260dp
        .setHasShade(boolean hasShade)                  // 设置对话框是否有遮罩, 默认true
        .setCancelOnTouchBack(boolean cancelable)       // 设置点击虚拟回退键是否使对话框消失, 默认true
        .setTouchOutsideCancelable(boolean cancelable)  // 设置点击对话框外部是否使对话框消失, 默认true
        .show();                                        // 显示对话框        
```

## 贡献

* [Lihao Zhou](https://github.com/redrain39)
* [Chuan DONG](https://github.com/DONGChuan)
* [Si Cheng](1103990937@qq.com)(设计师)

## LICENSE
```
   Copyright (2019) Chuan Dong, Lihao Zhou

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
