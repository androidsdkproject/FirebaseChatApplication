package com.example.android1.firebasechatapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by Android1 on 7/4/2017.
 */

public class ChatAdapter extends ArrayAdapter<ChatMessage> {

    private final Context context;
    private final ArrayList<ChatMessage> itemsArrayList;



    public ChatAdapter(Context context, ArrayList<ChatMessage> itemsArrayList) {
        super(context, R.layout.chat_row, itemsArrayList);

        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.chat_row, parent, false);



        TextView sendermsg=(TextView)rowView.findViewById(R.id.sendermessage);
        TextView sendertime=(TextView)rowView.findViewById(R.id.sendertime);
        TextView receivermessage=(TextView)rowView.findViewById(R.id.receivermessage);
        TextView receivertime=(TextView)rowView.findViewById(R.id.receivertime);
        ImageView imageView=(ImageView)rowView.findViewById(R.id.imagechat);
        imageView.setVisibility(View.GONE);
        Log.d(TAG,itemsArrayList.get(position).getType()+"    bgfdkjf");
        if(itemsArrayList.get(position).getType()==1)
        {
            Log.d(TAG,"type 1");
            receivermessage.setVisibility(View.VISIBLE);
            receivertime.setVisibility(View.VISIBLE);
            receivermessage.setText(itemsArrayList.get(position).getMessage()+"bgfdkjf");
            receivertime.setText(itemsArrayList.get(position).getTime()+"dsbhbg");

        }
        else
        {
            sendermsg.setVisibility(View.VISIBLE);
            sendertime.setVisibility(View.VISIBLE);
            sendermsg.setText(itemsArrayList.get(position).getMessage()+"sfdi");
            sendertime.setText(itemsArrayList.get(position).getTime()+"fdjfhd");
        }
        return rowView;
    }
}