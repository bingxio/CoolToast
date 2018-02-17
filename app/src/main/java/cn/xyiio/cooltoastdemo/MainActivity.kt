package cn.xyiio.cooltoastdemo

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import cn.xyiio.cooltoast.view.CoolToast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var button_1: Button? = null
    var button_2: Button? = null
    var button_3: Button? = null
    var button_4: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1 = findViewById(R.id.btn_1)
        button_2 = findViewById(R.id.btn_2)
        button_3 = findViewById(R.id.btn_3)
        button_4 = findViewById(R.id.btn_4)
        button_1?.setOnClickListener(this)
        button_2?.setOnClickListener(this)
        button_3?.setOnClickListener(this)
        button_4?.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.btn_1 -> one()
            R.id.btn_2 -> two()
            R.id.btn_3 -> three()
            R.id.btn_4 -> four()
        }
    }

    fun one() {
        val coolToast = CoolToast()
        coolToast.init(this)
        coolToast
                .bgTextSize(CoolToast.DEFAULT_SIZE)
                .bgRadius(CoolToast.DEFAULT_RADIUS)
                .bgColor(CoolToast.COLOR_RED_700)
                .short("居中吐司")
                .center()
                .show()
    }

    fun two() {
        val coolToast = CoolToast()
        coolToast.init(this)
        coolToast
                .bgTextSize(CoolToast.DEFAULT_SIZE)
                .bgRadius(CoolToast.DEFAULT_RADIUS)
                .bgColor(CoolToast.COLOR_PINK_500)
                .short("阴影吐司")
                .shadow(5f)
                .show()
    }

    fun three() {
        val coolToast = CoolToast()
        coolToast.init(this)
        coolToast
                .bgTextSize(16f)
                .bgRadius(250f)
                .bgColor(Color.parseColor("#ff0000"))
                .long("时间长一点的吐司")
                .duration(3000)
                .shadow(5f)
                .show()
    }

    fun four() {
        CoolToast().quickShow(this, "这是一个快捷吐司")
    }
}
