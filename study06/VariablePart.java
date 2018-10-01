package cn.legeyung.study06;

/**
 * 
 * variable的学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class VariablePart {
	public void eat() {
		int i = 12;
		String eat = "吃饭时间";
		String tea = "下午茶时间";
		if (i > 11 && i < 14) {
			System.out.println("现在时间是" + i + "点，是" + eat);
		} else if (i > 15 && i < 17) {
			System.out.println("现在时间是" + i + "点，是" + tea);
		}

	}

	public void tea() {
		int i = 16;
		String eat = "吃饭时间";
		String tea = "下午茶时间";
		if (i > 11 && i < 14) {
			System.out.println("现在时间是" + i + "点，是" + eat);
		} else if (i > 15 && i < 17) {
			System.out.println("现在时间是" + i + "点，是" + tea);
		}
	}

	public static void main(String[] args) {
		VariablePart vp = new VariablePart();
		vp.eat();
		vp.tea();
	}
}
