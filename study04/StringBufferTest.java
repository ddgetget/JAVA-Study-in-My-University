package cn.legeyung.study04;

/**
 * 线程安全的可变字符序列StringBuffer StringBuffer 上的主要操作是 append 和 insert 方法
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		// append()追加到此序列
		sb.append("张三，");
		sb.append("回家，");
		sb.append("吃饭。");

		System.out.println(sb.toString());

		int i = sb.length();
		System.out.println("StringBuffer的长度是：" + i);
	}

}
