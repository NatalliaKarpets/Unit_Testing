package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCot extends BaseTest {

	@Test(dataProvider = "cotDataProvider")
	@Parameters({ "a", "expected" })
	public void testCot(double a, double expected) {
		double cotDouble = calc.ctg(a);
		Assert.assertEquals(cotDouble, expected);
	}

	@DataProvider(name = "cotDataProvider")

	public Object[][] cotDataProvider() {
		return new Object[][] { { 90.00, -0.50120278 }, { 1.00, 0.6421 }, { -90.00, 0.5012 }

		};
	}
}