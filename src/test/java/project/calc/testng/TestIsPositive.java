package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIsPositive {

	private static final long a = 1;

	@Test
	public void testPositive() {
		Assert.assertTrue(a > 0L);
	}
}
