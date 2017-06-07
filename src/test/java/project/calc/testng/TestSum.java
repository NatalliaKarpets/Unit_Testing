package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSum extends BaseTest {

	@Test
	@Parameters({ "a", "b", "expected" })
	public void testSum(long a, long b, long expected) {
		long sum = calc.sum(a, b);
		Assert.assertEquals(sum, expected);
	}

	@Test(groups = "testGroup")
	@Parameters({ "a", "b", "expected" })
	public void testSum2(long a, long b, long expected) {
		long sum = calc.sum(a, b);
		Assert.assertEquals(sum, expected);
	}

}
