package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMultDouble extends BaseTest {

	@Test(dataProvider = "multDataProvider")
	@Parameters({ "a", "b", "expected" })
	public void testMultDouble(double a, double b, double expected) {
		double multDouble = calc.mult(a, b);
		Assert.assertEquals(multDouble, expected);
	}

	@DataProvider(name = "multDataProvider")

	public Object[][] multDataProvider() {
		return new Object[][] { { 9.00, 9.00, 81.00 }, { 9.00, 0.00, 0.00 }, { -9.00, -3.00, 27.00 },
				{ -9.00, 3.00, -27.00 }

		};
	}
}