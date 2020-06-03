package com.essm.common;

import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

/**
 * @Description
 * 获取当前时间，以Integer值返回
 * @Author xuexue
 * @Date 2020/6/3 15:46
 */
@Configuration
public class DateUtils {
    /**
     * 获取当前时间，以Integer值返回
     *
     * @return 时间Integer值
     */
    public Integer getNowDate() {
        //得到现在的时间，转换为Integer类型进行数据库查询
        Calendar calendar = Calendar.getInstance();
        String nowTime = calendar.get(Calendar.YEAR) + "" + (calendar.get(Calendar.MONDAY) + 1) + calendar.get(Calendar.DATE);
        Integer time = Integer.parseInt(nowTime);
        return time;
    }
}
