package cn.legeyung.study04;

/**
 * String的替换 String.replace() String.replaceAll() String.replaceFirst()
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Xiugai {
	public static void main(String[] args) {
		String s1 = new String("第一个测试");
		String str = s1.replace('一', '二');
		System.out.println(str);

		String s2 = new String("第二个测试");
		String str2 = s2.replaceAll("二", "三");
		System.out.println(str2);

		String s3 = new String("第三个测试");
		String str3 = s3.replaceFirst("三", "四");
		System.out.println(str3);
	}
}
