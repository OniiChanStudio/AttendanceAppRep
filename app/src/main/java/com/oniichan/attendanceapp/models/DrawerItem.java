package com.oniichan.attendanceapp.models;

import com.oniichan.attendanceapp.activities.MainActivity;

/**
 * Created by skratch on 18/2/17.
 */

public class DrawerItem extends MainActivity {
    private String ItemName;
    private int ImgResId;

    public DrawerItem(String name, int icon){
        this.ItemName = name;
        this.ImgResId = icon;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public int getImgResId() {
        return ImgResId;
    }

    public void setImgResId(int imgResId) {
        ImgResId = imgResId;
    }
}
