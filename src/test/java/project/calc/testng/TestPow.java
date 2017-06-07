package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPow extends BaseTest {

	@Test(dataProvider = "powDataProvider")
	@Parameters({ "a", "b", "expected" })
	public void testPow(double a, double b, double expected) {
		double powDouble = calc.pow(a, b);
		Assert.assertEquals(powDouble, expected);
	}

	@DataProvider(name = "powDataProvider")

	public Object[][] powDataProvider() {
		return new Object[][] { { 2.00, 3.00, 8.00 }, { 0.00, 0.00, 0.00 }, { -2.00, 3.00, -8.00 }

		};
	}
}