package cn.legeyung.study06;

/**
 * 创建对象 构造函数
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class CreateObjectTest {
	public static void main(String[] args) {
		Cup cup = new Cup();
		System.out.println("对杯子没有要求");
		Cup cupch = new Cup("红色", 15);
		System.out.println("一个高为15厘米的红色杯子");
		Cup cupph = new Cup(10.0, 15);
		System.out.println("一个高为15厘米，价格为10元的杯子");
		Cup cuppc = new Cup(10.0, "红色");
		System.out.println("一个10元的红色杯子");
		Cup cuppch = new Cup(10.0, "红色", 15);
		System.out.println("一个价格为10元高为15厘米的红色杯子");
	}

}

class Cup {
	private int high;
	private String color;
	private double price;

	public Cup() {
	}

	public Cup(String color, int high) {
		this.color = color;
		this.high = high;
	}

	public Cup(double price, int high) {
		this.price = price;
		this.high = high;

	}

	public Cup(double price, String color) {
		this.price = price;
		this.color = color;
	}

	public Cup(double price, String color, int high) {
		this.price = price;
		this.color = color;
		this.high = high;
	}
}
