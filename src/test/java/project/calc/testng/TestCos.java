package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestCos extends BaseTest {

		
	@Test
	@Parameters({ "a", "expected" })
	public void testCos(double a, double expected) {
		double cos = calc.cos(a);
		Assert.assertEquals(cos, expected);
	}
}
