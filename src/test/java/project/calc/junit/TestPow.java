package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;


import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestPow extends BaseTest{
	private double a;
	private double b;
	private double expected;

		public TestPow(double a, double b, double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 2.0, 3.0, 8.0 } };
		return Arrays.asList(data);
	}

	@Test
	public void Pow() {
		double pow = calc.pow(a, b);
		assertEquals(expected, pow, 0);

	}
}
