package com.example.gimjihyeon.protectmycosmetic.db;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gimjihyeon on 2017. 4. 6..
 */

public class Cosmetic {
    @SerializedName("name")
    public String cosmetic_name;
    @SerializedName("month from opening")
    public String cosmetic_MonthFromOpening;
    @SerializedName("month from making")
    public String cosmetic_MonthFromMaking;


    @Override
    public String toString() {
        return "Cosmetic{" +
                "cosmetic_name='" + cosmetic_name + '\'' +
                ", cosmetic_MonthFromOpening='" + cosmetic_MonthFromOpening + '\'' +
                ", cosmetic_MonthFromMaking='" + cosmetic_MonthFromMaking + '\'' +
                '}';
    }
}
