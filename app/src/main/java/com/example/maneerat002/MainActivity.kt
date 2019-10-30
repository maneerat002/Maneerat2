package com.example.maneerat002

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ซ่อนไตเติ้ลบาร์
        supportActionBar?.hide()
        btn_swit.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.switzerland)?.let { it1 -> setProvice(it1, getString(R.string.btn_swit),getString(R.string.history_swit)) }

        })
        btn_sing.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.singapore)?.let { it1 -> setProvice(it1, getString(R.string.btn_sing),getString(R.string.history_sing)) }

        })
        btn_fan.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.france)?.let { it1 -> setProvice(it1, getString(R.string.btn_fan),getString(R.string.history_fan)) }

        })

        btn_dubai.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.dubai)?.let { it1 -> setProvice(it1, getString(R.string.btn_dubai),getString(R.string.history_dubai)) }

        })
    }
    fun setProvice (drawable : Drawable, header:String, content:String ){

        img_switza.setImageDrawable(drawable) //เปลี่ยนรูปภาพ
        tv_header.setText("ข้อมูลประเทศ "+header) // ส่วนหัวของเนื้อหา
        tv_history.setText(content) // เปลี่ยนประวัติของแพร่

        Toast.makeText(this,
            "นี่คือ ข้อมูลประเทศ "+header, Toast.LENGTH_LONG).show()
    }
    }
