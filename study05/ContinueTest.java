package cn.legeyung.study05;

/**
 * continue测试 个人感觉没有用
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ContinueTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println("当前执行的是i=" + i);
		}
	}
}
