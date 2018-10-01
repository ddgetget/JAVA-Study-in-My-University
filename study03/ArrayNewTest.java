package cn.legeyung.study03;

/**
 * 数组的赋值
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ArrayNewTest {
	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = new int[5];
		array2[0] = 1;
		array2[1] = 2;
		array2[2] = 3;
		array2[3] = 4;
		array2[4] = 5;

		for (int i = 0; i < 5; i++) {
			System.out.println("数组array1[" + i + "]的值是：" + array1[i]);
			System.out.println("数组array2[" + i + "]的值是：" + array2[i]);
		}
	}
}
