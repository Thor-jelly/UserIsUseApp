# UserIsUseApp
判断用户使用操作App 监听方案 讨论

# 第一种方案

可以直接监听`Activity`的`dispatchTouchEvent`方法。因为事件开始，是从`Activity`的`dispatchTouchEvent`方法开始分发的。

# 第二种方案

给`Looper`中设置`Logging`
