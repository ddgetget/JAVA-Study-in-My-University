package cn.legeyung.study09;

/**
 * 个人感觉addVataminc方法没有关系
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class SporterTest {
	public void drink(Beverages drink) {
		System.out.println("运动员在引用" + drink);
	}

	public static void main(String[] args) {
		SporterTest sp = new SporterTest();
		sp.drink(new Beverages("橙汁") {
			public void addVataminc() {
				System.out.println("添加维他命C");
			}
		});

		sp.drink(new Beverages("可乐") {
			public void addVataminc() {
				System.out.println("添加二氧化碳");
			}
		});

		sp.drink(new Beverages("雪碧") {
			public void addVataminc() {
				System.out.println("添加二氧化碳");
			}
		});

		sp.drink(new Beverages("芬达") {
			public void addVataminc() {
				System.out.println("添加色素");
			}
		});
		sp.drink(new Beverages("绿茶") {
			public void addVataminc() {
				System.out.println("添加色素");
			}
		});
	}

}

class Beverages {
	private String juiceName;

	public Beverages(String name) {
		this.juiceName = name;
	}

	public String toString() {
		return juiceName;
	}
}
