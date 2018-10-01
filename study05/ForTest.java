package cn.legeyung.study05;

/**
 * for循环的测试
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ForTest {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {

			System.out.println("外层第" + i + "次循环");
			for (int j = 0; j < 3; j++) {
				System.out.println("内层第" + j + "次循环");

				int k = 5;
			}
			System.out.println();
		}
	}
}
