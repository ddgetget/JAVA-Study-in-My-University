package org.gaozou.book.javaabc.examples.ch25;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author TuringEmmy
 *
 */
public class GetIP {
    public static void main(String args[]) {
        InetAddress baidu = null;//创建一个InetAddress用于存放百度的地址
        InetAddress myIP = null;    //创建一个InetAddress用于存放本机地址
        InetAddress[] yahoo = null;//创建一个InetAddress用于存放雅虎地址数组
        //取得地址
        try {
            //使用getByName获得sina的IP地址
            baidu = InetAddress.getByName("www.baidu.com");
            //获得本机地址
            myIP = InetAddress.getLocalHost();
            //使用getAllByName获得yahoo的地址数组
            yahoo = InetAddress.getAllByName("www.yahoo.com.cn");
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(baidu);            //打印出百度地址
        System.out.println(myIP);            //打印出本机地址
        for (int i = 0; i < yahoo.length; i++)        //打印出雅虎的地址数组
            System.out.println(yahoo[i]);
    }
}
