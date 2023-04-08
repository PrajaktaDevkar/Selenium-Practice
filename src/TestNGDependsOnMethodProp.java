import org.testng.annotations.Test;

public class TestNGDependsOnMethodProp {

	@Test
	public void login() {
		System.out.println("Login Test");
		int i= 1/0;
	}
	
	@Test(dependsOnMethods="login",priority=1)
	public void homePage() {
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods="login",priority=2)
	public void searchPage() {
		System.out.println("search Page Test");
	}
	
	@Test(dependsOnMethods="login",priority=3)
	public void RegPage() {
		System.out.println("Reg Page Test");
	}
}
