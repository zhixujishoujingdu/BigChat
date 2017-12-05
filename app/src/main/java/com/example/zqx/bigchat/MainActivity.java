package com.example.zqx.bigchat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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


    ImageButton ib1,ib2,ib3,ib4;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib1=(ImageButton) findViewById(R.id.ib_talk);
        ib1.setOnClickListener(this);
        ib2=(ImageButton) findViewById(R.id.ib_friend);
        ib2.setOnClickListener(this);
        ib3=(ImageButton)findViewById(R.id.ib_news);
        ib3.setOnClickListener(this);
        ib4=(ImageButton) findViewById(R.id.ib_mine);
        ib4.setOnClickListener(this);

        replaceFragment(new TalkFragment());


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ib_talk:
                replaceFragment(new TalkFragment());
                break;
            case R.id.ib_friend:
                replaceFragment(new FriendFragment());
                break;
            case R.id.ib_news:
                replaceFragment(new NewsFragment());
                break;
            case R.id.ib_mine:
                replaceFragment(new MineFragment());
                break;
            default:
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
