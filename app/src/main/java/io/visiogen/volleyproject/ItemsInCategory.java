package io.visiogen.volleyproject;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Danielius on 2018-05-21.
 */

public class ItemsInCategory {

    @SerializedName("total")
    private String total;

    @SerializedName("items")
    private ArrayList<Item> items;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
