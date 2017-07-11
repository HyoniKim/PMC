package com.example.gimjihyeon.protectmycosmetic.db;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by gimjihyeon on 2017. 4. 6..
 */

public class CosmeticJSONParser {
    public List<HashMap<String, String>> parse(JSONObject jsonObject) {
        JSONArray jCosmetics = null;
        try {
            jCosmetics = jsonObject.getJSONArray("cosmetics");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return getCosmetics(jCosmetics);
    }

    public List<HashMap<String, String >> getCosmetics(JSONArray jCosmetics){
        int cosmeticCount =jCosmetics.length();
        List<HashMap<String, String>> cosmeticList = new ArrayList<HashMap<String,String>>();
        HashMap<String ,String> cosmetic = null;
        for(int i=0 ; i<cosmeticCount ;i++){
            try {
                cosmetic =getCosmetic((JSONObject) jCosmetics.get(i));
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return cosmeticList;
    }
    public HashMap<String, String> getCosmetic(JSONObject jCosmetic) {
        HashMap<String, String> cosmetic = new HashMap<String, String>();
        String cosmetic_name = "";
        String month_from_opening = "";
        String month_from_making="";
        try{
            cosmetic_name =jCosmetic.getString("name");
            month_from_making=jCosmetic.getString("month From opening" );
            month_from_opening =jCosmetic.getString("month From making");
            cosmetic.put("name",cosmetic_name);
            cosmetic.put("month From opening",month_from_opening);
            cosmetic.put("month From making",month_from_making);
        }catch (JSONException e){e.printStackTrace();}
        return cosmetic;
    }

}
