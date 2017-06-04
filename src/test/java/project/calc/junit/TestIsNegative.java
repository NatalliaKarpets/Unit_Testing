package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;

import static org.testng.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestIsNegative {
	private long a;

		public TestIsNegative(long a) {
		this.a = a;
		
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { -1 } };
		return Arrays.asList(data);
	}

	@Test
	public void IsNegative() {
		
		assertTrue(a<0L);

	}
}
