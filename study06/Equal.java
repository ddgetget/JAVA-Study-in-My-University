package cn.legeyung.study06;

/**
 * equals()只要看起来相同就行 ==则是看地址
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Equal {
	public static void main(String[] args) {
		String stra = new String("你好");
		String strb = new String("你好");
		String strc = stra;

		boolean a = stra == strb;
		boolean b = stra == strc;

		boolean c = stra.equals(strb);
		boolean d = stra.equals(strc);

		System.out.println("使用“==”进行比较结果：");
		System.out.println("stra和strb进行比较：" + a + "\n" + "stra和strc进行比较：" + b
				+ "\n");
		System.out.println("使用“equal”方法进行比较结果：");
		System.out.println("stra和strb进行比较：" + c + "\n" + "stra和strc进行比较：" + d
				+ "\n");
	}
}
