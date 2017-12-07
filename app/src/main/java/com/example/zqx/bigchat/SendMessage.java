package com.example.zqx.bigchat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zqx on 2017/12/7.
 */

public class SendMessage extends AppCompatActivity{
    private EditText editText;
    private ListView listView;
    private AdapterMessage adapter;
    private List<Message> msgList = new ArrayList<Message>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendmessage);
        listView = (ListView)findViewById(R.id.mes_l);
        Button send = (Button) findViewById(R.id.send_mes);

        initMessage();
        adapter = new AdapterMessage(SendMessage.this,R.layout.mes_item,msgList);
        editText = (EditText) findViewById(R.id.message);
        editText.setText("");
        listView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String content = editText.getText().toString();
                if(!content.equals("")){
                    msgList.add(new Message(content,Message.Send));
                    msgList.add(new Message("我不知道你在说的什么鬼",Message.Recive));
                    adapter.notifyDataSetChanged();
                    listView.setSelection(msgList.size());
                    editText.setText("");
                }
            }
        });
    }
    private void initMessage(){
        Message msg1 = new Message("Hello guy.",Message.Recive);
        msgList.add(msg1);
        Message msg2 = new Message("Hello who is that?",Message.Send);
        msgList.add(msg2);
        Message msg3 = new Message("This is Tom.Nice to meet you.",Message.Recive);
        msgList.add(msg3);
    }
}
