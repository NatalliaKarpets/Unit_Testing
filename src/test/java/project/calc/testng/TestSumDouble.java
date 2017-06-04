package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TestSumDouble extends BaseTest {

	@Test(dataProvider = "sumDataProvider")
	@Parameters({ "a", "b", "expected" })
	public void testSumDouble(double a, double b, double expected) {
		double sumDouble = calc.sum(a, b);
		Assert.assertEquals(sumDouble, expected);
	}
	@DataProvider(name = "sumDataProvider")

	public Object[][] sumDataProvider() {
		return new Object[][] { { 1, 1, 2 }, { 2, 2, 4 }

		};
	}
}