package cn.legeyung.study14;

/**
 * 
 * @author Óºçç¸ý(Lege_Yung)
 *
 */
public class ExceptionStackTest {
	public static void main(String[] args) throws Exception {
		ExceptionStackTest est = new ExceptionStackTest();
		est.wrapThrowException();
		est.ThrowException();
	}

	public void topThrowException() throws Exception {
		topThrowException();
	}

	public void wrapThrowException() throws Exception {
		ThrowException();
	}

	public void ThrowException() throws Exception {
		throw new Exception();
	}
}
