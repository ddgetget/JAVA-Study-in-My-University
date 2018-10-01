package cn.legeyung.study06;

/**
 * this的深入学习（注意参数的使用原则）
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ThisTesttwo {
	String eat = "吃饭时间";
	String tea = "下午茶时间";
	int i = 16;

	public void eat(int i) {
		if (i > 11 && i < 14) {
			System.out.println("现在时间是" + i + "点，是" + eat);
		} else if (i > 15 && i < 17) {
			System.out.println("现在时间是" + i + "点，是" + tea);
		}

	}

	public void tea(int i) {

		if (this.i > 11 && this.i < 14) {
			System.out.println("现在时间是" + this.i + "点，是" + eat);
		} else if (this.i > 15 && this.i < 17) {
			System.out.println("现在时间是" + this.i + "点，是" + tea);
		}
	}

	public static void main(String[] args) {
		ThisTesttwo vp = new ThisTesttwo();
		vp.eat(12);
		vp.tea(12);
	}
}
