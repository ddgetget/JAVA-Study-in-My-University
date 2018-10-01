package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;

/**
 * @author TuringEmmy
 *
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        reader();
    }

    public static void reader() throws IOException {    //新建一个方法，名为reader
        /**
         *   字符流测试
         */
        // 定义一个指向C:\\x.txt 的字节流
        FileInputStream fileInputStream = new FileInputStream("C:\\x.txt");
        //字节流转换成InputStreamReader
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //		InputStreamReader 转换成带缓存的bufferedReader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //	InputStreamReader 转换成带缓存的bufferedReader
        String ss = new String();
        String s;             //将读取出来的信息复制给字符串s

        while ((s = bufferedReader.readLine()) != null) {
            ss += s;
        }
        //定义一个指向输出的字节流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\x.txt");
        // 字节流转换成outputStreamWriter
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                fileOutputStream);
        //outputStreamWriter 转换成带缓存的bufferedReader
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write(ss);
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();
    }
}

