package com.zhj.moudledev.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter
import com.zhj.baselib.TestCalss
import com.zhj.commonbean.user.User
import com.zhj.moudledev.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestCalss().test()
    }

    fun jumpToModule1(view: View) {
        ARouter.getInstance().build("/businessmodule1/activity/ReadActivity").navigation()
    }

    fun jumpToModule2(view: View) {
        ARouter.getInstance().build("/businessmodule1/activity/ReadActivity")
            .withLong("key1", 666L)
            .withString("key2", "888")
            .withObject("key3", User().apply {
                name = "Jack"
            }).navigation()
    }
}
