package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSqrtDouble extends BaseTest {

	@Test(dataProvider = "sqrtDataProvider")
	@Parameters({ "a", "expected" })
	public void testSqrtDouble(double a, double expected) {
		double sqrtDouble = calc.sqrt(a);
		Assert.assertEquals(sqrtDouble, expected);
	}

	@DataProvider(name = "sqrtDataProvider")

	public Object[][] sqrtDataProvider() {
		return new Object[][] { { 9.00, 3.00 }, { 0.00, 0.00 }, { 1.00, 1.00 }, { 1.23, 1.1090536506409416 },
				{ -9.00, 3.00 }

		};
	}
}