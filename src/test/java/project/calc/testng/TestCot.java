package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestCot extends BaseTest {

	@Test
	@Parameters({ "a", "expected" })
	public void testCot(double a, double expected) {
		double cot = calc.ctg(a);
		Assert.assertEquals(cot, expected);
	}
}
