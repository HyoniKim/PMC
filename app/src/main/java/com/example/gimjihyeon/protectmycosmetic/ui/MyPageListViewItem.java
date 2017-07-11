package com.example.gimjihyeon.protectmycosmetic.ui;

import android.graphics.drawable.Drawable;

/**
 * Created by gimjihyeon on 2017. 6. 5..
 */

public class MyPageListViewItem {
    private int mypage_icon;
    private String mypage_name;


    public String getMypage_name() {
        return mypage_name;
    }

    public int getMypage_icon() {return mypage_icon;}

    public MyPageListViewItem(int icon, String name) {
        this.mypage_icon = icon;
        this.mypage_name = name;
    }
}
