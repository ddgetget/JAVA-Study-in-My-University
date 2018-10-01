package org.gaozou.book.javaabc.examples.ch25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author TuringEmmy
 *
 */
public class URLTest {
    public static void main(String[] args) {
        try {
            //创建一个URL对象
            URL url = new URL("http://news.163.com/special/00014J0Q/nanjingexplode.html");
            System.out.println("url内容：" + url.getContent());    //获取资源内容
            System.out.println("主机：" + url.getHost());    //获取资源的地址
            System.out.println("端口：" + url.getPort());    //获取资源的端口
            System.out.println("查询名:" + url.getQuery());    //获取该资源的查询名
            System.out.println("路径：" + url.getPath());    //获取该资源的文件路径
            System.out.println("文件名：" + url.getFile());    //获取该资源的文件名
            System.out.println("授权：" + url.getAuthority());    //获取该资源的授权
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

