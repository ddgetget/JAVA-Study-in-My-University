package cn.legeyung.study03;

/**
 * 产生不规则数组
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Two {
	public static void main(String[] args) {
		int[][] two = new int[4][];
		two[0] = new int[1];
		two[1] = new int[2];
		two[2] = new int[3];
		two[3] = new int[4];

		int k = 1;

		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[i].length; j++)
				two[i][j] = k++;
		}
		System.out.println("所得到的不规则数组为：");
		for (int i = 0; i < two.length; i++) {
			for (int j = 0; j < two[i].length; j++)
				System.out.print(two[i][j] + "   ");
			System.out.println();
		}
	}
}
