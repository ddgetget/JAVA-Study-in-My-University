package cn.legeyung.study02;

/**
 * 位运算及表达式
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class PositionTest {
	public static void main(String[] args) {
		// 使用位运算>>
		System.out.println("00001111>>2 运算结果是：" + (00001111 >> 2));
		// 使用位运算>>
		System.out.println("11000011>>2 运算结果是：" + (11000011 >> 2));
		// 使用位运算<<
		System.out.println("00001111<<2 运算结果是：" + (00001111 << 2));
		// 使用位运算<<
		System.out.println("11000011<<2 运算结果是：" + (11000011 << 2));
		// 使用位运算&
		System.out.println("00001111 & 00001111 运算结果是：" + (00001111 & 0000111));
		// 使用位运算|
		System.out
				.println("00001111 | 00001111 运算结果是：" + (00001111 | 00001111));
		// 使用位运算^
		System.out
				.println("00001111 ^ 00001111 运算结果是：" + (00001111 ^ 00001111));
		// 使用位运算~
		System.out.println("~ 00001111 运算结果是：" + (~00001111));
	}
}
