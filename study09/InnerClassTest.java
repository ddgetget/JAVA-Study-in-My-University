package cn.legeyung.study09;

/**
 * 内部类的学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class InnerClassTest {
	class Clothes {
		private String material; // 设置材料
		private int size; // 设置大小
		private String color; // 设置颜色

		public String getColor() { // 创建set/get方法
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}
	}

}

class Coat extends InnerClassTest.Clothes {
	public Coat(InnerClassTest o) {
		o.super(); // 初始化外围类的引用
	}
}
