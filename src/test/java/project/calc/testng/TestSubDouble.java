package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSubDouble extends BaseTest {

	@Test(dataProvider = "subDataProvider")
	@Parameters({ "a", "expected" })
	public void testSubDouble(double a, double b, double expected) {
		double subDouble = calc.sub(a, b);
		Assert.assertEquals(subDouble, expected);
	}

	@DataProvider(name = "subDataProvider")

	public Object[][] subDataProvider() {
		return new Object[][] { { 9.00, 9.00, 0.00 }, { 9.00, 10.00, -1.00 }, { -1.00, -2.23, -3.23 },
				{ 0.00, 0.00, 0.00 }

		};
	}
}