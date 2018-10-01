package cn.legeyung.study14;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class MoreCatchTest {
	public static void main(String[] args) {
		int[] a = new int[3];
		try {
			a[3] = 10;
			System.out.println("检查程序..");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("发生ArrayIndexOutOfBoundsException异常");
		} catch (ArithmeticException e1) {
			System.out.println("发生ArithmeticException异常");
		} catch (Exception e2) {
			System.out.println("发生Exception异常");
		}
		System.out.println("程序结束");
	}

}
