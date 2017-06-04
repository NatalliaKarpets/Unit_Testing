package project.calc.junit;

import org.junit.Before;

import com.epam.tat.module4.Calculator;

public class BaseTest {

	protected Calculator calc;
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
}
