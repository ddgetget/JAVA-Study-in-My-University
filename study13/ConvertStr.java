package cn.legeyung.study13;

import java.util.Arrays;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ConvertStr {
	public static int convInt(String s) { // 将字符串转换为整形数字
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public static Long convLong(String s) { // 将字符串转换为长整形
		try {
			return Long.parseLong(s);
		} catch (NumberFormatException e) {
			return 0l;
		}
	}

	public static Double convDouble(String s) { // 将字符串转换为双精度类型
		try {
			return Double.parseDouble(s);
		} catch (NumberFormatException e) {
			return 0d;
		}
	}

	public static int[] convIntArray(String[] as) { // 将一个字符串数组转换为整形数组
		if (as == null) {
			return new int[0];
		}
		int[] ia = new int[as.length];
		for (int i = 0; i < as.length; i++) {
			ia[i] = convInt(as[i]);
		}
		return ia;
	}

	public static void main(String[] args) {
		String s1 = null;
		System.out.println(s1 + " is converted into " + convInt(s1));
		String s2 = "789";
		System.out.println(s2 + " is converted into Integer: " + convInt(s2));
		String s3 = "9223372036854775807";
		System.out.println(s3 + " is converted into Integer: " + convInt(s3));
		System.out.println(s3 + " is converted into Long: " + convLong(s3));
		String s4 = "789.3";
		System.out.println(s4 + " is converted into Integer: " + convInt(s4));
		System.out.println(s4 + " is converted into Double: " + convDouble(s4));
		String[] as = null;
		convIntArray(as);
		System.out.println(Arrays.toString(convIntArray(as)));
	}
}
