# FlowLayout
Android 流式布局打造热门标签、搜索历史等

**2、使用**
```
<com.zx.flowlayout.FlowLayout
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:childSpacing="auto"
    app:childSpacingForLastRow="align"
    app:rowSpacing="8dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="SUN"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="MON"/>

    <!--...-->

</com.zx.flowlayout.FlowLayout>
```
 
 **3、相关属性**
 属性 | 数据类型 | 描述
----|------|----
flow | boolean  | true表示允许流动，也就是一行满了以后，自动换行，false表示限制所有的子元素在一行，默认为true
childSpacing | auto/dimension  | 表示子元素的水平方向的间距，可以为自适应或指定的大小
childSpacingForLastRow | auto/align/dimension  | 最后一行子元素的间距，如果不设置，默认用childSpacing代替
rowSpacing | auto/dimension  | 垂直方向2行的间距
rtl | boolean  | true表示子元素从右到左排列，false表示从左往右，默认false
