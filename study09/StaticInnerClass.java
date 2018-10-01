package cn.legeyung.study09;

/**
 * 静态内部类
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class StaticInnerClass {
	public static void main(String[] args) {
		Painter p = new Painter();
		p.setName("张三");
		p.print();
	}
}

class Painter {
	private Pen pen = new Pen();
	private String name = "";

	static class Pen {
		private String lead = "铅笔芯";
		public void print() {
			System.out.println("使用铅笔..");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void print() {
		pen.print();
	}
}
