package org.gaozou.book.javaabc.examples.ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author TuringEmmy
 *
 */
public class FileReaderTest {
    public static void filereadertest() {
        String name = "javatest.txt";        // New一个字符串类型的name，并赋初值为“java.txt”
        try {
            FileReader fr = new FileReader(name); //创建一个指定文件名的FileReader，并传值name;
            char[] c = new char[1];        //new 一个char类型长度为1的数组
            while (fr.read(c) != -1) {        //循环判断是否读取到文件的底部
                System.out.print(new String(c)); //将读取到的内容打印到显示器上
            }

            fr.close();                        //关闭流
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args)         //主方法
    {
        filereadertest();                        //调用操作方法
    }
}

