package com.example.gimjihyeon.protectmycosmetic;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.gimjihyeon.protectmycosmetic.ui.CommunityActivity;
import com.example.gimjihyeon.protectmycosmetic.ui.MyPageActivity;
import com.example.gimjihyeon.protectmycosmetic.ui.ShowData;

import butterknife.Bind;

public class HomeActivity extends AppCompatActivity {
      @Bind(R.id.btn_inputCosmetic)
        Button btn_inputCosmetic;
        @Bind(R.id.btn_community)
        Button btn_community;
        @Bind(R.id.btn_mypage)
        Button btn_mypage;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // 화장품 입력
    public void InputCosmetic(View view) {
        Intent intent = new Intent(HomeActivity.this, ShowData.class);
        startActivity(intent);
        finish();
    }

    // 커뮤니티
    public void Community(View view) {
        Intent intent = new Intent(HomeActivity.this, CommunityActivity.class);
        startActivity(intent);
        finish();
    }

    //마이페이지
    public void MyPage(View view) {
        Intent intent = new Intent(HomeActivity.this, MyPageActivity.class);
        startActivity(intent);
        finish();
    }

}