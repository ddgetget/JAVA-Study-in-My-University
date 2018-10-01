package cn.legeyung.study06;

/**
 * this的再次学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ThisTest {
	private String eat = "正在吃饭...";
	private String tea = "正在喝茶...";
	private String work = "正在工作....";

	public void zhagnsna() {
		System.out.println("使用this关键字来引用成员变量，各变量输出为：");
		System.out.println("张三" + this.eat);
		System.out.println("张三" + this.tea);
		System.out.println("张三" + this.work);
	}

	public void lisi() {
		System.out.println("不使用this关键字来引用成员变量，各变量输出为：");
		System.out.println("李四" + eat);
		System.out.println("李四" + tea);
		System.out.println("李四" + work);
	}

	public static void main(String[] args) {
		new ThisTest().zhagnsna();
		new ThisTest().lisi();
	}
}
