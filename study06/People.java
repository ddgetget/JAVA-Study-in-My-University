package cn.legeyung.study06;


public class People {
    public String name = "张三";
    public String sex = "男";
    public int age = 23;
    public String address = "北京市海淀区";

    public People() {

    }

    public People(String name, String sex, int age, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public String eat() {
        return "正在吃饭...";
    }
}
