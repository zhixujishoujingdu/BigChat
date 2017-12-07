package com.example.zqx.bigchat;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Zqx on 2017/12/7.
 */

public class AdapterMessage extends ArrayAdapter{
    private int resourseId;
    public AdapterMessage(Context context,int resource, List objects) {
        super(context, resource, objects);
        resourseId = resource;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        Message message = (Message) getItem(position);
        View view;
        class ViewHolder{
            LinearLayout leftLayout;
            LinearLayout rightLayout;
            TextView leftMsg;
            TextView rightMsg;
        }
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourseId,null);
            viewHolder = new ViewHolder();
            viewHolder.leftLayout = (LinearLayout)view.findViewById(R.id.left);
            viewHolder.rightLayout = (LinearLayout)view.findViewById(R.id.right);
            viewHolder.leftMsg = (TextView)view.findViewById(R.id.recive);
            viewHolder.rightMsg = (TextView)view.findViewById(R.id.send);
            view.setTag(viewHolder);
        }else
        {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        if(message.getType()==message.Recive){
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightLayout.setVisibility(View.GONE);
            viewHolder.leftMsg.setText(message.getContent());
        }else if(message.getType()==message.Send){
            viewHolder.rightLayout.setVisibility(View.VISIBLE);
            viewHolder.leftLayout.setVisibility(View.GONE);
            viewHolder.rightMsg.setText(message.getContent());
        }
        return view;
    }
}
