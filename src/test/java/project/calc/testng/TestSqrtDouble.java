package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestSqrtDouble extends BaseTest{
	
	@Test
	@Parameters({ "a", "expected" })
	public void testSqrtDouble(double a, double expected) {
		double sqrtDouble = calc.sqrt(a);
		Assert.assertEquals(sqrtDouble, expected);
	}
}
