package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestCot extends BaseTest {
	private double a;
	private double expected;

	public TestCot(double a, double expected) {
		this.a = a;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 90, -1.99520041221 } };
		return Arrays.asList(data);
	}

	@Test
	public void Cot() {
		double cot = calc.ctg(a);
		assertEquals(expected, cot, 0);

	}
}
