package com.example.gimjihyeon.protectmycosmetic.ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gimjihyeon.protectmycosmetic.R;

import java.util.ArrayList;

/**
 * Created by gimjihyeon on 2017. 6. 5..
 */

public class MyPageListViewAdapter extends BaseAdapter {

    private ArrayList<MyPageListViewItem> data;
    private int layout;
    private LayoutInflater inflater;  //아이템 xml을 메모리에 올려주는 inflater

    //생성자에서 초기화
    MyPageListViewAdapter(Context context, int layout, ArrayList<MyPageListViewItem> data) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getMypage_name();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        final int pos = position;
        final Context context = parent.getContext();
        notifyDataSetChanged();
        if (view == null) {
            view = inflater.inflate(layout, parent, false);
        }
        MyPageListViewItem myPageListViewItem = data.get(position);


        ImageView icon = (ImageView) view.findViewById(R.id.img_mypage_listviewitem);
        icon.setImageResource(myPageListViewItem.getMypage_icon());

        TextView name = (TextView) view.findViewById(R.id.txt_mypage_listviewitem);
        name.setText(myPageListViewItem.getMypage_name());

//        name.setOnClickListener(this);
        return view;
    }

}