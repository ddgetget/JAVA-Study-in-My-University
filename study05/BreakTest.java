package cn.legeyung.study05;

/**
 * break的测试，满足当前条件的不执行
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class BreakTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 6)
				break;
			System.out.println("当前执行的是i=" + i);
		}
	}
}
