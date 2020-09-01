package com.zhj.businessmodule1

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.zhj.commonbean.user.User


/**
 * Description:
 * Created by zhonghaojie on 2020-09-02.
 */
@Route(path = "/businessmodule1/activity/ReadActivity")
class ReadActivity : Activity() {
    @Autowired(name = "key1")
    @JvmField//这里一定要加@JvmField，不然编译的时候会认为它是private的
    var key1 = 0L
    @Autowired(name = "key2")
    @JvmField
    var key2 = ""

    @JvmField
    @Autowired(name = "key3")
    var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ARouter.getInstance().inject(this@ReadActivity)
        setContentView(R.layout.activity_read)
        Log.d("MyARouter:::", "接收到参数key1 = $key1")
        Log.d("MyARouter:::", "接收到参数key2 = $key2")
        Log.d("MyARouter:::", "接收到参数key3 = ${user?.name}")
    }
}