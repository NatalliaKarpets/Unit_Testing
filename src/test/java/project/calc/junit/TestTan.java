package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestTan extends BaseTest{
	private double a;
	private double expected;

		public TestTan(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 90, -1.99520041221 } };
		return Arrays.asList(data);
	}

	@Test
	public void Tan() {
		double tan = calc.tg(a);
		assertEquals(expected, tan, 0);

	}
}
