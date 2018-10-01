package cn.legeyung.study09;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 导包练习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */

public class ImportTest {

	public static void main(String[] args) {

		File file = new File("test.java");

		Date date = new Date();

		System.out.println("当前时间是：" + date);

		BigDecimal decimal = new BigDecimal(5);

		// BigDecimal 不可变的、任意精度的有符号十进制数。BigDecimal 表示的数值是 (unscaledValue ×
		// 10-scale)。
		System.out.println("decimal:" + decimal);
	}

}
