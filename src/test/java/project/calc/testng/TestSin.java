package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestSin extends BaseTest{

	
	@Test 
	@Parameters({ "a",  "expected" })
	public void testSin(double a, double expected) {
		double sin = calc.sin(a);
		Assert.assertEquals(sin, expected);
	}
	
}
