package cn.legeyung.study03;

/**
 * 索引排序法
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class SortTest {
	public static void main(String[] args) {
		int[] intarray = { 1, 23, 45, 66, 2, 332, 8, 5 };
		int keyvalue;
		int index;
		int temp;
		System.out.println("排序前的数组元素");
		for (int a : intarray) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int i = 0; i < intarray.length; i++) {
			index = i;
			keyvalue = intarray[i];
			for (int j = i; j < intarray.length; j++) {
				if (intarray[j] < keyvalue) {
					index = j;
					keyvalue = intarray[j];
				}
			}
			temp = intarray[i];
			intarray[i] = intarray[index];
			intarray[index] = temp;
		}
		System.out.println("排序后的数组：");
		for (int b : intarray) {
			System.out.print(b + " ");
		}
	}
}
