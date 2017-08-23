package com.example.android1.firebasechatapplication;

import android.graphics.Bitmap;

/**
 * Created by Android1 on 7/4/2017.
 */

public class ChatMessage {
    String message;
    String time;
    int type;
    Bitmap bitmap;

    ChatMessage(String message,String time,int type){
        this.message=message;
        this.time=time;
        this.type=type;
    }


    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setType(int type) {
        this.type = type;
    }

}
