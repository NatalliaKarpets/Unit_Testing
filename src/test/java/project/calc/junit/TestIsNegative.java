package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestIsNegative extends BaseTest {

	private long a;
	private boolean expected;

	public TestIsNegative(long a, boolean expected) {
		this.a = a;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { -255, true }, { 0, false }, { 3, false } };
		return Arrays.asList(data);
	}

	@Test
	public void IsNegative() {
		boolean isNegLong = calc.isNegative(a);
		assertEquals(expected, isNegLong);

	}
}
