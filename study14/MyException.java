package cn.legeyung.study14;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class MyException extends Exception { // 定义自己的异常类
	// 构造函数

	MyException() {
	}
	// 待参数的构造函数

	MyException(String msg) {
		super(msg); // 调用父类的方法
	}
}
