package cn.legeyung.study09;

/**
 * 创建接口对象 类对象达到同样的效果
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class AnonymousInnerTest {
	public static void main(String[] args) {
		DustMan dm = new DustMan();
		dm.cleanWithBroom();
		dm.cleanWithDustCollector();
	}

}

class DustMan {
	public void cleanWithBroom() {
		Utility util = new Utility() {
			public void clean() {
				System.out.println("正在清洁卫生...");
			}
		};
		util.clean();
	}

	public void cleanWithDustCollector() {
		ElectronicUtil util = new ElectronicUtil() {
			public void clean() {
				System.out.println("正在使用吸尘器清洁卫生....");
			}
		};
		util.clean();
	}
}

interface Utility {
	public void clean();
}

class ElectronicUtil {
	public void clean() {
		System.out.println("使用电子设备情节卫生...");
	}

}
