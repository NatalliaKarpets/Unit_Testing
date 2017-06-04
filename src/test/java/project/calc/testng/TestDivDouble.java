package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestDivDouble extends BaseTest {

	@Test
	@Parameters({ "a", "b", "expected" })
	public void testDivDouble(double a, double b, double expected) {
		double divDouble = calc.div(a, b);
		Assert.assertEquals(divDouble, expected);
	}

}
