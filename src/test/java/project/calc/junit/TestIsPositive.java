package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestIsPositive extends BaseTest {

	private long a;
	private boolean expected;

	public TestIsPositive(long a, boolean expected) {
		this.a = a;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { -255, false }, { 0, false }, { 3, true } };
		return Arrays.asList(data);
	}

	@Test
	public void IsPositive() {
		boolean isPosLong = calc.isPositive(a);
		assertEquals(expected, isPosLong);

	}
}
