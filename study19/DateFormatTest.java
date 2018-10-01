package org.gaozou.book.javaabc.examples.ch19;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author TuringEmmy
 *
 */
public class DateFormatTest {
    public static void main(String[] args) {

        Date date = new Date();
        DateFormat df1 = DateFormat.getInstance();
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE");
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,
                Locale.CHINA);
        DateFormat df4 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 EE",
                Locale.CHINA);
        DateFormat df5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EEEEEE",
                Locale.US);
        DateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df7 = new SimpleDateFormat("yyyy年MM月dd日");

        System.out.println("按照Java的默认格式进行输出，默认的区域是：" +
                df1.format(date));
        System.out.println("按照指定格式yyyy-MM-dd hh:mm:ss EE，系统默认区域是：" +
                df2.format(date));
        System.out.println("按照日期的FULL模式，区域设置为中文：" +
                df3.format(date));
        System.out.println("按照指定格式yyyy年MM月dd日 hh时mm分ss秒 EE，区域为中文：" +
                df4.format(date));
        System.out.println("按照指定格式yyyy-MM-dd hh:mm:ss EEEEEE，区域是美国：" +
                df5.format(date));

    }

}

