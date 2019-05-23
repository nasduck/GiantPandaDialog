[![API](https://img.shields.io/badge/GiantPandaDialog-v1.2.0-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
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

dialog组件将在结构上将dialog分为三部分：
- header——dialog的顶部内容，与dialog的标题相关
- body——dialog的主体部分，可以在这部分进行dialog内容以及样式的设置
- footer——dialog的底部内容，可以在这部分进行按钮的添加

### 简单调用
#### 提示性对话框
提示性对话框，按钮不包含点击事件，点击按钮dialog消失
```java
// 带标题的提示性对话框
showDialog(FragmentActivity activity, String title, String content, ButtonStyle style)

// 不带标题的提示性对话框
showDialog(FragmentActivity activity, String content, ButtonStyle style)
```

<img src="https://github.com/nasduck/DuckAndroidDiolog/blob/develop/art/%E4%B8%8D%E5%B8%A6%E6%A0%87%E9%A2%98%E6%8F%90%E7%A4%BA%E5%AF%B9%E8%AF%9D%E6%A1%86.png?raw=true" width="25%" height="25%" />  <img src="https://github.com/nasduck/DuckAndroidDiolog/blob/develop/art/%E5%B8%A6%E6%A0%87%E9%A2%98%E6%8F%90%E7%A4%BA%E5%AF%B9%E8%AF%9D%E6%A1%86.png?raw=true" width="25%" height="25%" />   

#### 自定义按钮对话框
自定义按钮对话框，需要将对应的按钮一一设置好后传入方法中。
按钮的设置方法：
```java
DialogButton btn = new DialogButton(activity);
btn.setText(String text);           // 设置按钮文字，DialogButton继承于AppCompatTextView，因此其它的DialogButton继承于AppCompatTextView也可使用
btn.setStyle(ButtonStyle style);    // 设置按钮风格样式，按钮风格：DEFAULT、CANCEL、DESTRUCTIVE
btn.setListener(DialogBtnConfig.OnButtonClickListener listener);    // 设置按钮点击事件
...
```
按钮的不同风格示意图：   
<img src="https://github.com/nasduck/DuckAndroidDiolog/blob/develop/art/%E6%8C%89%E9%92%AE%E4%B8%80%E8%88%AC%E6%A0%B7%E5%BC%8F.png?raw=true" width="25%" height="25%" />  <img src="https://github.com/nasduck/DuckAndroidDiolog/blob/develop/art/%E6%8C%89%E9%92%AE%E5%8F%96%E6%B6%88%E6%A0%B7%E5%BC%8F.png?raw=true" width="25%" height="25%" />  <img src="https://github.com/nasduck/DuckAndroidDiolog/blob/develop/art/%E6%8C%89%E9%92%AE%E8%AD%A6%E5%91%8A%E6%A0%B7%E5%BC%8F.png?raw=true" width="25%" height="25%" />   
```java
// 带标题的对话框
showDialog(FragmentActivity activity, String title, String content, DialogButton...buttons)

// 不带标题的对话框
showDialog(FragmentActivity activity, String content, DialogButton...buttons)
```
### 自定义对话框
在创建自定义对话框时，建议进行进一步封装方便调用
```java
DialogHeaderBuilder headerBuilder = DialogHeaderBuilder.getInstance()
        .setBgColor(int color)                  // 设置背景颜色
        .setPaddingTop(int paddingTop)          // 设置与顶部间距
        .setPaddingBottom(int paddingBottom)    // 设置与底部间距
        .setPaddingLeft(int paddingLeft)        // 设置与左侧间距
        .setPaddingRight(int paddingRight)      // 设置与右侧间距
        .setTitle(String title)                 // 设置标题文字内容
        .setTitleColor(int titleColor)          // 设置标题文字颜色
        .setTitleSize(int titleSize)            // 设置标题文字大小
        .setTitleTypeface(int typeface);        // 设置标题文字样式

DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
        .setBgColor(int color)                  // 设置背景颜色
        .setLayoutGravity(int gravity)          // 设置内容的位置
        .setPaddingTop(int paddingTop)          // 设置与顶部间距
        .setPaddingBottom(int paddingBottom)    // 设置与底部间距
        .setPaddingLeft(int paddingLeft)        // 设置与左侧间距
        .setPaddingRight(int paddingRight)      // 设置与右侧间距
        .setContent(String content)             // 设置内容文字内容
        .setContentColor(int contentColor)      // 设置内容文字颜色
        .setContentSize(int contentSize)        // 设置内容文字大小
        .setGravity(int gravity);               // 设置内容文字位置


DialogBuilder.getInstance(this)
        .setHeader(headerBuilder)                       // 设置header
        .setBody(bodyBuilder)                           // 设置body
        .addButton(DialogButton btn)                    // 添加底部按钮，可多次添加
        .setCancelOnTouchBack(boolean cancelable)       // 设置点击虚拟回退键是否使对话框消失
        .setCornerRadius(int radius)                    // 设置对话框圆角
        .setDialogTag(String tag)                       // 设置对话框的标签
        .setDialogWidth(int width)                      // 设置对话框的宽度
        .setHasShade(boolean hasShade)                  // 设置对话框是否有遮罩
        .setTouchOutsideCancelable(boolean cancelable)  // 设置点击对话框外部是否使对话框消失
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
