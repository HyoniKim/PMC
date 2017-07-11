package com.example.gimjihyeon.protectmycosmetic.model;

import com.example.gimjihyeon.protectmycosmetic.db.Cosmetic;
import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gimjihyeon on 2017. 4. 6..
 */

public class CosmeticModel {
    @Expose
    public List<Cosmetic> cosmetic =new ArrayList<>();

    @Override
    public String toString() {
        return "CosmeticModel{" +
                "cosmetic=" + cosmetic +
                '}';
    }
}
