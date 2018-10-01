package cn.legeyung.study13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class FormatNum {
	public static String forNumber(Double d) { // 基本的数字格式化，如千分位等
		return NumberFormat.getNumberInstance().format(d);
	}

	public static String forCurrency(Double d) { // 以货币的形式，将数字格式化，06 此处使用美国地区
		return NumberFormat.getCurrencyInstance(Locale.US).format(d);
	}

	public static String forPercent(Double d) { // 按百分数的形式格式化数字
		return NumberFormat.getPercentInstance().format(d);
	}

	public static String forPattern(String p, Double d) { // 按照模式格式化数字，13
															// 比如小数点后几位，添加单位符号等
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(p);
		return df.format(d);
	}

	public static void main(String[] args) {
		Double d = 666888.0;
		System.out.println("格式化：" + d);
		System.out.println("-----------------");
		System.out.println("一般格式化：" + forNumber(d));
		System.out.println("货币格式化：" + forCurrency(d));
		System.out.println("百分比格式化：" + forPercent(d));
		String p = "0000.0";
		System.out.println("使用模式：" + p + " 格式化后：" + forPattern(p, d));
		p = "####000000000.00 $";
		System.out.println("使用模式：" + p + " 格式化后：" + forPattern(p, d));
		d = 367.5566;
		System.out.println("\n格式化：" + String.valueOf(d));
		System.out.println("-----------------");
		p = "0.00E0";
		System.out.println("使用模式：" + p + " 格式化后：" + forPattern(p, d));
		p = "#0.00%";
		System.out.println("使用模式：" + p + " 格式化后：" + forPattern(p, d));
	}
}
