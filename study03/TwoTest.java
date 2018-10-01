package cn.legeyung.study03;

/**
 * 二维数组的创建
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class TwoTest {
	public static void main(String[] args) {
		int[][] two1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		// 第二种创建方式
		int[][] Two = new int[5][5];
		int k = 1;
		for (int i = 0; i < Two.length; i++) {
			for (int j = 0; j < Two[i].length; j++)
				Two[i][j] = k++;
		}
		System.out.println("输出two1数组");
		for (int i = 0; i < two1.length; i++) {
			for (int j = 0; j < two1[i].length; j++) {
				System.out.print(two1[i][j] + "  ");
			}
			System.out.println();

		}
		System.out.println("输出Two数组");
		for (int i = 0; i < Two.length; i++) {
			for (int j = 0; j < Two[i].length; j++) {
				System.out.print(Two[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
