import org.testng.annotations.Test;

public class TestNGInvocationCount {

	@Test(invocationCount=5)
	public void sum() {
		int a=110;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
