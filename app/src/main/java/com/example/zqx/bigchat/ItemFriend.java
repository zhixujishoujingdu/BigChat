package com.example.zqx.bigchat;

/**
 * Created by Zqx on 2017/12/2.
 */

public class ItemFriend {
    private String name;
    private int imageId;
    public ItemFriend(String name, int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName( ){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
