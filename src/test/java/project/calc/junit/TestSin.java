package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;


import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestSin extends BaseTest{
	private double a;
	private double expected;

		public TestSin(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 90, 0.8939966636005579 } };
		return Arrays.asList(data);
	}

	@Test
	public void Sin() {
		double sin = calc.sin(a);
		assertEquals(expected, sin, 0);

	}
}
