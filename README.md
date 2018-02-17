# CoolToast
#### 此项目用 Kotlin 开发，使用方法和 Java 百分百互通。
一个第三方的吐司，想法来自酷安 8.0 [Download demo apk](https://github.com/Turaiiao/CoolToast/blob/master/img/Screenshot_2018-02-17-13-25-49-350_com.coolapk.ma.png)

## Demo
|||
| ------------- |:-------------:|
| ![](https://github.com/Turaiiao/CoolToast/blob/master/img/Screenshot_2018-02-17-13-25-49-350_com.coolapk.ma.png)      | ![](https://github.com/Turaiiao/CoolToast/blob/master/img/Screenshot_2018-02-17-14-08-55-654_cn.xyiio.coolt.png) | 
| ![](https://github.com/Turaiiao/CoolToast/blob/master/img/Screenshot_2018-02-17-14-08-58-030_cn.xyiio.coolt.png) | ![](https://github.com/Turaiiao/CoolToast/blob/master/img/Screenshot_2018-02-17-14-09-00-473_cn.xyiio.coolt.png)      | centered      |   $12 |
||

## 引用
#### 第一步
添加依赖到项目根目录的 build.gradle

```
allprojects {
	repositories {
		...
		maven { url 'https://www.jitpack.io' }
	}
}
```
#### 第二步
包含此库到 ``app`` 级别的 build.gradle

```
dependencies {
	compile 'com.github.Turaiiao:CoolToast:0.0.2'
}
```
## 使用
#### Kotlin
```kotlin
val coolToast = CoolToast()
        coolToast.init(this)
        coolToast
                .bgTextSize(CoolToast.DEFAULT_SIZE)
                .bgRadius(CoolToast.DEFAULT_RADIUS)
                .bgColor(CoolToast.COLOR_PINK_500)
                .short("阴影吐司")
                .shadow(5f)
                .show()
```
#### 快捷使用
```
CoolToast().quickShow(this, "这是一个快捷吐司") // 颜色默认粉色
```
你可以把它添加到 Application，初始化一次，后面直接 show() 即可
##### 其他函数
* fun init(mContext: Context)  
**初始化一个 Toast**
* fun bgColor(color: Int): CoolToast  
**设置吐司背景颜色**
* fun bgRadius(dp: Float): CoolToast  
**设置吐司外边框圆角**
* fun bgTextSize(sp: Float): CoolToast  
**设置吐司字体大小**
* fun short(message: CharSequence): CoolToast  
**显示安卓默认短吐司**
* fun long(message: CharSequence): CoolToast  
**显示安卓默认长吐司**
* fun center(): CoolToast  
**设置是否居中显示**
* fun duration(duration: Int): CoolToast  
**设置显示时长**
* fun shadow(dp: Float): CoolToast  
**设置它的阴影**
* fun show()  
**显示吐司**

##### 可引用的静态常量
```kotlin
companion object {
        val DEFAULT_RADIUS: Float = 200f
        val DEFAULT_SIZE: Float = 13f

        val COLOR_RED_500: Int = Color.parseColor("#F44336")
        val COLOR_RED_700: Int = Color.parseColor("#D32F2F")
        val COLOR_PINK_500: Int = Color.parseColor("#E91E63")
        val COLOR_PINK_700: Int = Color.parseColor("#C2185B")
        val COLOR_PURPLE_500: Int = Color.parseColor("#9C27B0")
        val COLOR_PURPLE_700: Int = Color.parseColor("#7B1FA2")
        val COLOR_BLUE_500: Int = Color.parseColor("#2196F3")
        val COLOR_BLUE_700: Int = Color.parseColor("#1976D2")
        val COLOR_GREEN_500: Int = Color.parseColor("#4CAF50")
        val COLOR_GREEN_700: Int = Color.parseColor("#388E3C")
        val COLOR_ORANGE_500: Int = Color.parseColor("#FF5722")
        val COLOR_ORANGE_700: Int = Color.parseColor("#E64A19")
        val COLOR_GREY_500: Int = Color.parseColor("#607D8B")
        val COLOR_GREY_700: Int = Color.parseColor("#455A64")

        val COLOR_LIST = listOf(COLOR_RED_500, COLOR_RED_700,
                COLOR_PINK_500, COLOR_PINK_700,
                COLOR_PURPLE_500, COLOR_PURPLE_700,
                COLOR_BLUE_500, COLOR_BLUE_700,
                COLOR_GREEN_500, COLOR_GREEN_700,
                COLOR_ORANGE_500, COLOR_ORANGE_700,
                COLOR_GREY_500, COLOR_GREY_700)
    }
```

##### 欢迎 Star，Fork，Issues ！

### License
```
Copyright 2018 Turaiiao

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
