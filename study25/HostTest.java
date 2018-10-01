package org.gaozou.book.javaabc.examples.ch25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author TuringEmmy
 *
 */
public class HostTest {
    private static String lookup(String host) {
        InetAddress ia;
        byte[] b = null;    // 初始化一个byte类型的数组
        try {
            ia = InetAddress.getByName(host);
        } catch (UnknownHostException e) {
            return "没有找到主机！";
        }
        if (isHostName(host)) {    //判断是否有主机
            String s = "";        //定义一个字符串
            for (int i = 0; i < b.length; i++) {//循环遍历出主机的字符串
                int c = b[i] < 0 ? (b[i] + 256) : b[i];
                s += c;
                if (i != b.length - 1) {
                    s += ",";
                }
            }
            return s;              //返回一个字符串
        } else {
            return ia.getHostName();//返回一个字符串的
        }
    }

    private static boolean isHostName(String host) {
        char[] ch = host.toCharArray();//定义一个字符数组，并初始化
        for (int i = 0; i < ch.length; i++) {
            if (!Character.isDigit(ch[i])) {
                if (ch[i] != '.') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {     // 使用命令行
                System.out.println(lookup(args[i]));
            }
        } else {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println();
            while (true) {
                try {
                    String s = br.readLine();
                    if (s.equals("exit")) {//判断如果字符串与“exit”相同，就结束当前的语句块
                        break;
                    }
                    System.out.println(lookup(s));
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }
    }
}
