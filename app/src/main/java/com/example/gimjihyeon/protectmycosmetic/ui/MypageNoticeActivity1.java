package com.example.gimjihyeon.protectmycosmetic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;

import com.example.gimjihyeon.protectmycosmetic.HomeActivity;
import com.example.gimjihyeon.protectmycosmetic.R;

/**
 * Created by gimjihyeon on 2017. 6. 23..
 */

public class MypageNoticeActivity1 extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage_notice_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);      //홈 레이아웃으로 가기


    }
    public boolean onOptionsItemSelected(MenuItem item) {       //홈으로 가기
        if (item.getItemId() == android.R.id.home) {
         /*   Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);*/
         finish();          //이전 레이아웃으로 가기
        }
        return super.onOptionsItemSelected(item);
    }


}
