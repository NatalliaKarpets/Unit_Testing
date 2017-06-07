package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSin extends BaseTest {

	@Test(dataProvider = "sinDataProvider")
	@Parameters({ "a", "expected" })
	public void testSin(double a, double expected) {
		double sinDouble = calc.sin(a);
		Assert.assertEquals(sinDouble, expected);
	}

	@DataProvider(name = "sinDataProvider")

	public Object[][] sinDataProvider() {
		return new Object[][] { { 90.00, 0.8939966636005579 }, { 0.00, 0.00 }, { -90.00, -0.8939966636005579 }

		};
	}
}