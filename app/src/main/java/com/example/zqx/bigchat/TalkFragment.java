package com.example.zqx.bigchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zqx on 2017/11
 */

public class TalkFragment extends Fragment {

    List<ItemTalk> talkList=new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    ListView talk_listView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.talk_fragment,container,false);
        talk_listView=(ListView) view.findViewById(android.R.id.list);

        initRecord();

        AdapterTalk talk_adapter=new AdapterTalk(getActivity(),R.layout.item_talk,talkList);
        talk_listView.setAdapter(talk_adapter);
        talk_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),SendMessage.class);
                startActivity(intent);
            }
        });

        return view;

    }


    private void initRecord() {
        ItemTalk Zhao = new ItemTalk("赵一","hello",R.drawable.cat);
        talkList.add(Zhao);
        ItemTalk Wang = new ItemTalk("王八","It`s me.", R.drawable.smoke);
        talkList.add(Wang);
        ItemTalk He = new ItemTalk("何九","你丫干啥呢？", R.drawable.sad);
        talkList.add(He);
    }

}
