
package com.example.zqx.bigchat;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zqx on 2017/11/25.
 */
public class FriendFragment extends ListFragment {
    List<ItemFriend> friendList = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.friend_fragment, container, false);
        ListView listView =(ListView) view.findViewById(android.R.id.list);

        initFriends();

        AdapterFriend adapter = new AdapterFriend(getActivity(),R.layout.item_friends,friendList);
        listView.setAdapter(adapter);

        return view;

    }


    public void initFriends() {

            ItemFriend Zhao = new ItemFriend("赵一", R.drawable.cat);
            friendList.add(Zhao);
            ItemFriend Qian = new ItemFriend("钱二", R.drawable.dark);
            friendList.add(Qian);
            ItemFriend Sun = new ItemFriend("孙三", R.drawable.dog);
            friendList.add(Sun);
            ItemFriend Li = new ItemFriend("李四", R.drawable.excuse);
            friendList.add(Li);
            ItemFriend Zhou = new ItemFriend("周五", R.drawable.gril);
            friendList.add(Zhou);
            ItemFriend Wu = new ItemFriend("吴六", R.drawable.jack);
            friendList.add(Wu);
            ItemFriend Zheng = new ItemFriend("郑七", R.drawable.plan);
            friendList.add(Zheng);
            ItemFriend Wang = new ItemFriend("王八", R.drawable.smoke);
            friendList.add(Wang);
            ItemFriend He = new ItemFriend("何九", R.drawable.sad);
            friendList.add(He);

    }
}

