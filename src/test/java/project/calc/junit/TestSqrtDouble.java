package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestSqrtDouble extends BaseTest{
	private double a;
		private double expected;

		public TestSqrtDouble (double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 9.0, 3.0 } };
		return Arrays.asList(data);
	}

	@Test
	public void SqrtDouble() {
		double sqrtDouble = calc.sqrt(a);
		assertEquals(expected, sqrtDouble, 0);

	}
}
