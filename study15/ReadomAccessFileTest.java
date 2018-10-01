package org.gaozou.book.javaabc.examples.ch15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author TuringEmmy
 *
 */
public class ReadomAccessFileTest {
    public static void RandomToWrite(File file) {
        Student[] students = new Student[4];
        // 创建Student数组
        // 初始化Student数组
        students[0] = new Student("优秀", "90");
        students[1] = new Student("优良", "80");
        students[2] = new Student("良好", "70");
        students[3] = new Student("及格", "60");
        RandomAccessFile randomAccessFile = null; // 创建RandomAccessFile对象
        try {
            randomAccessFile = new RandomAccessFile(file, "rw"); // 创建一个可以支持读写状态的
            //RandomAccessFile对象
        } catch (FileNotFoundException e1) {         // 捕获异常
            System.out.println("文件没有找到" + e1.getMessage());     // 输出异常信息
        }
        try {
            for (int i = 0; i < students.length; i++) // for遍历students数组
            {
                randomAccessFile.writeChars(students[i].getLevel());// 向文件中写入评分等级
                randomAccessFile.writeChars(students[i].getScore());// 向文件中写入分数
            }
            randomAccessFile.close(); // 关闭randomAccessFile
        } catch (IOException e1) {    // 捕获异常
            e1.printStackTrace();     // 输出异常信息
        }
    }

    private static String readName(RandomAccessFile randomAccessfile)
            throws IOException {
        char[] name = new char[5];     // 创建char类型数组
        for (int i = 0; i < name.length; i++) {
            name[i] = randomAccessfile.readChar();     // 读取字符
        }
        return new String(name);
    }

    public static Student[] RandomToRead(File file) throws Exception {
        RandomAccessFile randomAccessFile;         // 创建RandomAccessFile实例
        randomAccessFile = new RandomAccessFile(file, "r"); // 初始化randomAccessFile对象
        int num = (int) randomAccessFile.length() / Student.size(); // 返回Student类的占用空间大小
        Student[] student = new Student[num];     // 创建Student数组student
        for (int i = 0; i < num; i++) {
            randomAccessFile.seek((i) * Student.size());
            // 使用对应的read方法读出数据。
            student[i] = new Student(readName(randomAccessFile),
                    readName(randomAccessFile));
        }
        randomAccessFile.close();     // randomAccessFile关闭
        return student;         // 返回数组
    }

    public static void main(String[] args) throws Exception {
//		 创建，并初始文件名称
        String filename = "D:/temp/a.txt";
        File file = new File(filename); // 创建并初始File对象file
        RandomToWrite(file);     // 调用RandomWriteFile方法
        Student[] student = RandomToRead(file);     // 返回文件中保存的student数组
        // 使用for，遍历student数组
        System.out.println(filename + "的内容如下：");
        for (int i = 0; i < student.length; i++) {
            System.out.println("Level=" + student[i].getLevel() + "|Score="
                    + student[i].getScore());
        }
    }
}

class Student {
    String level;     // 评分级别
    String score;     // 分数
    final static int SIZE = 8;// 创建，并初始化静态域LEN

    public Student(String level, String score) {
        if (level.length() > SIZE) {
            level = level.substring(0, 8); // 截取字符串的子字符串
        } else {
            while (level.length() < SIZE)
                level = level + "\u0000";
        }
        this.level = level; // 初始化level
        this.score = score; // 初始化score
    }
    // 获取类占用的空间

    public static int size() {
        return 20;    // 字符串长度是8，一个字符占用2个字节，一个整型是4个字节
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
