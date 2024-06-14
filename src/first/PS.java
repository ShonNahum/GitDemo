package first;

import org.testng.annotations.BeforeMethod;

public class PS {

	public static void Text() {
		System.out.println("parent");
	}
	@BeforeMethod
		public static void Before() {
			System.out.println("im before");
		}
}
