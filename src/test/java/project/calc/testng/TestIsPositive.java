package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestIsPositive extends BaseTest {

	@Test(dataProvider = "isPosDataProvider")
	public void testPositive(long a, boolean expected) {
		boolean isPosLong = calc.isPositive(a);
		Assert.assertEquals(isPosLong, expected);
	}

	@DataProvider(name = "isPosDataProvider")
	public Object[][] isPosDataProvider() {
		return new Object[][] { { -255, false }, { 0, false }, { 3, true }

		};
	}
}
