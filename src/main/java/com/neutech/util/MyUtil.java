package com.neutech.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MyUtil {
    /*获取当前周几*/
    public static String getWeek(){
        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar calendar=Calendar.getInstance();
        return weekDays[calendar.get(Calendar.DAY_OF_WEEK)-1];
    }

    /*获取当前是上午还是下午*/
    public static String getDay(){
        Date date = new Date();
        return getDay(date);
    }
    /*返回的是传进来的时间是上午下午*/
    public static String getDay(Date date){
        SimpleDateFormat df = new SimpleDateFormat("HH");
        String str = df.format(date);
        int a = Integer.parseInt(str);
        if (a >= 6 && a <=24) {
            return "上午";
        }else if (a >=0 && a <6) {
            return "下午";
        }
        return "不在工作时间";
    }

    /*返回当前是周几的上下午*/
    public static String getNow(){
        return getWeek()+getDay();
    }

    /*返回年月日时分秒*/
    public static String getPID(){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmss");
        String datef = sdf.format(new Date());
        return datef;
    }

    /**
     * 获取指定长度的字符串
     * @param num
     * @return
     */
    public static String getRand(int num){
        StringBuilder str=new StringBuilder();//定义变长字符串
        Random random=new Random();
        //随机生成数字，并添加到字符串
        for(int i=0;i<num;i++){
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

    /**
     * 将Date返回城String
     * @param date
     * @return
     */
    public static String dateToS(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String datef = sdf.format(date);
        return datef;
    }

    /**
     * 将String返回成Date
     * @param s
     * @return
     */
    public static Date sToDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(s);
    }
}
