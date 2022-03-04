package com.dongdongwu.userisuseapp

import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.util.Printer
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var currentTime = 0L
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (MotionEvent.ACTION_DOWN == ev?.action) {
            Log.e("123===", "dispatchTouchEvent")
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mLogging = Printer {
            val nowTime = System.currentTimeMillis()
            if (it.startsWith(">>>>> Dispatching to ") && (nowTime - currentTime > 1000)) {
                currentTime = nowTime
                Log.e("123===", "-----$it")
            }
        }
        Looper.getMainLooper().setMessageLogging(mLogging)
    }
}