package com.example.gimjihyeon.protectmycosmetic.db;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.gimjihyeon.protectmycosmetic.R;
import com.example.gimjihyeon.protectmycosmetic.ui.BaseActivity;

/**
 * Created by gimjihyeon on 2017. 4. 11..
 */

public class PrintFileName  extends BaseActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_layout);

    }
        public static String getFileName(String fullPath) {
            int S = fullPath.lastIndexOf("\\");
            int M = fullPath.lastIndexOf(".");
            int E = fullPath.length();

            String filename = fullPath.substring(S+1, M);
            String extname = fullPath.substring(M+1, E);

            String extractFileName = filename + "." + extname;
            return extractFileName;
        }
    }




