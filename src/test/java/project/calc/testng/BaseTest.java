package project.calc.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.epam.tat.module4.Calculator;

public class BaseTest {

	protected long startTime;
	protected Calculator calc;

	@BeforeMethod
	protected void setUp() {
		calc = new Calculator();
		startTime = System.currentTimeMillis();
	}

	@AfterMethod
	protected void afterTests() {
		System.out.println("tests execution time (ms): " + (System.currentTimeMillis() - startTime));
	}

}
