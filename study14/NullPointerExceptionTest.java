package cn.legeyung.study14;

/**
 * 
 * @author Óºçç¸ý(Lege_Yung)
 *
 */
public class NullPointerExceptionTest {
	public static void main(String[] args) {
		ClassTest ct = null;
		ct.getName();
	}
}

class ClassTest {
	private String name; // ÐÕÃû

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
