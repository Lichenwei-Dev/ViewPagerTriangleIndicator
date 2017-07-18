# ViewPagerTriangleIndicator
 自定义ViewPager三角形指示器，博客讲解请见：[Android开发之自定义ViewPager三角形指示器](http://www.jianshu.com/p/51c2557a241b)
## 效果图
 ![image](https://github.com/Lichenwei-Dev/ViewPagerTriangleIndicator/blob/master/screenshot/ViewPagerTriangleIndicator.gif)
## 用法
1、复制ViewPagerTriangleIndicator类到项目里<br>
2、复制values文件夹下的attr.xml到项目里<br>
3、演示代码<br>

```
    <com.lcw.viewpagertriangleindicator.ViewPagerTriangleIndicator
        android:id="@+id/vpti_main_tab"
        android:layout_width="match_parent"
        android:layout_height="45dp"
        android:background="@color/colorAccent"
        android:orientation="horizontal"
        lcw:visible_tab_num="3" />

    <android.support.v4.view.ViewPager
        android:id="@+id/vp_main_content"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
```

```
        //设置指示器标题(mTitles为一个List<String>集合)
        mViewPagerTriangleIndicator.setPageTitle(mTitles);
        //绑定ViewPager
        mViewPagerTriangleIndicator.setViewPagerWithIndicator(mViewPager);
```

详细信息请参考Demo，注释很全。
