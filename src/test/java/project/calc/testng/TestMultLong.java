package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestMultLong extends BaseTest {

	
	@Test 
	@Parameters({ "a", "b", "expected" })
	public void testMultLong(long a, long b, long expected) {
		long multLong = calc.mult(a, b);
		Assert.assertEquals(multLong, expected);
	}
}
