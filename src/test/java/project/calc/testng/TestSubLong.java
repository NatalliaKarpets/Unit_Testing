package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestSubLong extends BaseTest {

	@Test
	@Parameters({ "a", "b", "expected" })
	public void testSubLong(long a, long b, long expected) {
		long subLong = calc.sub(a, b);
		Assert.assertEquals(subLong, expected);
	}
}
