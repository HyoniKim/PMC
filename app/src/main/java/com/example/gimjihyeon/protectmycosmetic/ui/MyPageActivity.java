package com.example.gimjihyeon.protectmycosmetic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.gimjihyeon.protectmycosmetic.HomeActivity;
import com.example.gimjihyeon.protectmycosmetic.R;

import java.util.ArrayList;

/**
 * Created by gimjihyeon on 2017. 4. 6..
 */

public class MyPageActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage__listview_layout);
        ListView listView = (ListView) findViewById(R.id.listview_mypage);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);      //홈 레이아웃으로 가기
        ArrayList<MyPageListViewItem> data = new ArrayList<>();
        MyPageListViewItem alarm = new MyPageListViewItem(R.drawable.ic_notification_bell, "알 림");
        MyPageListViewItem notice = new MyPageListViewItem(R.drawable.ic_megaphone, "공 지 사 항");
        MyPageListViewItem user_history = new MyPageListViewItem(R.drawable.ic_user_image, "프마코 이용기록");


        data.add(alarm);
        data.add(notice);
        data.add(user_history);

        MyPageListViewAdapter myPageListViewAdapter = new MyPageListViewAdapter(this, R.layout.mypage_listview_item_layout, data);
        listView.setAdapter(myPageListViewAdapter);

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            if (position == 0) {   //알림
                Intent jumpToNoticeActivity = new Intent(getApplicationContext(), MypageNoticeActivity1.class);
                startActivity(jumpToNoticeActivity);
            } else if (position == 1)     //공지사항
            {
                Toast.makeText(getApplicationContext(), "공지사항 이제 나올거에요", Toast.LENGTH_SHORT).show();
            } else {          //내 프마코 이용기록
                Toast.makeText(getApplicationContext(), "나의 프마코 이용기록 이제 나올거에요", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {       //홈레이아웃으로 가기
        if (item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


}
