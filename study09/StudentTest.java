package cn.legeyung.study09;

/**
 * 测试接口的主类
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class StudentTest {
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.Learning();
		stu.eat();
		stu.sleep();
	}
}

class Student1 implements Student {

	public void Learning() {
		// TODO Auto-generated method stub
		System.out.println("学生正在学习..");
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("学生正在吃饭...");
	}

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("学生正在睡觉...");
	}
}
