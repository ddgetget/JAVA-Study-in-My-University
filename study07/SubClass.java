package cn.legeyung.study07;

/**
 * 抽象类的使用 子类如果有抽象类的而方法则覆盖父类的方法
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class SubClass extends AbstractClass {
	public void speak() {
		System.out.println("我请大家去吃饭...");
	}

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.speak();
		sc.eat();
	}
}

abstract class AbstractClass {
	public void eat() {
		System.out.println("我们一起去吃饭...");
	}

	public abstract void speak();
}
