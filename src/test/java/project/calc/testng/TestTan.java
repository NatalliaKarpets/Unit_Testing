package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestTan extends BaseTest {

	@Test(dataProvider = "tanDataProvider")
	@Parameters({ "a", "expected" })
	public void testTan(double a, double expected) {
		double tanDouble = calc.ctg(a);
		Assert.assertEquals(tanDouble, expected);
	}

	@DataProvider(name = "tanDataProvider")

	public Object[][] tanDataProvider() {
		return new Object[][] { { 90.00, -1.99520041221 }, { 0.00, 0.00 }

		};
	}
}