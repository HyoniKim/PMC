package com.example.gimjihyeon.protectmycosmetic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.gimjihyeon.protectmycosmetic.DatePickerFragment;
import com.example.gimjihyeon.protectmycosmetic.HomeActivity;
import com.example.gimjihyeon.protectmycosmetic.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by gimjihyeon on 2017. 4. 8..
 */

public class ShowData extends BaseActivity {
    @Bind(R.id.spinner_cosmeticname)
    Spinner spinner_CosmeticName;
    @Bind(R.id.spinner_group)
    Spinner spinner_Group;
    String cosmeticName;
    String cosmeticGroup;
    Button datePicker;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputcosmetic_layout);
        ButterKnife.bind(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);      //홈 레이아웃으로 가기
        ArrayAdapter<CharSequence> cosmeticGroup_adapter = ArrayAdapter.createFromResource(this, R.array.CosmeticGroup,
                android.R.layout.simple_spinner_item);

        cosmeticGroup_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_CosmeticName.setAdapter(cosmeticGroup_adapter);

        //유통기한 날짜 입력(~까지 쓸수있는 날짜)
        datePicker = (Button) findViewById(R.id.datePicker);
        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowData.this, DatePickerFragment.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.check_btn) {
            cosmeticGroup = spinner_Group.getSelectedItem().toString();
            Intent selected_cosmeticGroup = new Intent(ShowData.this, InputCosmeticActivity.class);
            selected_cosmeticGroup.putExtra("cosmeticName", cosmeticName);
            selected_cosmeticGroup.putExtra("cosmeticGroup", cosmeticGroup);
            startActivity(selected_cosmeticGroup);
            finish();

            return true;
        } else if (
                item.getItemId() == android.R.id.home) {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}




