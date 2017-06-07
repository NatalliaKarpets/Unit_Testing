package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestMultLong extends BaseTest {
	private long a;
	private long b;
	private long expected;

	public TestMultLong(long a, long b, long expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 2, 2, 4 } };
		return Arrays.asList(data);
	}

	@Test
	public void MultLong() {
		long multLong = calc.mult(a, b);
		assertEquals(expected, multLong);

	}
}
