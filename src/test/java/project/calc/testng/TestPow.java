package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestPow extends BaseTest{

	

	@Test 
	@Parameters({ "a", "b", "expected" })
	public void testPow(double a, double b, double expected) {
		double pow = calc.pow(a, b);
		Assert.assertEquals(pow, expected);
	}
}
