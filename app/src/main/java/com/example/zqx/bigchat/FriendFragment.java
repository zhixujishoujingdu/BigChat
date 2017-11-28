
package com.example.zqx.bigchat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
//import android.support.v4.app.ListFragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Zqx on 2017/11/25.
 */

public class FriendFragment extends ListFragment{

   private String[] friend_list={"赵一","钱二","孙三","李四","周五","吴六","郑七","王八","何九","吕十","施百","张千","刘万"};

    private TextView text;
   /* @SuppressLint("MissingSuperCall")

    public void onActivityCreated(Bundle savedInstanceState){

    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.friend_fragment,container,false);
        setListAdapter(new MyAdapter());
        return view;
    }



    private class MyAdapter extends BaseAdapter{

        @Override
        //数组长度
        public int getCount() {
            return friend_list.length;
        }

        @Override

        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if(convertView == null){
                view = View.inflate(getActivity(),R.layout.item,null);
            }else{
                view = convertView;
            }
            text = (TextView) view.findViewById(R.id.item_textview);
            text.setText(friend_list[position]);

            return view;

        }
    }


}

