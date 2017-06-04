package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;


import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestCos extends BaseTest{
	private double a;
		private double expected;

		public TestCos(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 90, -0.44807361612 } };
		return Arrays.asList(data);
	}

	@Test
	public void Cos() {
		double cos = calc.cos(a);
		assertEquals(expected, cos, 0);

	}
}
