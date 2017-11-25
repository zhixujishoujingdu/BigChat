package com.example.zqx.bigchat;

import android.os.Bundle;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //----------------------菜单栏----------------------------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(this,"暂不支持此功能！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.find:
                Toast.makeText(this,"暂不支持此功能！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.scan:
                Toast.makeText(this,"暂不支持此功能！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pay:
                Toast.makeText(this,"暂不支持此功能！",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

//-------------------------界面切换--------------------------------------


    Button btn1,btn2,btn3,btn4;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.talkBtn);
        btn1.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.friendBtn);
        btn2.setOnClickListener(this);
        btn3=(Button)findViewById(R.id.newsBtn);
        btn3.setOnClickListener(this);
        btn4=(Button)findViewById(R.id.mineBtn);
        btn4.setOnClickListener(this);

        replaceFragment(new TalkFragment());


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.talkBtn:
                replaceFragment(new TalkFragment());
                break;
            case R.id.friendBtn:
                replaceFragment(new FriendFragment());
                break;
            case R.id.newsBtn:
                replaceFragment(new NewsFragment());
                break;
            case R.id.mineBtn:
                replaceFragment(new MineFragment());
                break;
        }
    }


    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.change,fragment);
        transaction.commit();
    }

}
