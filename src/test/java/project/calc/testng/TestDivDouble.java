package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDivDouble extends BaseTest {

	@Test(dataProvider = "divDataProvider")
	@Parameters({ "a", "b", "expected" })
	public void testDivDouble(double a, double b, double expected) {
		double divDouble = calc.div(a, b);
		Assert.assertEquals(divDouble, expected);
	}

	@DataProvider(name = "divDataProvider")

	public Object[][] divDataProvider() {
		return new Object[][] { { 9.00, 9.00, 1.00 }, { 9.00, 10.00, 0.9 }, { -9.00, -3.00, 3.00 }

		};
	}
}