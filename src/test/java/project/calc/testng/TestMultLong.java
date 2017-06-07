package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMultLong extends BaseTest {

	@Test(dataProvider = "multDataProvider")
	@Parameters({ "a", "b", "expected" })
	public void testMultLong(double a, double b, double expected) {
		double multLong = calc.mult(a, b);
		Assert.assertEquals(multLong, expected);
	}

	@DataProvider(name = "multDataProvider")

	public Object[][] multDataProvider() {
		return new Object[][] { { 9, 9, 81 }, { 9, 0, 0 }, { -9, -3, 27 }, { -9, 3, -27 }

		};
	}
}