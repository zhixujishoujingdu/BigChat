
package com.example.zqx.bigchat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
//import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Zqx on 2017/11/25.
 */

public class FriendFragment extends Fragment{

   /* private String[]friend_list={"赵一","钱二","孙三","李四","周五","吴六","郑七","王八"};
    @SuppressLint("MissingSuperCall")

    public void onActivityCreated(Bundle savedInstanceState){

    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.friend_fragment,container,false);
        return view;
    }

}

