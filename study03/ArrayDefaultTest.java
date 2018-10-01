package cn.legeyung.study03;

/**
 * 创建数组
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ArrayDefaultTest {
	public static void main(String[] args) {
		// 创建一个byte类型的数组
		byte[] byteArray = new byte[1];
		// 创建一个char类型的数组
		char[] charArray = new char[1];
		// 创建一个int类型的数组
		int[] intArray = new int[1];
		// 创建一个long类型的数组
		long[] longArray = new long[1];
		// 创建一个float类型的数组
		float[] floatArray = new float[1];
		// 创建一个double类型的数组
		double[] doubleArray = new double[1];

		System.out.println("byte类型的默认值为：" + byteArray[0]);
		System.out.println("char类型的默认值为：" + charArray[0]);
		System.out.println("int类型的默认值为：" + intArray[0]);
		System.out.println("long类型的默认值为：" + longArray[0]);
		System.out.println("float类型的默认值为：" + floatArray[0]);
		System.out.println("double类型的默认值为：" + doubleArray[0]);
	}
}
