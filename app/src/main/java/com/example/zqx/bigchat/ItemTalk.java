package com.example.zqx.bigchat;

/**
 * Created by Zqx on 2017/12/5.
 */

public class ItemTalk {
    private String talk_name;
    private String talk_record;
    private int talk_imageId;

    public ItemTalk(String talk_name,String talk_record,int talk_imageId){
        this.talk_name=talk_name;
        this.talk_record=talk_record;
        this.talk_imageId=talk_imageId;
    }
    public String getTalk_name(){
        return talk_name;
    }
    public String getTalk_record(){
        return  talk_record;
    }
    public int getTalk_imageId(){
        return talk_imageId;
    }
}
