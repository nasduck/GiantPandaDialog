![banner](https://github.com/nasduck/GiantPandaDialog/blob/develop/art/%E5%A4%A7%E7%86%8A%E7%8C%ABbanner.png?raw=true)

[![API](https://img.shields.io/badge/GiantPandaDialog-v1.2.3-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)&ensp;
[![API](https://img.shields.io/badge/License-Apche2.0-brightgreen.svg?style=flat)](https://github.com/nasduck/GiantPandaDialog/blob/master/LICENSE)

GiantPandaDialog is to simplify the usage of Android Dialog. We could build a general dialog with just one line of code. The usage is similar to iOS UIAlertController and it is based on DialogFragment.

If you are also interested at Toast or Hud. Please take a look at another library [LesserPandaToast](https://github.com/nasduck/LesserPandaToast). From these libraries' names, 
you will find they are used together. Please enjoy them :D

## Content

* [Setup](#setup)
* [Usage](#usage)
    * [GiantPandaDialog.showDialog()](#giantpandadialogshowdialog)
        * [Custom button](#custom-button)
        * [Button Styles by default](#button-styles-by-default)
    * [Custom Dialog](#custom-dialog)
* [Contributer](#contributer)
* [LICENSE](#license)

## Setup

### **</u>[中文文档](https://github.com/nasduck/GiantPandaDialog/blob/master/README-CN.md)</u>**

Adding jitpack repository in your project's `build.gradle` file:

```
allprojects {
    repositories {
        ...
        maven { url 'https://www.jitpack.io' }
    }
}
```

Adding the following dependency to app `build.gradle` file:

```
dependencies {
    implementation 'com.github.nasduck:GiantPandaDialog:1.2.3'
}
```

## Usage

There are two ways to build a dialog:

1. By `GiantPandaDialog.showDialog()` directly, one line of code!
2. Fully customize a dialog to have a different Header, Body or Footer (buttons group).

## GiantPandaDialog.showDialog()

Three constructors are provided:

```java
// No title, a confirm button at the bottom by default
GiantPandaDialog.showDialog(activity, content)

// With title and content, a confirm button at the bottom by default
GiantPandaDialog.showDialog(activity, title, content)

// With title and content, but buttons are customized
GiantPandaDialog.showDialog(activity, title, content, ...buttons)
```

<img src="https://github.com/nasduck/GiantPandaDialog/blob/develop/art/%E4%B8%8D%E5%B8%A6%E6%A0%87%E9%A2%98%E7%9A%84%E5%8D%95%E6%8C%89%E9%92%AE%E5%AF%B9%E8%AF%9D%E6%A1%86.png?raw=true" height="400" > <img src="https://github.com/nasduck/GiantPandaDialog/blob/develop/art/%E5%B8%A6%E6%A0%87%E9%A2%98%E7%9A%84%E5%8D%95%E6%8C%89%E9%92%AE%E5%AF%B9%E8%AF%9D%E6%A1%86.png?raw=true" height="400" > <img src="https://github.com/nasduck/GiantPandaDialog/blob/develop/art/%E5%B8%A6%E6%A0%87%E9%A2%98%E7%9A%84%E5%A4%9A%E6%8C%89%E9%92%AE%E5%AF%B9%E8%AF%9D%E6%A1%86.png?raw=true" height="400" >

#### Custom button

```java
DialogButton btn = new DialogButton(activity);

// Button Text
btn.setText("Cancel");

// Button Style, same as iOS , three styles are provided by default:  DEFAULT、CANCEL、DESTRUCTIVE 
btn.setStyle(ButtonStyle.CANCEL); 

// Button click listener
btn.setClickListener(new DialogBtnConfig.OnButtonClickListener() {
    @Override
    public void onClick() {
        // todo
    }
});

// DialogButton inherits from AppCompatTextView, so the other methods are the same as AppCompatTextView. ex, setTextColor, setTextSize and so on.

// Set this button on the dialog
GiantPandaDialog.showDialog(activity, "title", "content", btn, secondBtn, anotherBtn)
```

> By default, the dialog will be dissmissed when the button is clicked if click listener is not set.

#### Button Styles by default

<img src="https://github.com/nasduck/GiantPandaDialog/blob/develop/art/%E6%8C%89%E9%92%AE%E9%BB%98%E8%AE%A4%E6%A0%B7%E5%BC%8F.png?raw=true" height="100" />  <img src="https://github.com/nasduck/GiantPandaDialog/blob/develop/art/%E6%8C%89%E9%92%AE%E5%8F%96%E6%B6%88%E6%A0%B7%E5%BC%8F.png?raw=true" height="100" />  <img src="https://github.com/nasduck/GiantPandaDialog/blob/develop/art/%E6%8C%89%E9%92%AE%E8%AD%A6%E5%91%8A%E6%A0%B7%E5%BC%8F.png?raw=true" height="100" />   

## Custom Dialog

GiantPandaDialog is divided into three parts that can be customized independently:

* Header
* Body
* Footer

```java
// Customize Header
DialogHeaderBuilder headerBuilder = DialogHeaderBuilder.getInstance()
        .setBgColor(int color)                  // Background color, white by default
        .setPaddingTop(int paddingTop)          // 18dp by default
        .setPaddingBottom(int paddingBottom)    // 0dp by default
        .setPaddingLeft(int paddingLeft)        // 0dp by default
        .setPaddingRight(int paddingRight)      // 0dp by default
        .setTitle(String title)                 // empty string  by default
        .setTitleColor(int titleColor)          // #4D4D4D by default
        .setTitleSize(int titleSize)            // 16sp by default
        .setTitleTypeface(int typeface);        // bold by default

// Customize Body
DialogBodyBuilder bodyBuilder = DialogBodyBuilder.getInstance()
        .setBgColor(int color)                  // Background color, white by default
        .setLayoutGravity(int gravity)          // center by default
        .setPaddingTop(int paddingTop)          // 16dp by default
        .setPaddingBottom(int paddingBottom)    // 16dp by default
        .setPaddingLeft(int paddingLeft)        // 26dp by default
        .setPaddingRight(int paddingRight)      // 26dp by default
        .setContent(String content)             // empty string by default
        .setContentColor(int contentColor)      // #4D4D4D by default
        .setContentSize(int contentSize)        // 14sp by default
        .setGravity(int gravity);               // center by default
        
DialogBuilder.getInstance(this)
        .setHeader(headerBuilder)                       // set header
        .setBody(bodyBuilder)                           // set body
        .addButton(DialogButton btn)                    // add buttons. (can add multiple buttons)
        .setCornerRadius(int radius)                    // dialog cornner radius, 10dp by default
        .setDialogTag(String tag)                       // tag for fragment manager,  giant_panda_dialog by default
        .setDialogWidth(int width)                      // 260dp by default
        .setHasShade(boolean hasShade)                  // whether has shade on the background, true by default
        .setCancelOnTouchBack(boolean cancelable)       // true by default
        .setTouchOutsideCancelable(boolean cancelable)  // true by default
        .show();                                        // show dialog  
```

## Contributer

* [Lihao Zhou](https://github.com/redrain39)
* [Chuan DONG](https://github.com/DONGChuan)
* [Si Cheng](1103990937@qq.com)(Art Designer)

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
