package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestDivLong extends BaseTest{
	private long a;
	private long b;
	private long expected;

		public TestDivLong(long a, long b, long expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 2, 2, 1 } };
		return Arrays.asList(data);
	}

	@Test
	public void DivLong() {
		long divLong = calc.div(a, b);
		assertEquals(expected, divLong);

	}
}
