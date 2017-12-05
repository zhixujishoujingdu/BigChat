package com.example.zqx.bigchat;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Zqx on 2017/12/5.
 */

public class AdapterTalk extends ArrayAdapter<ItemTalk> {
    private int resourceId;

    public AdapterTalk( Context context,  int textViewResourceId,  List<ItemTalk> objects) {
        super(context,textViewResourceId , objects);
        resourceId=textViewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent){

        ItemTalk itemTalk=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        ImageView talkImage=(ImageView)view.findViewById(R.id.talk_image);
        TextView talkName=(TextView)view.findViewById(R.id.talk_name);
        TextView talkRecord=(TextView)view.findViewById(R.id.talk_record);

        talkImage.setImageResource(itemTalk.getTalk_imageId());
        talkName.setText(itemTalk.getTalk_name());
        talkRecord.setText(itemTalk.getTalk_record());

        return view;

    }
}
