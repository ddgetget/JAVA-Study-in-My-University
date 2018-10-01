package cn.legeyung.study07;

/**
 * 用到了MiniCar文件里面的Car类
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class MiniCar2 extends Car {
	private int maxspeed;

	public static void main(String[] args) {
		MiniCar2 car = new MiniCar2();
		System.out.println("父类中车的颜色是：" + car.color);
		car.setColor("blue");
		System.out.println("子类中车的颜色是：" + car.color);

		System.out.print("小汽车的最大速度是：");
		car.setMaxspeed(180);
		System.out.println(car.maxspeed);

	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
}
