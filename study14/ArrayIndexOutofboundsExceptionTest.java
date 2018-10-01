package cn.legeyung.study14;

/**
 * 
 * @author Óºçç¸ý(Lege_Yung)
 *
 */
public class ArrayIndexOutofboundsExceptionTest {
	public static void main(String[] args) {
		int[] i = new int[] { 1, 2, 3, 4, 5 };
		for (int j = 0; j < 6; j++) {
			System.out.println(i[j]);
		}
	}
}
