package com.essm;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Description
 * 测试类
 *
 * @Author xuexue
 * @Date 2020/6/2 15:54
 */
public class Tes {
    @Test
    public void print() {
        /*Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 30);
        String nowTime = calendar.get(Calendar.YEAR) + "" + (calendar.get(Calendar.MONDAY) + 1) + calendar.get(Calendar.DATE);
        Integer time = Integer.parseInt(nowTime);
        System.out.println(time);*/

        Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        System.out.println(date);
    }

}