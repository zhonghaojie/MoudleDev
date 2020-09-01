Kotlin采坑

1、kotlin中使用ARouter传递对象时，对象一定要有空构造函数
2、目标界面接收上个界面传过来的参数时，要加@JvmField
例如：
class ReadActivity : Activity() {
    @Autowired(name = "key1")
    @JvmField //要加上@JvmField
    var key1 = 0L