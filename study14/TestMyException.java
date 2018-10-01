package cn.legeyung.study14;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class TestMyException {
	public static void main(String args[]) {
		MyException mec = new MyException("这是我自定义的异常类"); // 创建自己的异常类对象
		System.out.println(mec.getMessage()); // 调用getMessage方法
		System.out.println(mec.toString());
	}
}
