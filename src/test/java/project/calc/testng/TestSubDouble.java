package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestSubDouble extends BaseTest{

	@Test 
	@Parameters({ "a", "b", "expected" })
	public void testSubDouble (double a, double b, double expected) {
		double subDouble = calc.sub(a, b);
		Assert.assertEquals(subDouble, expected);
	}
	
}
