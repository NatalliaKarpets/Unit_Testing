package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestIsNegative extends BaseTest {

	@Test(dataProvider = "isNegDataProvider")
	public void testNegative(long a, boolean expected) {
		boolean isNegLong = calc.isNegative(a);
		Assert.assertEquals(isNegLong, expected);
	}

	@DataProvider(name = "isNegDataProvider")
	public Object[][] isNegDataProvider() {
		return new Object[][] { { -255, true }, { 0, false }, { 3, false }

		};
	}
}
