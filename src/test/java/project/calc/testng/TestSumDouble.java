package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSumDouble extends BaseTest {

	@Test(dataProvider = "sumDataProvider")
	@Parameters({ "a", "b", "expected" })
	public void testSumDouble(double a, double b, double expected) {
		double sumDouble = calc.sum(a, b);
		Assert.assertEquals(sumDouble, expected);
	}

	@DataProvider(name = "sumDataProvider")

	public Object[][] sumDataProvider() {
		return new Object[][] { { 1.00, 1.23, 2.23 }, { 2.0, 2.0, 4.0 }, { 0.0, 0.0, 0.0 }, { -0.1, +0.1, 0.0 }

		};
	}
}