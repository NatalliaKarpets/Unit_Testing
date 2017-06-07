package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDivLong extends BaseTest {

	@Test(dataProvider = "divDataProvider")
	@Parameters({ "a", "b", "expected" })
	public void testDivLong(long a, long b, long expected) {
		long divLong = calc.div(a, b);
		Assert.assertEquals(divLong, expected);
	}

	@DataProvider(name = "divDataProvider")

	public Object[][] divDataProvider() {
		return new Object[][] { { 9, 9, 1 }, { -9, -3, 3 }

		};
	}
}