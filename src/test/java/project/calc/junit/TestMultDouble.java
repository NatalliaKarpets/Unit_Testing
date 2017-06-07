package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestMultDouble extends BaseTest {
	private double a;
	private double b;
	private double expected;

	public TestMultDouble(double a, double b, double expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 2.0, 2.0, 4.0 } };
		return Arrays.asList(data);
	}

	@Test
	public void MultDouble() {
		double multDouble = calc.mult(a, b);
		assertEquals(expected, multDouble, 0);

	}
}
