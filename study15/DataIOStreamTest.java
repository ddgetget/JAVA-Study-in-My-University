package org.gaozou.book.javaabc.examples.ch15;

import java.io.*;

/**
 * @author TuringEmmy
 *
 */
public class DataIOStreamTest {
    public static void main(String[] args) {
        String filename = "f:\\FileTest\\DataioStreamTest.txt";
//创建，并初始化文件名字符串
        //创建，并初始化People类型数组
        People[] people = {
                new People("赵子龙", 23),
                new People("关云长", 24),
                new People("曹操", 25),
                new People("刘备", 22)};
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(
                    new FileOutputStream(filename));        //创建DataOutputStream对象
            for (People Employee : people)                 //使用for变量
            {
                // 写入字符串
                dataOutputStream.writeUTF(Employee.getName());
                // 写入数据
                dataOutputStream.writeInt(Employee.getAge());
            }
            // 读出所有数据至目的地
            dataOutputStream.flush();
            // 关闭流
            dataOutputStream.close();
            DataInputStream dataInputStream = new DataInputStream(
                    new FileInputStream(filename));
            // 读出数据并还原为对象
            for (int i = 0; i < people.length; i++) {
                // 读出UTF字符串
                String name = dataInputStream.readUTF();
                // 读出int数据
                int score = dataInputStream.readInt();
                people[people.length - 1 - i] = new People(name, score);
            }
            // 关闭流
            dataInputStream.close();
            // 输出还原后的数据
            for (People Employee : people) {
                System.out.printf("%s\t%d%n",
                        Employee.getName(), Employee.getAge());    //格式化输出
            }
        }
        catch (IOException e) {        //捕获异常
            e.printStackTrace();    //异常信息输出
        }
    }
}

