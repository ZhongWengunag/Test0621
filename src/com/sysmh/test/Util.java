package com.sysmh.test;

import java.util.Date;

public class Util {
    //获取服务器时间
    public static int getLocalTime(){
        Date date = new Date();
        int d = date.getDate();
        int y = date.getYear();
        return d;

    }

    public static  String getText(){
        return "hello world";
    }
}
