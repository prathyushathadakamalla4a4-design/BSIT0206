package sf;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class second {

	@Test 
	@Parameters("browser")
	public void f1(String browser) {
		System.out.println("ggg" +browser);
	}
}
