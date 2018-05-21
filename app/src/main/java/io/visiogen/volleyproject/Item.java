package io.visiogen.volleyproject;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Danielius on 2018-05-21.
 */

public class Item {

    @SerializedName("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
