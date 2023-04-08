import org.testng.annotations.Test;

public class TestNGExpectedException {

	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String a= "100A";
		Integer.parseInt(a); // It will throw Number Format Exception
	}
}
