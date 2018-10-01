package org.gaozou.book.javaabc.examples.ch19;

import java.util.Date;

/**
 * @author TuringEmmy
 *
 */
public class DateTest {
    public static void main(String[] args) {
        //获取到系统当前时间
        System.out.println("当前时间是：" + System.currentTimeMillis());
        //获取到系统当前日期
        Date date = new Date();
        System.out.println("现在的时间是：" + date.toString());
        //获取到从标准基准时间到现在的毫秒数
        System.out.println("自1970年1月1日0时0分0秒开始至今经历的毫秒数：	" + date.getTime());
    }
}
