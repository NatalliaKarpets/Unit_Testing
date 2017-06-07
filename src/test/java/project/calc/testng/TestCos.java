package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCos extends BaseTest {

	@Test(dataProvider = "cosDataProvider")
	@Parameters({ "a", "expected" })
	public void testCos(double a, double expected) {
		double cosDouble = calc.cos(a);
		Assert.assertEquals(cosDouble, expected);
	}

	@DataProvider(name = "cosDataProvider")

	public Object[][] cosDataProvider() {
		return new Object[][] { { 90.00, -0.44807361612 }, { 0.00, 1.00 }, { -90.00, -0.44807361612 }

		};
	}
}