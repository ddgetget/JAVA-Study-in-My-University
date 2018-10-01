package cn.legeyung.study05;

/**
 * return的学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ReturnTest {
	public boolean var(int i) {
		if (i > 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		if (rt.var(-2)) {
			System.out.println("输入的值为正数..");
		} else {
			System.out.println("输入的值为负数..");
		}
	}
}
