package com.example.gimjihyeon.protectmycosmetic.ui;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gimjihyeon.protectmycosmetic.R;
import com.example.gimjihyeon.protectmycosmetic.db.XMLmanager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gimjihyeon on 2017. 4. 6..
 */

public class InputCosmeticActivity extends BaseActivity {
    private static final String TAG = "InputCosmeticActivity";
    XMLmanager xManager;
    String xml;
    TextView data;
    TextView numbering;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        //setSupportActionBar(toolbar);

        //data = (TextView) findViewById(R.id.data);
        //numbering = (TextView) findViewById(R.id.numbering);
        //Intent intent = getIntent();
        //String cosmeticNameStr = intent.getStringExtra("cosmeticName");
        //Log.d(TAG, "intent data: " + cosmeticNameStr);

        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/assets";
        String file = "innisfree.json";
        String result = "";
        Log.d(TAG, "intent data: " + path);
        File directory = new File(path);
        File[] files = directory.listFiles();


        List<String> filesNameList = new ArrayList<>();

        for (int i = 0; i < files.length; i++) {
            filesNameList.add(files[i].getName());
        }
        ArrayAdapter<String> Adapter;
        Adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1);

        ListView listview = (ListView) findViewById(R.id.cosmetic_list);
        listview.setAdapter(Adapter);
        listview.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listview.setDivider(new ColorDrawable(Color.WHITE));
        listview.setDividerHeight(2);
    }

}

/*
        try {

            InputStream is = getAssets().open(file);
            int size = is.available();
            int size2=1;
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            result = new String(buffer, "utf-8");
            List<Cosmetic> cosmetics = App.gson.fromJson(result, CosmeticModel.class).cosmetic;
            for (Cosmetic c : cosmetics) {
                if (c.cosmetic_name.equals(cosmeticNameStr)) {

                    if(size2>0) {
                        // numbering.toString() = String.valueOf(size2);
                        data.append(c.cosmetic_name + "\n");
                        data.append(c.cosmetic_MonthFromMaking + "\n");
                        data.append(c.cosmetic_MonthFromOpening + "\n");
                        data.append("---------------------------------------" + "\n");
                        size2=size2+1;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

*/
    /*//메세지를 전달 받을 핸들러 객체(문서 Thread 다운이 완료되면 이곳이 실행된다)
    Handler handler = new Handler(){
        public void handleMessage(android.os.Message msg){
            //다운 받은 xml가져와서 xml에 담기
            xml = xManager.getXML();
            StringBuffer sBuff = new StringBuffer();
            //num, name, addr 요소를 String[]에 담아 파싱하기
            String[] tags = {"SVCSTATNM", "AREANM", "MINCLASSNM"};
            ArrayList<HashMap<String, String>> list = xManager.parseForList(tags, xml);
            for(HashMap<String, String> tmp : list){
                sBuff.append(tmp.get("SVCSTATNM")+"/"+tmp.get("AREANM")+"/"+tmp.get("MINCLASSNM")+"\n");
            }
            data.setText(sBuff.toString());
        }
    };*/
    /*public void down(View v){
        xManager = new XMLmanager();//Util 객체 생성
        //xml 문서 다운받기(다운이 완료되었을때 메시지를 받아중 handler객체, 다운받을 url주소)
        xManager.downLoadXML(handler, "http://openapi.seoul.go.kr:8088/564259476f6b6a683133334457726673/xml/ListPublicReservationSport/1/5/");

    }*/
// Menu icons are inflated just as they were with actionbar
  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_btn) {
            Toast.makeText(InputCosmeticActivity.this, "메뉴보여주기", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.search_btn) {
            Toast.makeText(InputCosmeticActivity.this, "검색할 예정!", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.home) {
            finish();
            return true;
        } else
            return super.onOptionsItemSelected(item);

    }
}
*/