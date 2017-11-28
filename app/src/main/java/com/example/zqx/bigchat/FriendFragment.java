
package com.example.zqx.bigchat;


import android.annotation.SuppressLint;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Zqx on 2017/11/25.
 */

public class FriendFragment extends Fragment {

    View view;
    ArrayAdapter<String>adapter;
    private String[]friend_list={"赵一","钱二","孙三","李四","周五","吴六","郑七","王八","何九","吕十","施百","张千"};



    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.friend_fragment, container, false);
        return view;
    }


    /*
    private String[]friend_list={"赵一","钱二","孙三","李四","周五","吴六","郑七","王八","何九","吕十","施百","张千"};
    public void onActivityCreated(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_fragment);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(
                FriendFragment.this,android.R.layout.simple_list_item_1,friend_list);
        ListView listView = (ListView)view.findViewById(R.id.friend_list);
        listView.setAdapter(adapter);

    }
*/

}

