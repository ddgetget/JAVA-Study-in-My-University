package cn.legeyung.study06;

public class CupTest {
	public String color = "绿色";
	public int high = 12;
	public double price = 10.0;

	public CupTest() {

	}

	public CupTest(String color, int high, double price) {
		this.color = color;
		this.high = high;
		this.price = price;
	}

	public void water() {
		System.out.println("使用杯子喝水..");
	}

}
