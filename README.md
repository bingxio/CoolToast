# ProgressText
一个第三方的吐司，想法来自酷安 8.0 [Download demo apk](https://github.com/Turaiiao/CoolToast/blob/master/img/Screenshot_2018-02-17-13-25-49-350_com.coolapk.ma.png)

## Demo
|Tables         | Are           | Cool  |
| ------------- |:-------------:| -----:|
| ![](https://github.com/Turaiiao/CoolToast/blob/master/img/Screenshot_2018-02-17-13-25-49-350_com.coolapk.ma.png)      | right-aligned | $1600 |
| col 2 is      | centered      |   $12 |
| zebra stripes | are neat      |    $1 |

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
	compile 'com.github.Turaiiao:CoolToast:0.0.1'
}
```
## 使用
