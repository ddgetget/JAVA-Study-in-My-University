package cn.legeyung.study07;

/**
 * set和get方法的使用
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class MiniCar extends Car {
	public static void main(String[] args) {
		MiniCar car = new MiniCar();
		System.out.println("父类中车的颜色是：" + car.color);
		car.setColor("blue");
		System.out.println("子类中车的颜色是: " + car.color);
	}
}

class Car {
	String color = "red";

	public void setColor(String c) {
		this.color = c;
	}
}
