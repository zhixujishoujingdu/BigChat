package com.example.zqx.bigchat;

/**
 * Created by Zqx on 2017/12/7.
 */

public class Message {
    public static final int Recive = 0;
    public static final int Send=1;
    private String content;
    private int type;
    public Message(String content,int type){
        this.content=content;
        this.type=type;
    }
    public String getContent(){
        return content;
    }
    public int getType(){
        return type;
    }
}
