package cn.legeyung.study07;

/**
 * tostring的使用 有参函数与无参函数的使用
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ToStringTest {
	public static void main(String[] args) {
		ToString ts = new ToString();
		ts.name = "张三";
		ts.age = 22;
		ts.sex = "男";
		System.out.println(ts);
	}
}

class ToString {
	String name;
	int age;
	String sex;

	public ToString() {
	}

	public ToString(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return "姓名:" + name + "\n年龄:" + age + "\n性别:" + sex;
	}
}
