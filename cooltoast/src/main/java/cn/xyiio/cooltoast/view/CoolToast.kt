package cn.xyiio.cooltoast.view

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

import cn.xyiio.cooltoast.R

/**
 * Created by turaiiao on 18-2-17 08:12.
 * @author turaiiao
 * @version 0.0.1
 * @email 1171840237@qq.com
 * @url https://github.com/turaiiao/cooltoast
 */
class CoolToast {
    private var toast: Toast? = null
    private var toastView: View? = null
    private var toastText: TextView? = null
    private var toastRelative: RelativeLayout? = null
    private var drawable: GradientDrawable? = null

    private var context: Context? = null

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

    fun init(mContext: Context) {
        this.context = mContext

        val layoutInflater = LayoutInflater.from(context)
        toastView = layoutInflater.inflate(R.layout.layout_toast, null)

        toast = Toast(context)
        toast?.view = toastView

        toastText = toastView?.findViewById(R.id.toast_tv)
        toastRelative = toastView?.findViewById(R.id.toast_relative)

        drawable = toastRelative?.background as GradientDrawable
    }

    fun bgColor(color: Int): CoolToast {
        drawable?.setColor(color)
        return this
    }

    fun bgRadius(dp: Float): CoolToast {
        drawable?.cornerRadius = dp
        return this
    }

    fun bgTextSize(sp: Float): CoolToast {
        toastText?.textSize = sp
        return this
    }

    fun short(message: CharSequence): CoolToast {
        toastText?.text = message
        toast?.duration = Toast.LENGTH_SHORT
        return this
    }

    fun long(message: CharSequence): CoolToast {
        toastText?.text = message
        toast?.duration = Toast.LENGTH_LONG
        return this
    }

    fun center(): CoolToast {
        toast?.setGravity(Gravity.CENTER, 0, 0)
        return this
    }

    fun duration(duration: Int): CoolToast {
        toast?.duration = duration
        return this
    }

    fun shadow(dp: Float): CoolToast {
        toastView?.elevation = dp
        return this
    }

    fun show() {
        toast?.show()
    }
}