
package com.example.zqx.bigchat;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zqx on 2017/11/25.
 */
public class FriendFragment extends Fragment {
    private List<FriendItem> friendList = new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.friend_fragment, container, false);
        ListView l2 =(ListView) view.findViewById(android.R.id.list);
        initFriends();
        FriendAdapter adapter = new FriendAdapter(getActivity(),R.layout.item_friends,friendList
        );
        l2.setAdapter(adapter);
        return view;
    }


    private void initFriends() {
        for(int i=0;i<2;i++) {
            FriendItem Zhao = new FriendItem("赵一", R.drawable.cat);
            friendList.add(Zhao);
            FriendItem Qian = new FriendItem("钱二", R.drawable.dark);
            friendList.add(Qian);
            FriendItem Sun = new FriendItem("孙三", R.drawable.dog);
            friendList.add(Sun);
            FriendItem Li = new FriendItem("李四", R.drawable.excuse);
            friendList.add(Li);
            FriendItem Zhou = new FriendItem("周五", R.drawable.gril);
            friendList.add(Zhou);
            FriendItem Wu = new FriendItem("吴六", R.drawable.jack);
            friendList.add(Wu);
            FriendItem Zheng = new FriendItem("郑七", R.drawable.plan);
            friendList.add(Zheng);
            FriendItem Wang = new FriendItem("王八", R.drawable.smoke);
            friendList.add(Wang);
            FriendItem He = new FriendItem("何九", R.drawable.sad);
            friendList.add(He);
        }
    }
}
/*
public class FriendFragment extends ListFragment{

   private String[] friend_list={"赵一","钱二","孙三","李四","周五","吴六","郑七","王八","何九","吕十","施百","张千"};

    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.friend_fragment,container,false);
        setListAdapter(new MyAdapter());
        return view;
    }



    private class MyAdapter extends BaseAdapter{

        @Override

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
                view = View.inflate(getActivity(),R.layout.item_friends,null);
            }else{
                view = convertView;
            }
            text = (TextView) view.findViewById(R.id.friend_name);
            text.setText(friend_list[position]);

            return view;

        }
    }

}
*/

