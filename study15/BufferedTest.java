package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;

/**
 * @author TuringEmmy
 *
 */
public class BufferedTest {
    public static void bufferedtest() {
        FileInputStream fis = null;        //声明文件输入流
        FileOutputStream fos = null;        //声明文件输出流
        BufferedInputStream bis = null;    //声明缓冲输入流
        BufferedOutputStream bos = null;    //声明缓冲输出流
        String name1 = "java.txt";        //设置读取目标文件
        String name2 = "copyjava.txt";        //设置写入目标文件
        int i;
        try {
            fis = new FileInputStream(name1);
            bis = new BufferedInputStream(fis);

            fos = new FileOutputStream(name2);
            bos = new BufferedOutputStream(fos);

            i = bis.read();                    //读取方法
            while (i != -1) {
                bos.write(i);                //写入方法
                i = bis.read();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) //主方法
    {
        bufferedtest();                //调用操作方法
    }
}

