package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestTan extends BaseTest{

	
	@Test 
	@Parameters({ "a", "expected" })
	public void testTan(double a, double expected) {
		double tan = calc.tg(a);
		Assert.assertEquals(tan, expected);
	}
}
