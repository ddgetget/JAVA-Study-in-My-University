package cn.legeyung.study14;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class ThrowTest {
	public void throwException() throws Exception {
		String s = null;
		if (s == null) {
			throw new Exception("s的值为null");// s值为null时所抛出异常
		}
	}

	public static void main(String[] args) {
		ThrowTest tt = new ThrowTest();
		try {
			tt.throwException(); // 调用throwException方法
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
