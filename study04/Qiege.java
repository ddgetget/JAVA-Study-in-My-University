package cn.legeyung.study04;

/**
 * String的分割String.split(),正则表达式
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Qiege {
	public static void main(String[] args) {
		String str = "张三，回家吃饭，快点";

		String[] st = str.split("，");
		System.out.println("原句是：" + str);

		for (int i = 0; i < st.length; i++) {
			System.out.println("剪切后的第" + (i + 1) + "部分是：" + st[i]);
		}
	}
}
