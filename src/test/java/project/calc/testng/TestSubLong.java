package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSubLong extends BaseTest {

	@Test(dataProvider = "subDataProvider")
	@Parameters({ "a", "expected" })
	public void testSubLong(long a, long b, long expected) {
		long subLong = calc.sub(a, b);
		Assert.assertEquals(subLong, expected);
	}

	@DataProvider(name = "subDataProvider")

	public Object[][] subDataProvider() {
		return new Object[][] { { 9, 9, 0 }, { 9, 10, -1 }, { -1, -2, -3 }, { 0, 0, 0 }

		};
	}
}