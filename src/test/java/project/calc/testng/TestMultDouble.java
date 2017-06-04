package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestMultDouble extends BaseTest{

	@Test 
	@Parameters({ "a", "b", "expected" })
	public void testMultDouble(double a, double b, double expected) {
		double multDouble = calc.mult(a, b);
		Assert.assertEquals(multDouble, expected);
	}
}
