package cn.legeyung.study03;

/**
 * 数组冒泡排序法
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class MaopaoTest {
	public static void main(String[] args) {
		int[] intarray = { 1, 2, 33, 5, 34, 67, 213, 8 };
		System.out.println("排序前的数组：");
		for (int i = 0; i < intarray.length; i++)
			System.out.print(intarray[i] + "   ");
		int temp;
		System.out.println();
		
		for (int i = 0; i < intarray.length; i++) {
			for (int j = i; j < intarray.length; j++) {
				if (intarray[j] < intarray[i]) {
					temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;
				}
			}

		}
		System.out.println("排序后的数组");
		for (int i = 0; i < intarray.length; i++) {
			System.out.print(intarray[i] + "   ");
		}
	}
}
