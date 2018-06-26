package com.bright.aop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 描述：
 *
 * @author liuyangyang
 * @create 2018-05-03 10:31
 **/
public class ProxyTest
{
    public static void main1(String[] args)
    {
        Person xiaoming = new Person();
        Object instance = new PersonProxy().getInstance(xiaoming);
        System.out.println(instance);
//        instance.say();
    }
    public static void main2(String[] args) {
        Date date = new Date(1359641834000L);// 2013-1-31 22:17:14
        String dateStr = "2013-1-31 22:17:14";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            Date dateTmp = dateFormat.parse(dateStr);
            dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date dateTmp1 = dateFormat.parse(dateStr);
            System.out.println(dateTmp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dateStrTmp = dateFormat.format(date);

        System.out.println(dateStrTmp);
    }
    public static void main(String[] args) {
        Date date = new Date();// 2013-1-31 22:17:14
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        // 或者可以 Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE));
    }
}
