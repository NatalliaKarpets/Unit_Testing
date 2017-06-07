package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestSubLong extends BaseTest {
	private long a;
	private long b;
	private long expected;

	public TestSubLong(long a, long b, long expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 4, 2, 2 } };
		return Arrays.asList(data);
	}

	@Test
	public void DivLong() {
		long subLong = calc.sub(a, b);
		assertEquals(expected, subLong);

	}
}
