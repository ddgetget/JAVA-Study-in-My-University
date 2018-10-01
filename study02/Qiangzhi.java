package cn.legeyung.study02;

/**
 * 类型转换
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class Qiangzhi {
	public static void main(String[] args) {
		// 声明两个变量
		int i = 111;
		// 强制转换
		byte b = (byte) i;
		System.out.println("int类型强制转换成byte后的值是：" + b);
		double d = 111.922;
		int j = (int) d; // 强转不尽兴四舍五入
		System.out.println("double强制转换为int后的值是：" + j);
	}
}
